SUMMARY = "ZBar Qt bindings"
DESCRIPTION = "This package provides ZBar Qt bindings."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbarqt0-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "feb5600c1b55334da41c599ae8a08926ab41a86e1983dc3a1e0a3469d3fe79a1ba9bbf3c61dc0cc43dabd919f9a6efca46f0db7ebddb51000d151ddfaeb63f01"

RPROVIDES:${PN} += "libzbarqt.so.0()(64bit) \
libzbarqt0 \
libzbarqt0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libzbar.so.0()(64bit)"

inherit rpm
