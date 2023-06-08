SUMMARY = "A pure python implementation of a sliding window memory map manager"
DESCRIPTION = "When reading from many possibly large files in a fashion similar to random \
access, it is usually the fastest and most efficient to use memory maps. \
Although memory maps have many advantages, they represent a very limited \
system resource as every map uses one file descriptor, whose amount is \
limited per process. On 32 bit systems, the amount of memory you can have \
mapped at a time is naturally limited to theoretical 4GB of memory, which \
may not be enough for some applications. \
 \
The documentation can be found here: http://packages.python.org/smmap"
LICENSE = "BSD-2-Clause"

PV = "5.0.0"

RPM_NAME = "python310-smmap-5.0.0-2.1.noarch.rpm"
RPM_HASH = "70016acf999b27e13f8ddd7ce64b5a885430a24da9b601aa16a7c024976a3f8ce0a4c0173b73c873f75cf78b1209333eff595a37dbc096e1bdcff205bca13fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smmap python3.10dist(smmap) python310-smmap python3dist(smmap)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
