SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python39-ssdeep-3.4.1-1.4.aarch64.rpm"
RPM_HASH = "2fc8fb52535e704fc21fdcb21dee50ea1585dd244c832055e3edb75811264dc5b6f8290e9905d4e14ea84073a858d222b6b5d424100a1b3a2b86b8093b72f684"

RPROVIDES:${PN} += "python3.9dist(ssdeep) \
python39-ssdeep \
python39-ssdeep(aarch-64) \
python3dist(ssdeep)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfuzzy.so.2()(64bit) \
python(abi) \
python39-cffi \
ssdeep"

inherit rpm
