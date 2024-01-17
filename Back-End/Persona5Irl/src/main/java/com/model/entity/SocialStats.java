package com.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class SocialStats {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stats_id")
	private Integer statsId;
	
	private Integer charm;
	private Integer guts;
	private Integer kindness;
	private Integer knowledge;
	private Integer proficiency;
}
