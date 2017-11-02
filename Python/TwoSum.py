# -*- coding: utf-8 -*-
"""
Created on Thu Nov  2 00:43:42 2017

@author: Ankit
"""

def twoSum(nums,target):
    diffDict = {};
    for i in range(len(nums)):
        diff = target - nums[i];
        print (diff);
        if nums[i] in diffDict:
            return [diffDict[nums[i]],i];
        diffDict[diff] = i;
    print(diffDict);
    return []