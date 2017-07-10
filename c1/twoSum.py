# -*- coding: utf-8 -*-
"""
Created on Mon Jul 10 16:02:24 2017

@author: 34375

 Given an array of integers, return indices of the two numbers such 
 that they add up to a specific target.
 Given nums = [2, 7, 11, 15], target = 9,
 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 

"""

class Solution(object):
    def twoSum(self, nums, target):
        if len(nums) <= 1:
            return False
        buff_dict = {}
        for i in range(len(nums)):
            if nums[i] in buff_dict:
                return [buff_dict[nums[i]], i]
            else:
                buff_dict[target - nums[i]] = i
    a = twoSum(2,[3,2,4],6)
    print(a)
