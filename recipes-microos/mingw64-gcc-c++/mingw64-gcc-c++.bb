SUMMARY = "MinGW Windows compiler for C++"
DESCRIPTION = "MinGW Windows compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-c++-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "f83abc8960e77bce4798071be42d44e6f34a936604a94796869992cf78c7f9605cdf18c302e2ec91c2bbbcc1b88edc0279a12c707dc1d890995a6f3523f49ec9"

RPROVIDES:${PN} += "mingw64(lib:stdc++) \
mingw64(lib:stdc++fs) \
mingw64(lib:supc++) \
mingw64-gcc-c++ \
mingw64-gcc-c++(aarch-64)"
RDEPENDS:${PN} += "mingw64(libgmp-10.dll) \
mingw64(libmpc-3.dll) \
mingw64(libmpfr-4.dll) \
mingw64(libwinpthread-1.dll) \
mingw64(libz.dll) \
mingw64-libstdc++-gdb-printer"

inherit rpm
