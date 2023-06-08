SUMMARY = "Osmocom GSUP (General Subscriber Update Protocol) client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client0-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "687b300016f28d03f76ab940da59018acc1e90e896ae17fccf690a2d2ad94b60ad86738072bb23756ad03d72e41e6ac35be6b004f9c37cd0d78f239c267a70cc"

RPROVIDES:${PN} += "libosmo-gsup-client.so.0()(64bit) libosmo-gsup-client0 libosmo-gsup-client0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
