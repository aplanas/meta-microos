SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libasan4-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "8839c5a0c72494c34c63f156ad0340c050b3b8676544cf7315d28c12053c3e2d54789d1a7fa931c219c70afc2a7e6d79639fdd11d8230154ddcbdf26144216b0"

RPROVIDES:${PN} += "libasan.so.4()(64bit) libasan4 libasan4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
