SUMMARY = "Development files for the Osmocom GSUP client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-gsup-client."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client-devel-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "b4f0968249ac2c940eb2c0bdc0fceb7260d660cb2296144941d3a1f610c662adbf71cf15a16c3994f458e0a774e2ef9b3fd9db3cd8bf147e0496868f351f582c"

RPROVIDES:${PN} += "libosmo-gsup-client-devel libosmo-gsup-client-devel(aarch-64) pkgconfig(libosmo-gsup-client)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-gsup-client.so.0()(64bit) libosmo-gsup-client0 libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
