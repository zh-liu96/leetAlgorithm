class Solution:
    # @param {int[]} A an integer array
    # @return nothing
    def sortIntegers(self, A):
        # Write your code here
        for i in range(1, len(A)):
            key = A[i]
            j = i - 1
            while j >=0 :
                if A[j] > key:
                    A[j+1] = A[j]
                    A[j] = key
                j -= 1
        return A