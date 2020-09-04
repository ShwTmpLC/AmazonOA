https://leetcode.com/discuss/interview-question/313719/

class Solution {
  public int[] findMoviesOnFlight(int[] movie_duration, int target) {
    target = target - 30;  
    int minDiff = Integer.MAX_VALUE;
    
    Map<Integer, List<Integer>> durationToIndexesMap;
    pseudo: movie_duration.forEach(i, md -> durationToIndexesMap);
        
    Arrays.sort(movie_duration);
        
    // two pointers
    int start = 0, end = movie_duration.length - 1;
    while(start < end) {
      int sum = nums[start] + nums[end];
      int diff = target - sum;
      if (diff > 0 && compareToBeLargerOrSame) {
        minDiff = diff;
        update result;
      }
      if(sum < target) {
        start++;
      } else {
        end--;
      }
    }
    return result;
  }
}
