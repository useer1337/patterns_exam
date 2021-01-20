package com.company.behavioral.roc;

/**
 * @author koval
 */
public class Panel extends Component {

    @Override
    public String showHelp() {
        System.out.println("Panel прошла");
        return super.showHelp();
    }
}
