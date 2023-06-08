SUMMARY = "Courier Unicode Library"
DESCRIPTION = "This library implements several algorithms related to the Unicode Standard: \
* Look up uppercase, lowercase, and titlecase equivalents of a unicode \
  character. \
* Implementation of grapheme and work breaking rules. \
* Implementation of line breaking rules. \
* Several ancillary functions, like looking up the unicode character \
  that corresponds to some HTML 4.0 entity (such as “&amp;”, for \
  example), and determining the normal width or a double-width status of \
  a unicode character. Also, an adaptation of the iconv(3) API for this \
  unicode library. \
This library also implements C++ bindings for these algorithms."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.6"

RPM_NAME = "libcourier-unicode7-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "25f09be853b3e2c33db60cca7cb863d26e178d912dfa0a96dc797e7711a38149d9344cde4a11e8894e4c939c54a0fe6d40349d8a3d4610246fb01aeb3c5e4a08"

RPROVIDES:${PN} += "libcourier-unicode.so.7()(64bit) libcourier-unicode7 libcourier-unicode7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
