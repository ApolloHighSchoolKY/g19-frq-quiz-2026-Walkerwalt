public static String scrambleWord(String word){
  /* To be implemented in part (a) */
for(int i = 0; i < word.length() - 1; i ++)
{
  if (word.charAt(i) == 'A' && word.charAt(i+1 != 'A'))
  {
    word = word.substring(0, i) + word.charAt(i + 1) + "A" + word.substring(i + 1);
  }
}

  return word; 
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  String mem = "";
  
  for(int x = wordList.size() - 1 ; x>0; x--)
  {
    mem = wordList.get(x);

    if (scrambleWord(mem).equals(mem))
    {
      wordList.remove(x);
    }
    wordList.add(x, scrambleWord(mem));
  }

}
