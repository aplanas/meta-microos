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

RPM_NAME = "python39-smmap-5.0.0-2.1.noarch.rpm"
RPM_HASH = "44f9f35f8aee9c663a5dcefb4d40be508672066a2b404f7a353cb60f7c5680d499978a2871b91029943fc7ef68e3369d29951b8aea50fa734447eaec170dbbd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(smmap) \
python39-smmap \
python3dist(smmap)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
