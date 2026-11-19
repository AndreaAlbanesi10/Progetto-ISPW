package model.roster;

public class Roster5vs5 extends AbstractRoster {

    private static final int CAPIENZA_MAX=10;

    public Roster5vs5() {
        super();
    }

    @Override
    public boolean isCompleto() {

        return (CAPIENZA_MAX== giocatori.size());
    }

}
