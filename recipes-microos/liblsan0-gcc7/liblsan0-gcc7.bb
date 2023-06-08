SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "liblsan0-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "a6f1dbcb67aa1e400e92f95f467463663cb528b4dbf467863c0d7ad9684c7bb003a765e85624c3df9c01490fdac1bcf5e4c469909c45d10e4d11c8fcf4ee5ce9"

RPROVIDES:${PN} += "liblsan.so.0()(64bit) liblsan0 liblsan0-gcc7 liblsan0-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
