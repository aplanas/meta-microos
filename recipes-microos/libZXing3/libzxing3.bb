SUMMARY = "Library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides a C++ implementation."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "2.0.0"

RPM_NAME = "libZXing3-2.0.0-2.1.aarch64.rpm"
RPM_HASH = "010cf3e84fa72dae47759df239927deb10d93cfc08e0282cdccd5530054f96cc9b4bca46cc0974db7a1cf72cae6889c101c3db99e825a0dd48f3f3823c8ee35c"

RPROVIDES:${PN} += "libZXing.so.3()(64bit) libZXing3 libZXing3(aarch-64) libZXingCore3"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
