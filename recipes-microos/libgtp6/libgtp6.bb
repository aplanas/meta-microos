SUMMARY = "Library implementing GTP between SGSN and GGSN"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN."
LICENSE = "GPL-2.0-only"

PV = "1.10.1"

RPM_NAME = "libgtp6-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "5b3be484c54cb641a748213bcd9d3b3224d81a871fcd82837f76d02e07ecb414c7fe84bc28caeed7aa4b514368d4c6cfa23c70fa1d7f910049c079cb23a07f48"

RPROVIDES:${PN} += "libgtp.so.6()(64bit) \
libgtp6 \
libgtp6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libosmocore.so.20()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
