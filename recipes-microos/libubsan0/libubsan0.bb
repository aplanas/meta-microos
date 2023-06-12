SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libubsan0-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "8d732fdb9185fc1cf5739e0705bc48009d955874c3482fcf3880a4466d22ac00deacf6a7c868a1d31de2a7a07b561dab554509bf7af0aa01ed6bc504618034d5"

RPROVIDES:${PN} += "libubsan.so.0()(64bit) libubsan0 libubsan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
