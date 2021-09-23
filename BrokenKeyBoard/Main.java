class Main {
  public static void main(String[] args) {
    String s = "hello, world! hell fort";
    char[] c = {'l','e','o','h', 'w', 'd', '!', 'r', ','};

    System.out.println(Main.cW(s,c));
  }

  static int cW(String text, char[] letters){

    String[] s1 = text.split("\\s");
    String[] check = new String[s1.length];

    for(int i = 0; i < check.length; i++){
        check[i] = "";
        for(int j = 0; j < s1[i].length(); j++){
              check[i] += "0";
        }
    }

    int res = 0;

    for(int i = 0; i < s1.length; i++){
      for(int j = 0; j < s1[i].length(); j++){
        for(int k = 0; k < letters.length; k++){
          if(s1[i].charAt(j) == letters[k]){
            s1[i] = s1[i].replace(s1[i].charAt(j),  '0');
          }
        }
      }
    }

    for(int i = 0; i < s1.length; i++){
      if(s1[i].equals(check[i])) res++;
    }

    return res;
  }
}