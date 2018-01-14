package org.myprojects.spring.escaladeproject.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.myprojects.spring.escaladeproject.consumer.contract.dao.SiteDao;
import org.myprojects.spring.escaladeproject.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
@Repository
public class SiteDaoImpl implements SiteDao{
		
	@Autowired
		NamedParameterJdbcTemplate namedParameterJdbcTemplate;
		
		
		public void create(Site site) {
			String sql="INSERT INTO site (nom,emplacement,hauteur,type) VALUES (:nom,:emplacement,:hauteur,:type)";
			namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(site));	
		}

		public void delete(int idsite) {
			String sql ="DELETE FROM site WHERE idsite=:idsite";
			namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Site(idsite)));	
			
		}

		public Site getById(int idsite) {
			String sql="SELECT * FROM site WHERE idsite=:idsite";
			return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Site(idsite)), new SiteMapper());
		}

		public List<Site> list() {
			String sql ="SELECT idsite,nom,emplacement,hauteur,type FROM site";
			
			List<Site> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new SiteMapper());
			return list;
		}
		
		public List<Site> findAllBySearchCriteria(String sqlStatement){
			List<Site> list= namedParameterJdbcTemplate.query(sqlStatement, getSqlParameterByModel(null), new SiteMapper());
	        return list;
	    }
		SqlParameterSource paramSource;
		
		
		
		

		public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
			return namedParameterJdbcTemplate;
		}



		public SqlParameterSource getSqlParameterByModel(Site site) {
			MapSqlParameterSource paramSource = new MapSqlParameterSource ();
			if(site !=null) {
				paramSource.addValue("idsite", site.getIdsite());
				paramSource.addValue("nom", site.getNom());
				paramSource.addValue("emplacement", site.getEmplacement());
				paramSource.addValue("hauteur", site.getHauteur());
				paramSource.addValue("type", site.getType());
				
			
			}
			return paramSource;
		}

		public static final class SiteMapper implements RowMapper<Site>{
			public Site mapRow(ResultSet rs, int rowNum) throws SQLException{
				Site site = new Site();
				site.setIdsite(rs.getInt("idsite"));
				site.setEmplacement(rs.getString("emplacement"));
				site.setNom(rs.getString("nom"));
				site.setHauteur(rs.getInt("hauteur"));
				site.setType(rs.getString("type"));
				return site;
			}
		}


		public void update(Site site) {
			String sql="UPDATE site SET nom=:nom, emplacement=:emplacement, hauteur=:hauteur, type=:type WHERE idsite=:idsite";
			namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(site));
		}

		

	}
