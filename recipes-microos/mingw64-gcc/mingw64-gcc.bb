SUMMARY = "MinGW Windows compiler (GCC) for C"
DESCRIPTION = "MinGW Windows compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "cdcc56af0276e4686390038b15d95c0b2e2bd174cf4265c74f72c87b8533dff7c1d5b1be47e298d6f6c64e0a6710e92ba0228fc2268a639df752784e8af6c53e"

RPROVIDES:${PN} += "mingw64(lib:atomic) mingw64(lib:caf_single) mingw64(lib:gcc) mingw64(lib:gcc_eh) mingw64(lib:gcc_s) mingw64(lib:gcov) mingw64(lib:gomp) mingw64(lib:ssp) mingw64(lib:ssp_nonshared) mingw64(liblto_plugin.dll) mingw64-gcc mingw64-gcc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh mingw64(libgmp-10.dll) mingw64(libmpc-3.dll) mingw64(libmpfr-4.dll) mingw64(libwinpthread-1.dll) mingw64(libz.dll) mingw64-binutils mingw64-cpp mingw64-headers mingw64-runtime mingw64-winpthreads-devel"

inherit rpm
