package org.myprojects.spring.escaladeproject.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.myprojects.spring.escaladeproject.consumer.contract.dao.LongueurDao;
import org.myprojects.spring.escaladeproject.model.Longueur;
import org.myprojects.spring.escaladeproject.model.Voie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class LongueurDaoImpl implements LongueurDao{
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;


	public void create(Longueur longueur) {
		String sql="INSERT INTO longueur (cotation,nomrelais,hauteur,idvoie) VALUES (:cotation,:nomrelais,:hauteur,:idvoie)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(longueur));	
		
	}

	public void delete(int idlongueur) {
		String sql ="DELETE FROM longueur WHERE idlongueur=:idlongueur";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Longueur(idlongueur)));
		
	}

	public Longueur getById(int idlongueur) {
		String sql="SELECT * FROM longueur WHERE idlongueur=:idlongueur";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Longueur(idlongueur)), new LongueurMapper());
	}

	public List<Longueur> list() {
		String sql ="SELECT idlongueur,cotation,nomrelais,hauteur,idvoie FROM longueur";
		
		List<Longueur> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new LongueurMapper());
		return list;
	}

	public void update(Longueur longueur) {
		String sql="UPDATE longueur SET cotation=:cotation, nomrelais=:nomrelais, hauteur=:hauteur,idvoie=:idvoie WHERE idlongueur=:idlongueur";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(longueur));
		
	}
	
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}



	public SqlParameterSource getSqlParameterByModel(Longueur longueur) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(longueur !=null) {
			paramSource.addValue("idlongueur", longueur.getIdlongueur());
			paramSource.addValue("cotation", longueur.getCotation());
			paramSource.addValue("nomrelais", longueur.getNomrelais());
			paramSource.addValue("hauteur", longueur.getHauteur());
			
		    paramSource.addValue("idvoie", longueur.getVoie());
		}
		return paramSource;
	}
	

	public SqlParameterSource getSqlParameterByModelone(Longueur longueur) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(longueur !=null) {
			paramSource.addValue("idlongueur", longueur.getIdlongueur());
			paramSource.addValue("cotation", longueur.getCotation());
			paramSource.addValue("nomrelais", longueur.getNomrelais());
			paramSource.addValue("hauteur", longueur.getHauteur());
			
		    paramSource.addValue("idvoie", longueur.getVoie().getIdvoie());
		}
		return paramSource;
	}


	public static final class LongueurMapper implements RowMapper<Longueur>{
		public Longueur mapRow(ResultSet rs, int rowNum) throws SQLException{
			Longueur longueur = new Longueur();
			longueur.setIdlongueur(rs.getInt("idlongueur"));
			longueur.setCotation(rs.getString("cotation"));
			longueur.setNomrelais(rs.getString("nomrelais"));
			longueur.setHauteur(rs.getInt("hauteur"));
			
			Voie voie= new Voie();
			voie.setIdvoie(rs.getInt("idvoie"));
			longueur.setVoie(voie);
		
			
			return longueur;
		}
	}


}
