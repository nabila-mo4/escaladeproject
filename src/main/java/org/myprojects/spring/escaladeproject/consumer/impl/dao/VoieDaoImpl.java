package org.myprojects.spring.escaladeproject.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.myprojects.spring.escaladeproject.consumer.contract.dao.VoieDao;

import org.myprojects.spring.escaladeproject.model.Secteur;

import org.myprojects.spring.escaladeproject.model.Voie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class VoieDaoImpl implements VoieDao{
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void create(Voie voie) {
		
		String sql="INSERT INTO voie (nom,nomhauteurvoie,hauteur,nbpoints,etat,idsecteur) VALUES (:nom,:nomhauteurvoie,:hauteur,:nbpoints,:etat,:idsecteur)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(voie));
		
		
	}

	public void delete(int idvoie) {
		String sql ="DELETE FROM voie WHERE idvoie=:idvoie";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Voie(idvoie)));	
		
	}

	public Voie getById(int idvoie) {
		String sql="SELECT * FROM voie WHERE idvoie=:idvoie";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Voie(idvoie)), new VoieMapper());
	}

	public List<Voie> list() {
		String sql ="SELECT * FROM voie";
		
		List<Voie> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(new Voie()), new VoieMapper());
		return list;
	}

	public void update(Voie voie) {
		String sql="UPDATE voie SET nom=:nom, nomhauteurvoie=:nomhauteurvoie, hauteur=:hauteur, nbpoints=:nbpoints, etat=:etat WHERE idvoie=:idvoie";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(voie));
		
	}
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}



	public SqlParameterSource getSqlParameterByModel(Voie voie) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(voie !=null) {
			paramSource.addValue("idvoie", voie.getIdvoie());
			paramSource.addValue("nom", voie.getNom());
			paramSource.addValue("nomhauteurvoie", voie.getNomhauteurvoie());
			paramSource.addValue("hauteur", voie.getHauteur());
			paramSource.addValue("nbpoints", voie.getNbpoints());
			paramSource.addValue("etat", voie.getEtat());
			paramSource.addValue("idsecteur", voie.getSecteur());
			
		
		}
		return paramSource;
	}
	
	public SqlParameterSource getSqlParameterByModelone(Voie voie) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(voie !=null) {
			paramSource.addValue("idvoie", voie.getIdvoie());
			paramSource.addValue("nom", voie.getNom());
			paramSource.addValue("nomhauteurvoie", voie.getNomhauteurvoie());
			paramSource.addValue("hauteur", voie.getHauteur());
			paramSource.addValue("nbpoints", voie.getNbpoints());
			paramSource.addValue("etat", voie.getEtat());
			
		    paramSource.addValue("idsecteur", voie.getSecteur().getIdsecteur());
		}
		return paramSource;
	}

	public static final class VoieMapper implements RowMapper<Voie>{
		public Voie mapRow(ResultSet rs, int rowNum) throws SQLException{
			Voie voie = new Voie();
			voie.setIdvoie(rs.getInt("idvoie"));
			voie.setNom(rs.getString("nom"));
			voie.setNomhauteurvoie(rs.getString("nomhauteurvoie"));
			voie.setHauteur(rs.getInt("hauteur"));
			voie.setNbpoints(rs.getInt("nbpoints"));
			voie.setEtat(rs.getString("etat"));
			Secteur secteur= new Secteur();
			secteur.setIdsecteur(rs.getInt("idsecteur"));
			voie.setSecteur(secteur);
			
			return voie;
		}
	}

	
	

}
