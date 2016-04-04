package com.microsoft.azure.management.resources.models.fluent.common;

import com.microsoft.azure.management.resources.fluentcore.model.Indexable;

import java.util.Map;

public interface Resource extends
		Indexable {
	
	public String type();
	public String name();
	public String region();
	public Map<String, String> tags();
	
	/**
	 * A resource definition allowing a region be selected for the resource
	 */	
	interface DefinitionWithRegion<T> {
		/**
		 * @param region The name of the location for the resource
		 * @return The next stage of the resource definition
		 */
	    T withRegion(String regionName);
	    
	    /**
	     * @param region The region for the resource
	     * @return The next stage of the resource definition
	     */
	    T withRegion(Region region);
	}
	
	
	/**
	 * A resource definition allowing tags to be specified
	 */
	interface DefinitionWithTags<T> extends Taggable<T> {
	}
}
