// class Array {

//   public static int indexE(int arrLength, int firstIndex, int lastIndex){
//     int result = 0;
//  if (!(firstIndex<lastIndex) || (firstIndex<0) || !(firstIndex<arrLength) || !(lastIndex<=arrLength)) {
//       result = -666;
// }


// return result;
//   }
//   public static int sum(int[] arr){
//     int sum=0;

//     for(int i =0; i < arr.length; i ++){
//       sum += arr[i];
//     }
//     return sum;
//   }

// public static int sum(int[] arr,int firstIndex,int lastIndex){
// int sum=0;
//  if (!(firstIndex<lastIndex) || (firstIndex<0) || !(firstIndex<arr.length-1) || !(lastIndex<=arr.length-1)) {
//   return -666;
// }
// for(int i=firstIndex; i <= lastIndex; i++){
//   sum += arr[i];
// }

//   return sum;
// }

// public static double average(int[] arr){
//   int result = sum(arr);

//   return result/ arr.length;

// }

// public static double average(int[] arr,int firstIndex, int lastIndex){
//   int result = sum(arr, firstIndex, lastIndex);

//   return (result/(lastIndex - firstIndex+1));

// }

// public static int maxValue(int[] arr){
//   int maxi = arr[0];

//   for(int i =0; i < arr.length; i++){
//     if(arr[i] > maxi){
//       maxi = arr[i];
//     }
//   }

// return maxi;
// }

// public static int maxValue(int[] arr,int firstIndex,int lastIndex){
// int maxi;
// int indexCheck = indexE(arr.length, firstIndex, lastIndex);
// if(indexCheck == -666){
//   return -666;
// }
//     maxi = arr[firstIndex];
//     for(int i=firstIndex; i < lastIndex; i++){
//       if(arr[i] > maxi){
//         maxi = arr[i];
//       }
    
//   }

// return maxi;
// }

// public static int indexOfFirstMaxValue(int[] arr) {
//   int maxi = maxValue(arr);
//   for(int i=0; i < arr.length; i++){
//     if(arr[i] == maxi){
//       return i;
//     }
//   }

//   return 0;
// }

// public static int indexOfFirstMaxValue(int[] arr,int firstIndex,int lastIndex){
//   int maxi = maxValue(arr, firstIndex, lastIndex);
//   if(maxi == -666){
//     return -1;
//   }

//   for(int i =firstIndex; i <= lastIndex; i++){
//     if(arr[i] == maxi){
//       return i;
//     }
//   }

//   return -1;
// }

// public static int numberOfBelowAverageElements(int[] arr){
//  double av = average(arr);
//  int result = 0; 
//  for(int i =0; i < arr.length; i++){
//    if(arr[i] < av){
//      result++;
//    }
//  }
//  return result;
// }
// public static int numberOfBelowAverageElements(int[] arr, int firstIndex, int lastIndex){
//   int indexCheck = indexE(arr.length, firstIndex, lastIndex);
// if(indexCheck == -666){
//   return -666;
// }
// double av = average(arr, firstIndex, lastIndex);
// int result =0;
// for(int i =firstIndex; i < lastIndex; i++){
//   if(arr[i] < av){
//     result++;
//   }
// }
// return result;
// }

// public static void rotateElemenets(int[] arr){
//   int last = arr[arr.length-1];
//   for(int i =arr.length-1; i > 0; i--){
//     arr[i] = arr[i-1];
//   }
//   arr[0] = last;
// }

// public static void rotateElemenets(int[] arr, int rotationCount){
//   if(rotationCount > arr.length){
//     rotationCount %= arr.length;
//   }
// for(int i=0; i < rotationCount; i++){
//   rotateElemenets(arr);
// }
// }


// public static void reverseArray(int[] arr){

//   int last = arr.length-1;
//   for(int i = 0; i < last; i++){
//     int place = arr[i];
//     arr[i] = arr[last];
//     arr[last] = place;
//     last--;
//   }
// }
// }