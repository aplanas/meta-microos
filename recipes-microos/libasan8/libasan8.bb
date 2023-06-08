SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.0.1+git7231"

RPM_NAME = "libasan8-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "5a2da68cc8706484c5d716332dc02a80a77b5e167fdeb7016d7c80c9fcae69e5fc764d90a3d6cf06b143170b93683d32129b91a0e1699adb5cd0ac31c543cd09"

RPROVIDES:${PN} += "libasan.so.8()(64bit) libasan8 libasan8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
