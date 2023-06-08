SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.101"

RPM_NAME = "libstorage-ng-utils-4.5.101-1.1.aarch64.rpm"
RPM_HASH = "dfe13e5549c5a3b739ad905286a3a8c2193d831dac7bbf5867cca22e142a958f08ad5a4b7dfe671827ad1b9f01f78eaacb0365e9fd0def4f8a1dad2cf0c57d2c"

RPROVIDES:${PN} += "libstorage-ng-utils libstorage-ng-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libstorage-ng.so.1()(64bit)"

inherit rpm
