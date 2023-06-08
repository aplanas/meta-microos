SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python311-ndindex-1.6-1.1.aarch64.rpm"
RPM_HASH = "33d303db50776b1a854591956cf84a6f0f5346e2c23937f8b3c17a9fac8e0747a6481523b5c35d7b319b299d7d4048b5cb2b5560dbb1a6ba1a73fe6950f8f98e"

RPROVIDES:${PN} += "python3.11dist(ndindex) python311-ndindex python311-ndindex(aarch-64) python3dist(ndindex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
