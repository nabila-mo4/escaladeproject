package org.myprojects.spring.escaladeproject.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.myprojects.spring.escaladeproject.consumer.contract.dao.CommentaireDao;
import org.myprojects.spring.escaladeproject.consumer.impl.dao.SecteurDaoImpl.SecteurMapper;
import org.myprojects.spring.escaladeproject.model.Commentaire;
import org.myprojects.spring.escaladeproject.model.Secteur;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;


@Repository
public class CommentaireDaoImpl implements CommentaireDao{
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;


	public void create(Commentaire commentaire) {
		
		String sql="INSERT INTO commentaire (nomutilisateur,contenu,idsite) VALUES (:nomutilisateur,:contenu,:idsite)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(commentaire));	
		
		
	}

	public List<Commentaire> list(int idsite) {
		
		String sql ="SELECT idcommentaire,nomutilisateur,contenu,idsite FROM commentaire WHERE idsite=:idsite";
		
		List<Commentaire> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new CommentaireMapper());
		return list;
	}
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}



	public SqlParameterSource getSqlParameterByModel(Commentaire commentaire) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(commentaire !=null) {
			paramSource.addValue("idcommentaire", commentaire.getIdcommentaire());
			paramSource.addValue("nomutilisateur", commentaire.getNomutilisateur());
			paramSource.addValue("contenu", commentaire.getContenu());
			
		    paramSource.addValue("idsite", commentaire.getSite());
		}
		return paramSource;
	}
	
	

	public SqlParameterSource getSqlParameterByModelone(Commentaire commentaire) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(commentaire !=null) {
			paramSource.addValue("idcommentaire", commentaire.getIdcommentaire());
			paramSource.addValue("nomutilisateur", commentaire.getNomutilisateur());
			paramSource.addValue("contenu", commentaire.getContenu());
			
		    paramSource.addValue("idsite", commentaire.getSite().getIdsite());
		}
		return paramSource;
	}


	public static final class CommentaireMapper implements RowMapper<Commentaire>{
		public Commentaire mapRow(ResultSet rs, int rowNum) throws SQLException{
			Commentaire commentaire = new Commentaire();
			commentaire.setIdcommentaire(rs.getInt("idcommentaire"));
			
			commentaire.setNomutilisateur(rs.getString("nomutilisateur"));
			commentaire.setContenu(rs.getString("contenu"));
			
			Site site= new Site();
			site.setIdsite(rs.getInt("idsite"));
			commentaire.setSite(site);
		
			
			return commentaire;
		}
	}

}
