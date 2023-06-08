SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit2gtk4-minibrowser-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "365a9901ee026606c3688d792fe86a40cc68732d24cc67c5e4fa3266f75fbd7b06a8e77716477599bb55eed368f5cecadd97a94380337b3fa7c1451fe54feaf8"

RPROVIDES:${PN} += "webkit2gtk4-minibrowser webkit2gtk4-minibrowser(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-4.so.1()(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libjavascriptcoregtk-6.0.so.1()(64bit) libsoup-3.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libwebkitgtk-6.0.so.4()(64bit)"

inherit rpm
