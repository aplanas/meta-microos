SUMMARY = "Command-line utilities from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
'cam' is a command-line utility to interact with cameras. The initial state is \
limited and only supports listing cameras in the system and selecting a camera \
to interact with."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera-tools-0.0.4-2.3.aarch64.rpm"
RPM_HASH = "7aca14b2c2faffb76121fa55f9ef29fe67ff2276e9a0f8184a9a4965ce8c4947e6ecb56041da3eb5467c1b56dfe76603aa2259e079640aaeac48c03986cb078b"

RPROVIDES:${PN} += "libcamera-tools \
libcamera-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcamera-base.so.0.0.4()(64bit) \
libcamera.so.0.0.4()(64bit) \
libdrm.so.2()(64bit) \
libevent-2.1.so.7()(64bit) \
libevent_pthreads-2.1.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libtiff.so.6(LIBTIFF_4.1)(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
