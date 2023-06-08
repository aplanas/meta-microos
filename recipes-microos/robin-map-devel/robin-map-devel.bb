SUMMARY = "C++ implementation of a fast hash map and hash set using robin hood hashing"
DESCRIPTION = "The robin-map library is a C++ implementation of a fast hash map and hash set \
using open-addressing and linear robin hood hashing with backward shift \
deletion to resolve collisions. \
 \
Four classes are provided: tsl::robin_map, tsl::robin_set, tsl::robin_pg_map \
and tsl::robin_pg_set. The first two are faster and use a power of two growth \
policy, the last two use a prime growth policy instead and are able to cope \
better with a poor hash function. Use the prime version if there is a chance of \
repeating patterns in the lower bits of your hash (e.g. you are storing \
pointers with an identity hash function). See GrowthPolicy for details. \
 \
A benchmark of tsl::robin_map against other hash maps may be found here. This \
page also gives some advices on which hash table structure you should try for \
your use case (useful if you are a bit lost with the multiple hash tables \
implementations in the tsl namespace)."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "robin-map-devel-1.0.1-1.4.noarch.rpm"
RPM_HASH = "e93ed6b65077b745ec3afa102dc044b597fd85e52f58df113a2da7122b7b6040a68922a4db3e64fa70de9f4d024e64b07e2ebe64d15b178124c9c13d1ca8de37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(tsl-robin-map) robin-map-devel"
RDEPENDS:${PN} += ""

inherit rpm
