package com.example.demo

import org.intellij.lang.annotations.Language
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class Repository(private val namedParameterJdbcTemplate: NamedParameterJdbcTemplate) {

        private companion object {
            @Language("MySQL")
            const val SELECT_NAME_BY_ID =
            """
                SELECT name 
                FROM TestTable 
                WHERE id = :id
            """
        }


    fun getName(id: Int): List<String> {
        return namedParameterJdbcTemplate.query(
                SELECT_NAME_BY_ID,
                mapOf("id" to id)
        ) { rs, _ ->
            rs.getString("name")
        }

    }
}