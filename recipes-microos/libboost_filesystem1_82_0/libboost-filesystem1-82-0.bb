SUMMARY = "Boost.Filesystem Runtime Libraries"
DESCRIPTION = "This package contains the Boost.Filesystem library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_filesystem1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "3656c27acbc6e21938c1df5186422c4f04244d24261e4920ea1ad69311b635b6a11a7b6b695658bbaaa72650058ff0fe80e765c5ab354539e7f0a1b40ff9a27f"

RPROVIDES:${PN} += "libboost_filesystem.so.1.82.0()(64bit) \
libboost_filesystem1_82_0 \
libboost_filesystem1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
