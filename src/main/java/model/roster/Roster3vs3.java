package model.roster;

public class Roster3vs3 extends AbstractRoster {

    private final int CAPIENZA_MAX=6;

    public Roster3vs3() {

    }

    @Override
    public boolean isCompleto() {
        if(CAPIENZA_MAX== giocatori.size()){
            return true;
        }
        return false;
    }

}
