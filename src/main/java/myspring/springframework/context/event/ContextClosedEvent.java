package myspring.springframework.context.event;

import myspring.springframework.context.AbstractApplicationEvent;

/**
 * @author Ryan
 */
public class ContextClosedEvent extends AbstractApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
