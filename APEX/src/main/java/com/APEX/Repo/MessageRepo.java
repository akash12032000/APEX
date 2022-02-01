package com.APEX.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APEX.Model.APEXMessages;

public interface MessageRepo extends JpaRepository<APEXMessages, Integer>{

}
