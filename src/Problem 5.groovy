/**
 * Created by Jared on 1/5/14.
 */

class Problem5 {

    def static factor(int n) {
        return convertListOfFactorsIntoMap(Problem3.factor(n))
    }

    def static convertListOfFactorsIntoMap(def factors) {
        Map<Integer, Integer> factorMap = new HashMap<Integer, Integer>();
        factors.each { factor ->
            int count = factorMap.containsKey(factor) ? factorMap.get(factor) : 0;
            factorMap.put(factor, count + 1);
        }
        return factorMap
    }

    def static answer(){
        def factors = (2..20).collect {
            Problem5.factor(it)
        }
        println factors
        Set<Integer> keys = new HashSet<Integer>()

        factors.each { factorMap ->
            keys.addAll(factorMap.keySet())
        }
        def largestVals = new HashMap<Integer, Integer>()

        keys.each { key ->
            Integer largestVal = 0
            factors.each { factorMap ->
                if (factorMap.containsKey(key)) {
                    if (factorMap.get(key) > largestVal) {
                        largestVal = factorMap.get(key)
                    }

                }

            }
            largestVals.put(key, largestVal)
        }


        Integer product = 1
        largestVals.each{ key,  val ->
            println  ((int) (Math.pow((double) key,(double) val)))

            product *= ((int) (Math.pow((double) key,(double) val)))

        }

        return product
    }
}


