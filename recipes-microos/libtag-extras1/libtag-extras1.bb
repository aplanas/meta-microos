SUMMARY = "Extra plugins for TagLib"
DESCRIPTION = "Unofficial TagLib file type plugins maintained by the Amarok project"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "libtag-extras1-1.0.1-24.16.aarch64.rpm"
RPM_HASH = "9e07648b1bfb652a77f1b2a65d78f3ef256bcf0ae822adb0117dfc34394091e0fa943c87a4a422e466b0c3a48c148d48004f8dc4ab39823814b8caf3c73ca7c7"

RPROVIDES:${PN} += "libtag-extras.so.1()(64bit) \
libtag-extras1 \
libtag-extras1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtag.so.1()(64bit)"

inherit rpm
