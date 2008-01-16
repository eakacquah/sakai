package org.sakaiproject.scorm.service.api;

import java.io.InputStream;
import java.util.List;

import org.sakaiproject.scorm.model.api.Archive;
import org.sakaiproject.scorm.model.api.ContentPackageManifest;
import org.sakaiproject.scorm.model.api.ContentPackageResource;
import org.sakaiproject.scorm.model.api.SessionBean;

public interface ScormResourceService {

	public String convertArchive(String resourceId);
	
	public Archive getArchive(String resourceId);
	
	public InputStream getArchiveStream(String resourceId);
	
	public ContentPackageManifest getManifest(String manifestResourceId);
	
	public int getMaximumUploadFileSize();
	
	public ContentPackageResource getResource(SessionBean sessionBean);
	
	public ContentPackageResource getResource(String resourceId, String path);
	
	public List<ContentPackageResource> getResources(String archiveResourceId);
		
	public List<Archive> getUnvalidatedArchives();
	
	public String putArchive(InputStream stream, String name, String mimeType, boolean isHidden);
	
	public String putManifest(String resourceId, ContentPackageManifest manifest);
	
	public String removeArchive(String resourceId);
	
	public void removeManifest(String resourceId, String manifestResourceId);
	
}
