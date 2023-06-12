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

RPM_NAME = "python311-smmap-5.0.0-2.1.noarch.rpm"
RPM_HASH = "4d0e5e068f3bfaa710c028913a9391f981756f3da7d81b997eaa02e1c8c38e42aca7e850a47c6facbe8402d52a2a861f88708ae5774d74dec455cadccfec684c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(smmap) \
python311-smmap \
python3dist(smmap)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
