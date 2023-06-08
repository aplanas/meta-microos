SUMMARY = "Osmocom USB library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmousb0-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "11f6f7c2b820ef4382aa681f84246308f132d105fc6d5682a8eb04d99f23b020e3f4b0b945e9a3909accc34af89ba2dc7017d2862d441a1a7db277d035bb0e4a"

RPROVIDES:${PN} += "libosmousb.so.0()(64bit) libosmousb0 libosmousb0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
