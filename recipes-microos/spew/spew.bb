SUMMARY = "An I/O performance measurement and load generation tool"
DESCRIPTION = "Spew is used to measure I/O performance of character devices, block devices, \
and regular files. It can also be used to generate high I/O loads to stress \
systems while verifying data integrity. \
 \
Spew is easy to use and is flexible. No configuration files or complicated \
client/server configurations are needed. Spew also generates its own data \
patterns that are designed to make it easy to find and debug data integrity \
problems."
LICENSE = "GPL-2.0-only"

PV = "1.0.8"

RPM_NAME = "spew-1.0.8-5.10.aarch64.rpm"
RPM_HASH = "e9a7949d07461c7584a964858edbc62cd3aa24dfcfa126b04c56bd68d905f083e815012d8d77b6bbf305c0d9a9c7ab46cea780b9489cd0e29412d7f687b1cb56"

RPROVIDES:${PN} += "config(spew) \
spew \
spew(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
