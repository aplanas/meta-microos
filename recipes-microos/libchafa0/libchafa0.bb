SUMMARY = "Shared library for chafa"
DESCRIPTION = "The core of Chafa which converts all kinds of images, including \
animated image formats like GIFs, into ANSI/Unicode characters."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.4"

RPM_NAME = "libchafa0-1.12.4-1.3.aarch64.rpm"
RPM_HASH = "9b012cc297e0cfc41c855f45ba17c4318b4934ade9631b17ceb8621d90d4ecb646fa027d2dff7b50679b5fbf41f9220826738ce795020c5817b3943436b5c615"

RPROVIDES:${PN} += "libchafa.so.0()(64bit) libchafa0 libchafa0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
