SUMMARY = "Game engine for action RPGs"
DESCRIPTION = "Solarus is a 2D game engine written in C++, and it executes games \
made in Lua. It is designed with 16-bit classic action RPGs in \
mind. \
 \
This package contains the 'solarus-run' executable required to run \
games based on the Solarus engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "19728b5d988d48298b4fc16de2f50a18381e72c62e34696245030181acc85d4db78462faad619513f10dffaa85ef90bd4fe4a9573b5fc8c37bb2a8c8b7795898"

RPROVIDES:${PN} += "solarus solarus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libsolarus.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
