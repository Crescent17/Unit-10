public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Bundesliga");
        Team<FootballPlayer> bayern = new Team<>("Bayern");
        Team<FootballPlayer> borussia = new Team<>("Borussia");
        Team<FootballPlayer> wolfsburg = new Team<>("Wolfsburg");
        Team<FootballPlayer> stuttgart = new Team<>("Stuttgart");
        borussia.matchResult(bayern, 4, 2);
        wolfsburg.matchResult(stuttgart, 1, 2);
        stuttgart.matchResult(bayern, 1, 3);
        bayern.matchResult(wolfsburg, 3, 0);
        footballLeague.add(bayern);
        footballLeague.add(borussia);
        footballLeague.add(wolfsburg);
        footballLeague.add(stuttgart);
        footballLeague.showLeagueTable();

        League<Team<BaseballPlayer>> baseballLeague = new League<>("MLB");
        Team<BaseballPlayer> boston = new Team<>("Boston");
        Team<BaseballPlayer> atlanta = new Team<>("Atlanta");
        Team<BaseballPlayer> toronto = new Team<>("Toronto");
        baseballLeague.add(boston);
        baseballLeague.add(atlanta);
        baseballLeague.add(toronto);
    }
}
