package org.primefaces.test;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

@Named
@RequestScoped
public class FileUploadView {

	private UploadedFile file;

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(final UploadedFile file) {
		this.file = file;
	}

	public void handleFileUpload(final FileUploadEvent event) throws Exception {
		Thread.sleep(5_000L);
		final FacesMessage message = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void buttonClick() throws Exception {
		Thread.sleep(5_000L);
		final FacesMessage message = new FacesMessage("Successful received button click.");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}