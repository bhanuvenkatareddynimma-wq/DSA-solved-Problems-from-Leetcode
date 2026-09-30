class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    return[i,j]
                

    
'''nums=[]

n=int(input())

for i in range(n):
    j=int(input())
    nums.append(j)

target=int(input())

obj=Solution()

print(obj.twoSum(nums,target))'''
    