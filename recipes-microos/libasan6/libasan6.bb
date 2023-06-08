SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "11.3.1+git2076"

RPM_NAME = "libasan6-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "c285ab30bce3849bd7681f1d45a3725aa64226b5ff2af80954bec69319ef8a29b801334059b2ebf4bb4bfeb3537353c1881926d5b7e98e83bdb62f55b1fed3b4"

RPROVIDES:${PN} += "libasan.so.6()(64bit) libasan6 libasan6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
