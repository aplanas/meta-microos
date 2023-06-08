SUMMARY = "Osmocom GPRS Gb Interface (NS/BSSGP) library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogb library contains a GPRS BSSGP protocol implementation."
LICENSE = "AGPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmogb14-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "3c3114ad1e70d9d3b352ba5aa2d60d0f21d4d6eb133268efb9229b09878c1aa05b7839cef53d8106d04723464cd0d4db5c941fd1fc6f5c3c1a154a54fe2f935c"

RPROVIDES:${PN} += "libosmogb.so.14()(64bit) libosmogb.so.14(LIBOSMOGB_1.0)(64bit) libosmogb14 libosmogb14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
