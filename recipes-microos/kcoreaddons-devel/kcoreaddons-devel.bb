SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcoreaddons-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c8961d5820f1eb9210d69037d6d966b28261ecce5d0b5ae2caa3423d1919300016780dfac7481fe81a67483d2141fb43a4a096d889e9c6622732dc7b960dcccf"

RPROVIDES:${PN} += "cmake(KF5CoreAddons) \
kcoreaddons-devel \
kcoreaddons-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
extra-cmake-modules \
kcoreaddons \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
