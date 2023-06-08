SUMMARY = "C++ library to manipulate vCard standard format files"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.16"

RPM_NAME = "libbelcard1-5.2.16-1.3.aarch64.rpm"
RPM_HASH = "6bff6c3e03435303aff4faf547ba7a7fe61d6732817d868ebd2401499f5ae76f7aba5961d0ef61fb7e5524853e9cbba803c85637c9af4aa20ee7ddc456602f24"

RPROVIDES:${PN} += "libbelcard.so.1()(64bit) libbelcard1 libbelcard1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig belcard-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbctoolbox.so.1()(64bit) libbelr.so.1()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
