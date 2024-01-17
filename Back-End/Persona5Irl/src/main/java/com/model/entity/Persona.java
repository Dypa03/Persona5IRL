package com.model.entity;

import com.model.enums.ArchetypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "persona_id")
	private Integer personaId;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private ArchetypeEnum archetype;
	
	private String description;
	
	@Column(name="image_url")
	private String imageUrl;
	
	
}
