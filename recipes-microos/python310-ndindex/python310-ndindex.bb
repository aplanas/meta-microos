SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python310-ndindex-1.6-1.1.aarch64.rpm"
RPM_HASH = "0d71e03748e8188b913ecadcadd4da95c438ad98b195479d96b56f894cd3f06250542c22d3b1456d6ec41852c19182cabde4ccf465aa0b42362220120c90a7a3"

RPROVIDES:${PN} += "python3-ndindex python3.10dist(ndindex) python310-ndindex python310-ndindex(aarch-64) python3dist(ndindex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
