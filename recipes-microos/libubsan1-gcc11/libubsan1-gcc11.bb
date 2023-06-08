SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "11.3.1+git2076"

RPM_NAME = "libubsan1-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "084dfd7216cd3861b0abfa6cedcdfa55d8d719f1e2cefd0d84c62ae4304c72c6a6a3d9d884c0a6e97d038673ac75ecec0d548d95cb251fb69e2282825adb05aa"

RPROVIDES:${PN} += "libubsan.so.1()(64bit) libubsan1 libubsan1-gcc11 libubsan1-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
