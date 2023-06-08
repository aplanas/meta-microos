SUMMARY = "Simulation and synthesis tool for IEEE-1364"
DESCRIPTION = "Icarus Verilog is a Verilog compiler that generates a variety of \
engineering formats, including simulation. It strives to be true \
to the IEEE-1364 standard."
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "iverilog-11.0-1.11.aarch64.rpm"
RPM_HASH = "9e2358c28f8d49692fcec87bb28129530b2a5e0e296336d4e2c5855be187db1c0f8842c74314d1ed560239d5ee298151b6dd6e5aaf4f2609a7d2d282cfe722b2"

RPROVIDES:${PN} += "iverilog iverilog(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
