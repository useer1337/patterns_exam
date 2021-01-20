package com.company.behavioral.state;

import java.time.LocalDate;

/**
 *
 * Закончить с этим примером. Дописать, понять как робит.
 *
 * @author koval
 */
public class StartState extends State {

    public StartState() {
        description = "Opened at " + LocalDate.now();
    }

    @Override
    public void startProgress() {

    }

    @Override
    public void startTesting() {

    }

    @Override
    public void close() {

    }

    @Override
    public void open() {

    }

}
