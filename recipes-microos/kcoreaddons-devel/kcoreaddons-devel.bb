SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcoreaddons-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "8f47c10630c2467e94d6de34ae4cbca746642c51ae20aad5dc7349f0cd4d8f1c66021c2aab5ab89f34c6d61bbb1faf6649ad1c3956e9eb8bdc59bba2a19e203e"

RPROVIDES:${PN} += "cmake(KF5CoreAddons) kcoreaddons-devel kcoreaddons-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules kcoreaddons ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
