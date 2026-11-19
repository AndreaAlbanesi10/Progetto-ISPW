package model.roster;

public class Roster3vs3 extends AbstractRoster {

    private static final int CAPIENZA_MAX=6;

    public Roster3vs3() {
        super();
    }

    @Override
    public boolean isCompleto() {

        return (CAPIENZA_MAX== giocatori.size());
    }

}
