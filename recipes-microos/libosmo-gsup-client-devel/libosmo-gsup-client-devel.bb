SUMMARY = "Development files for the Osmocom GSUP client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-gsup-client."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client-devel-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "8cda1d8f7b01c65fa24f113b5c5442e4652275055813e30d7a7e4c4437e6073ec048e8f4380a211e69ad178c8055ef121cc329d37396f145156fe4cb7d7f256a"

RPROVIDES:${PN} += "libosmo-gsup-client-devel \
libosmo-gsup-client-devel(aarch-64) \
pkgconfig(libosmo-gsup-client)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmo-gsup-client.so.0()(64bit) \
libosmo-gsup-client0 \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
