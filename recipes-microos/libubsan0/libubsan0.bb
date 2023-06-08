SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libubsan0-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "3b2e510146595f24d09ed09c531f435f4be7d3674d1402992cae0f400153c2b63d3404964bdb3bbd146940e114ef39604dd4fe8aae19f28514f652acebf8aca9"

RPROVIDES:${PN} += "libubsan.so.0()(64bit) libubsan0 libubsan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
