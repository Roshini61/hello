def firstRepeatingElement(arr, n):
  # Nested loop to check for repeating elements
  for i in range(n):
    for j in range(i+1, n):
      # If a repeating element is found, return its index
      if arr[i] == arr[j]:
        return i
       
  # If no repeating element is found, return -1
  return -1
def lastRepeatingElement(arr, n):
    # Initialize a dictionary to store the last index of each element
    last_index = {}
    # Initialize a variable to store the index of the last repeating element found so far
    last_repeating_index = -1

    # Traverse the array from right to left
    for i in range(n - 1, -1, -1):
        # If the element is encountered for the first time, store its index
        if arr[i] not in last_index:
            last_index[arr[i]] = i
        else:
            # If the element is repeating, update the last repeating index
            last_repeating_index = max(last_repeating_index, last_index[arr[i]])

    # If no repeating element is found, return -1
    if last_repeating_index == -1:
        return -1
    else:
        return last_repeating_index
# Driver code
if __name__ == '__main__':
  # Initializing an array and its size
  arr = [10, 5, 3, 4, 3, 5, 6]
  n = len(arr)
   
  # Finding the index of first repeating element
  index = firstRepeatingElement(arr, n)
   
  # Checking if any repeating element is found or not
  if index == -1:
      print("No repeating element found!")
  else:
      # Printing the first repeating element and its index
      print("First repeating element is", arr[index])
    
