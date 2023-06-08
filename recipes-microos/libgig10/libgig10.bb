SUMMARY = "Library for loading Gigasampler and DLS Level 1/2 files"
DESCRIPTION = "C++ library for loading Gigasampler and DLS Level 1/2 files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libgig10-4.3.0-1.9.aarch64.rpm"
RPM_HASH = "417dfbb3dc798597fa7e1842212b88909ec8a706ba0a665605320f6a5dd489952f20043a87219bd80ef2b55afa5411b6658a0d9c21bd918b0fff9159b67fb1aa"

RPROVIDES:${PN} += "config(libgig10) libgig.so.10()(64bit) libgig10 libgig10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
