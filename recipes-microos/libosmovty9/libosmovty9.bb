SUMMARY = "Osmocom VTY interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmovty9-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "7073eac2c01735bec30e5b01cebd17c7336e13f8241e6f2e76a91498252ac4f87bc874b70820a18319623e1ef52a7bee60cf66cfbb49de526c2a95aa32371a0c"

RPROVIDES:${PN} += "libosmovty.so.9()(64bit) libosmovty9 libosmovty9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
