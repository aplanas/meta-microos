SUMMARY = "RPG Maker 2000/2003 and EasyRPG game data library"
DESCRIPTION = "liblcf is a library to handle RPG Maker 2000/2003 and EasyRPG game data. \
It can read and write LCF and XML files."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "liblcf0-0.6.2-2.11.aarch64.rpm"
RPM_HASH = "a917420b541c0d86f79e62efa3592d281f12765d7950c777d0efaa853e2c4481ada94d246a58fc61f3e09e460dd35d828c30f29bfb62363e5db0ba230b429356"

RPROVIDES:${PN} += "liblcf.so.0()(64bit) liblcf0 liblcf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
