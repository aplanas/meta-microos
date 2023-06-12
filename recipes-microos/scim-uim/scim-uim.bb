SUMMARY = "UIM Input Method Engine for SCIM"
DESCRIPTION = "UIM Input Method Engine for SCIM. \
 \
 \
 \
Authors: \
-------- \
    James Su <suzhe@tsinghua.org.cn>"
LICENSE = "GPL-2.0+"

PV = "0.2.0"

RPM_NAME = "scim-uim-0.2.0-225.27.aarch64.rpm"
RPM_HASH = "e77ddd41985603b4c03abc2d7aab9e31fce8f994b946d506b407596a2672565fb49517e6e3634ba937b4716c75cbbdf76b7ae79f06aedf5dddc4e5c57cc7617a"

RPROVIDES:${PN} += "scim-uim \
scim-uim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libscim-1.0.so.8()(64bit) \
libscim-1.0.so.8(LIBSCIM_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuim-scm.so.0()(64bit) \
libuim.so.8()(64bit)"

inherit rpm
