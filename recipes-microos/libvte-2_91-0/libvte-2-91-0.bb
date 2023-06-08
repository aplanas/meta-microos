SUMMARY = "Terminal Emulator Library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "libvte-2_91-0-0.72.1-1.1.aarch64.rpm"
RPM_HASH = "147ee520a40d48e2e911f0a24c4af8d265e15c8e8840fe3c6ae8cee220596844097a2ecf93ecb741be7923c475c3c500320d0d3e28d5ce254d2629680036318d"

RPROVIDES:${PN} += "config(libvte-2_91-0) libvte-2.91-gtk4.so.0()(64bit) libvte-2.91.so.0()(64bit) libvte-2_91-0 libvte-2_91-0(aarch-64) vte"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfribidi.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-4.so.1()(64bit) libicuuc.so.72()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpcre2-8.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_220)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
