SUMMARY = "Multi-format unarchiver"
DESCRIPTION = "The Unarchiver is originally a Mac OS X application. This package \
contains a command-line variant of it. Unarchiver handles ZIP, ZIPX, \
RAR, 7z, tar, gzip, bzip2, lzma, xz, CAB, MSI, NSIS, some \
self-extracting EXEs, cpio, and further obscure and old formats, as \
well as disc images in ISO, BIN, MDF, NRG, CDI. It supports filenames \
in foreign character sets."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.7"

RPM_NAME = "unar-1.10.7-1.24.aarch64.rpm"
RPM_HASH = "c3a634d562fd02c632314beeb3de212aed60cc326b77114a431df7da2e4ce679a606ab0dc275c398a26a14e40c1ae8c9a3d84fa6698a3848ec344b0a8388f320"

RPROVIDES:${PN} += "unar unar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgnustep-base.so.1.29()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libobjc.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwavpack.so.1()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
