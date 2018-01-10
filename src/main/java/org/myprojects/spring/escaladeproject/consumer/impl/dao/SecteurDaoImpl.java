package org.myprojects.spring.escaladeproject.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.myprojects.spring.escaladeproject.consumer.contract.dao.SecteurDao;

import org.myprojects.spring.escaladeproject.model.Secteur;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class SecteurDaoImpl implements SecteurDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void create(Secteur secteur) {
		String sql="INSERT INTO secteur (nom,hauteur,idsite) VALUES (:nom,:hauteur,:idsite)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(secteur));	
		
	}

	public void delete(int idsecteur) {
		String sql ="DELETE FROM secteur WHERE idsecteur=:idsecteur";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Secteur(idsecteur)));	
		
	}

	public Secteur getById(int idsecteur) {
		String sql="SELECT * FROM secteur WHERE idsecteur=:idsecteur";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Secteur(idsecteur)), new SecteurMapper());
	}

	public List<Secteur> list() {
		String sql ="SELECT idsecteur,nom,hauteur,idsite FROM secteur";
		
		List<Secteur> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new SecteurMapper());
		return list;
	}

	public void update(Secteur secteur) {
		String sql="UPDATE secteur SET nom=:nom, hauteur=:hauteur,idsite=:idsite WHERE idsecteur=:idsecteur";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(secteur));
		
	}
	
	

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}



	public SqlParameterSource getSqlParameterByModel(Secteur secteur) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(secteur !=null) {
			paramSource.addValue("idsecteur", secteur.getIdsecteur());
			paramSource.addValue("nom", secteur.getNom());
			paramSource.addValue("hauteur", secteur.getHauteur());
			
		    paramSource.addValue("idsite", secteur.getSite());
		}
		return paramSource;
	}
	

	public SqlParameterSource getSqlParameterByModelone(Secteur secteur) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(secteur !=null) {
			paramSource.addValue("idsecteur", secteur.getIdsecteur());
			paramSource.addValue("nom", secteur.getNom());
			paramSource.addValue("hauteur", secteur.getHauteur());
			
		    paramSource.addValue("idsite", secteur.getSite().getIdsite());
		}
		return paramSource;
	}


	public static final class SecteurMapper implements RowMapper<Secteur>{
		public Secteur mapRow(ResultSet rs, int rowNum) throws SQLException{
			Secteur secteur = new Secteur();
			secteur.setIdsecteur(rs.getInt("idsecteur"));
			
			secteur.setNom(rs.getString("nom"));
			secteur.setHauteur(rs.getInt("hauteur"));
			
			Site site= new Site();
			site.setIdsite(rs.getInt("idsite"));
			secteur.setSite(site);
		
			
			return secteur;
		}
	}


}
