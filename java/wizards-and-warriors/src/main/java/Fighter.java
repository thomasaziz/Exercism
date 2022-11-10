abstract class Fighter {
    boolean vulnerableStatus;
    String fighterType;

    boolean isVulnerable() {
        return this.vulnerableStatus;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    public Warrior(){
        this.vulnerableStatus = false;
        this.fighterType = "Warrior";
    }
    
    @Override
    public String toString() {
        return "Fighter is a " + super.fighterType;
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()){
            return 10;
        }

        return 6;
    }
}

class Wizard extends Fighter {
    boolean spellPrepared = false;

    public Wizard(){
        this.fighterType = "Wizard";
        this.vulnerableStatus = isVulnerable();
    }

    @Override
    boolean isVulnerable() {
        if (spellPrepared){
            return false;
        }

        return true;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (isVulnerable()){
            return 3;
        }
        
        return 12;
    }

    void prepareSpell() {
        this.spellPrepared = true;
    }

    @Override
    public String toString(){
        return "Fighter is a " +super.fighterType;
    }

}
