SUMMARY = "Libsocket Library for applications that use gdcm"
DESCRIPTION = "This package contains a shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "libsocketxx1_2-3.0.21-1.4.aarch64.rpm"
RPM_HASH = "7943de9c43eaf238b84cbcc550af1390d46ff77007a69534e52e249d9400cfff2a1f819409c1eb0b9c513b3b8762a7a409a68d47925ae14ff93c3416578427d1"

RPROVIDES:${PN} += "libsocketxx.so.1.2()(64bit) libsocketxx1_2 libsocketxx1_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
