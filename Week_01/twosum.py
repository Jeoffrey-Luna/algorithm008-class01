class Solution:
    def twoSum(self, nums, target):
        i = 0
        j = i+1
        indices = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i] == target - nums[j] and i !=j:
                   indices.append(i)
                   indices.append(j)
                   return indices
                j += 1
            i += 1
        
        

test  = [2,7,11,15]
test2 = [3,2,4]
t_target = 6
s = Solution()
r = s.twoSum(nums=test2,target = t_target )
print(r)