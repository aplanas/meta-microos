SUMMARY = "Computer algebra system"
DESCRIPTION = "A computer algebra system, compatible with existing CAS, as a C++ \
library with various user interfaces (GUI with formal spreadsheet and exact \
dynamic geometry, on-line, readline, emacs, texmacs...)."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-1.9.0.27-4.5.aarch64.rpm"
RPM_HASH = "26415d47b11c1b4a4dd2695b28b66bbb990b7eeed3e86c46d482d96506360817a4e09a25f7eb776f0aeb8d26f1f4741dbad21dc41d628ef054c3a4648e8fe58f"

RPROVIDES:${PN} += "giac giac(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfltk.so.1.3()(64bit) libfltk_gl.so.1.3()(64bit) libfltk_images.so.1.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgiac.so.0()(64bit) libgmp.so.10()(64bit) libgsl.so.27()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit)"

inherit rpm
