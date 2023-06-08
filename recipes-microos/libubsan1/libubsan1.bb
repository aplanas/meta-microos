SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.0.1+git7231"

RPM_NAME = "libubsan1-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "ff863ea590772d5f74cb7f417a44d1ddcc3d5b74f5aa0b55dc6a25a16c045f6d8a5814233a5a21e372436f705f7dbf90149c61ce8ce7ab24497e3afa510d5a01"

RPROVIDES:${PN} += "libubsan.so.1()(64bit) libubsan1 libubsan1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
