SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python310-BitVector-3.5.0-1.8.noarch.rpm"
RPM_HASH = "35f99bc192207a68204d0cc122539c47a18b661d69d385702030fdbe287d75d129a8f9e4479f06e9d93a02a028da7b03c7889da1714a24cdac14a89d0795b5ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-BitVector \
python3.10dist(bitvector) \
python310-BitVector \
python3dist(bitvector)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
