SUMMARY = "Virtual Tape Library system"
DESCRIPTION = "A Virtual Tape & Library system. \
 \
This package is composed of a KMP (mhvtl), which is also a psuedo HBA."
LICENSE = "GPL-2.0-only"

PV = "1.70_release+865.af13081a1ae5"

RPM_NAME = "mhvtl-1.70_release+865.af13081a1ae5-2.20.aarch64.rpm"
RPM_HASH = "272632dd857fd01289a4974a6b3febc75987002fc70b3930094984237b4412ab3c7bd6769ded027259b0318b8282990ad3f391033b378382c7f36b55308dec0b"

RPROVIDES:${PN} += "config(mhvtl) libvtlcart.so()(64bit) libvtlscsi.so()(64bit) mhvtl mhvtl(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) mhvtl-kmp module-init-tools sg3_utils"

inherit rpm
