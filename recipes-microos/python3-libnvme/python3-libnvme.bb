SUMMARY = "Python binding for libnvme"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "python3-libnvme-1.4-1.1.aarch64.rpm"
RPM_HASH = "560f7ac6e52cc50e6d5022f79165b326c2aad8176a8a2f2583607b2a346913652f500585c28bc3f927f340a0fc532d61b46705b3cb02f370962c85d7f28a38e8"

RPROVIDES:${PN} += "python3-libnvme \
python3-libnvme(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libnvme.so.1()(64bit) \
libnvme.so.1(LIBNVME_1_0)(64bit) \
libnvme.so.1(LIBNVME_1_2)(64bit) \
python(abi)"

inherit rpm
