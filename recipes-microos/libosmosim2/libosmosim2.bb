SUMMARY = "Osmocom SIM card related utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosim library in particular contains routines for SIM card \
access."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmosim2-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "d95804661b5722890af774b815007299f29ae323264b269ebff7e6597b74cd07d3a8de60cd8bfbb21344125522b15d8cd1c9c5b58be9197a31c1d1df4add0550"

RPROVIDES:${PN} += "libosmosim.so.2()(64bit) libosmosim2 libosmosim2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libpcsclite.so.1()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
