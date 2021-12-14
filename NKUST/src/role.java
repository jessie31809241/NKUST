public class role {
    int hp;
    int att;
    int mp;
    String name;

    role (String Name,int Hp,int Att, int Mp){
        name = Name;
        hp = Hp;
        att = Att;
        mp = Mp;
    }
    void get() {
        System.out.println(this.name);
        System.out.println(this.hp);
        System.out.println(this.att);
        System.out.println(this.mp);
    }

}
