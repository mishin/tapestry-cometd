package org.lazan.t5.cometd.services;

import org.apache.tapestry5.EventContext;
import org.apache.tapestry5.services.Session;


public class ClientContext {
	private final String channelId;
    private final String activePageName;
    private final String containingPageName;
    private final String nestedComponentId;
    private final String eventType;
    private final String topic;
    private final EventContext pageActivationContext;
    private final Session session;
    
	public ClientContext(String channelId, String activePageName, String containingPageName, String nestedComponentId, 
			String eventType, String topic, Session session, EventContext pageActivationContext) {
		super();
		this.channelId = channelId;
		this.activePageName = activePageName;
		this.containingPageName = containingPageName;
		this.nestedComponentId = nestedComponentId;
		this.eventType = eventType;
		this.topic = topic;
		this.session = session;
		this.pageActivationContext = pageActivationContext;
	}
	
	public String getChannelId() {
		return channelId;
	}

	public String getActivePageName() {
		return activePageName;
	}

	public String getContainingPageName() {
		return containingPageName;
	}

	public String getNestedComponentId() {
		return nestedComponentId;
	}

	public String getEventType() {
		return eventType;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public Session getSession() {
		return session;
	}
	
	public EventContext getPageActivationContext() {
		return pageActivationContext;
	}
}
