SUMMARY = "Library to extract, create, modify, and mount WIM files"
DESCRIPTION = "wimlib is a C library for creating, extracting, modifying, and mounting files in \
the Windows Imaging Format (WIM files)."
LICENSE = "CC0-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.13.6"

RPM_NAME = "libwim15-1.13.6-1.4.aarch64.rpm"
RPM_HASH = "861be1a89cdc255fd9c48ab8fa548d1692dedd3c1750964655873055be5e55d578a4066e45b021033699a664f6aafd801e26d2b0449adebff418f922a08d9faf"

RPROVIDES:${PN} += "libwim.so.15()(64bit) libwim15 libwim15(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libntfs-3g.so.89()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit)"

inherit rpm
