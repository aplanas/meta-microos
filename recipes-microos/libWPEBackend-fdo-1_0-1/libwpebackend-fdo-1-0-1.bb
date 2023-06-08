SUMMARY = "Shared library for wpebackend-fdo"
DESCRIPTION = "A WPE backend designed for Linux desktop systems. \
 \
This package contains the shared library."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libWPEBackend-fdo-1_0-1-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "a53005aae947ee3cb8d4618bfae5392bca3d7dcc3ecac1c6d62e5d59d7dc9a6a648471ee13017161c874e4da98e37215c658dd6bf39708012383a6547b2fd5f6"

RPROVIDES:${PN} += "libWPEBackend-fdo-1.0.so.1()(64bit) libWPEBackend-fdo-1_0-1 libWPEBackend-fdo-1_0-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libepoxy.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwayland-client.so.0()(64bit) libwayland-egl.so.1()(64bit) libwayland-server.so.0()(64bit) libwpe-1.0.so.1()(64bit)"

inherit rpm
