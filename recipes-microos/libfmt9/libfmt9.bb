SUMMARY = "A formatting library for C++"
DESCRIPTION = "Shared library for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "libfmt9-9.1.0-2.3.aarch64.rpm"
RPM_HASH = "b6ba4ecabb42cffc4dff68395a7237efd338b48c26362b273e9e1102343c2c81d7f168a5b4352ba1626740fc7e5f64a74b40891ef4752d4991e91ce3cc144e8b"

RPROVIDES:${PN} += "libfmt.so.9()(64bit) libfmt9 libfmt9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
