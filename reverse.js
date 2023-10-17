function reverseWordsInSentence(sentence) {

    var words = sentence.split(' ');
  
    
    var reversedWords = words.map(function(word) {
      return word.split('').reverse().join('');
    });
  
   
    var reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  // Example usage:
  var inputSentence = "This is a sunny day";
  var reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence); // Output: "sihT si a ynnus yad"
  