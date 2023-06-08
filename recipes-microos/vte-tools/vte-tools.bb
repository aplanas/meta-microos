SUMMARY = "Tools from the VTE terminal emulator package"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides tools using VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "vte-tools-0.72.1-1.1.aarch64.rpm"
RPM_HASH = "c4f887015c4618f8f5bac5ff6125a1f84c4b36e4f19830fa4225b0590703faefffef6f38435e2c200d7851f1a9c37fd5bac783335b3f4ef22760d30d6d8af4fa"

RPROVIDES:${PN} += "vte-tools vte-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libvte-2.91.so.0()(64bit)"

inherit rpm
