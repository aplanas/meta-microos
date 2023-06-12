SUMMARY = "Osmocom SIM card related utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosim library in particular contains routines for SIM card \
access."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmosim2-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "bd8acffa01b99f435291c9832a480a7bcf498a4095ccb9f3327fb4d4b2bbe353de077c41c56654fe89fc1730e1b31e7a006c79e0915bfef6201213be086f5238"

RPROVIDES:${PN} += "libosmosim.so.2()(64bit) libosmosim2 libosmosim2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libpcsclite.so.1()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
