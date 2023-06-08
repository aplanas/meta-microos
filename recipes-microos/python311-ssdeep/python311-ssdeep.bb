SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python311-ssdeep-3.4.1-1.4.aarch64.rpm"
RPM_HASH = "c2a8faa5bd8b742da0dd9e23902f9b1c7af8580b55dfd6b5f92544c8a84ddc2f1e4fff1e4b316604aa91b29881e83998971c4209d1c831ff6d882dd5af8f4352"

RPROVIDES:${PN} += "python3.11dist(ssdeep) python311-ssdeep python311-ssdeep(aarch-64) python3dist(ssdeep)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfuzzy.so.2()(64bit) python(abi) python311-cffi ssdeep"

inherit rpm
