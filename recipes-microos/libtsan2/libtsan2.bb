SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.0.1+git7231"

RPM_NAME = "libtsan2-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "a19f3b45de31a63af644884b95b01819f6a0a24082c5f0d872c2052bfafba1a49b42624cb6a1c5cf749e22440961abb1b0939c35756680f7a9d4c28e3e5a6f9b"

RPROVIDES:${PN} += "libtsan.so.2()(64bit) libtsan2 libtsan2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
