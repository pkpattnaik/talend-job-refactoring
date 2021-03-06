package de.jlo.talend.tweak.model.tasks;

import de.jlo.talend.tweak.model.TalendModel;

public abstract class AbstractTask {

	private TalendModel model = null;
	
	public AbstractTask(TalendModel model) {
		this.model = model;
	}

	public TalendModel getModel() {
		return model;
	}

	public void setModel(TalendModel model) {
		this.model = model;
	}
	
	public abstract void execute() throws Exception;

}
