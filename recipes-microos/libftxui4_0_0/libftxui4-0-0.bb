SUMMARY = "A C++ library for terminal based user interfaces"
DESCRIPTION = "A C++ library for terminal based user interfaces."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "libftxui4_0_0-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "2cc2d86d37fe7134ababf6960e1584004996a91555dc48472f439a77044be4079df9a2d4d5235fae9c89c9b24998b64167b4120823eb34481c2db28dabb675cd"

RPROVIDES:${PN} += "libftxui-component.so.4.0.0()(64bit) libftxui-dom.so.4.0.0()(64bit) libftxui-screen.so.4.0.0()(64bit) libftxui4_0_0 libftxui4_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
