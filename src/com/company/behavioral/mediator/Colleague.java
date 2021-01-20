package com.company.behavioral.mediator;

import java.util.Objects;

/**
 * @author koval
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.sendMessage(this, message);
    }

    public abstract void notify(String message);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colleague colleague = (Colleague) o;
        return Objects.equals(mediator, colleague.mediator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator);
    }
}
