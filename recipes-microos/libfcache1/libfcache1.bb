SUMMARY = "Library to provide generic file data cache functions"
DESCRIPTION = "Library to provide generic file data cache functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libfcache1-20230115-1.2.aarch64.rpm"
RPM_HASH = "7505aae169c60f4b219b8a89707398f96034059c3fe91a08e24901842cf6c91e4a602c4bdf2dd6dcf5cba9c946e4fc6cbdf7535bccb31b5459e2eb4084cad0b1"

RPROVIDES:${PN} += "libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfcache1 libfcache1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit)"

inherit rpm
