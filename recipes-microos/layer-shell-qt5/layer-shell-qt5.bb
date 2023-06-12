SUMMARY = "wlr-layer-shell integration for Qt 5"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "layer-shell-qt5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fa7099285c05d4664460b2bc575b991e0a457179be081c45f6626fe02625588b20f4a667c34fd41dc028b337a47903493fcabd1a20d25e39fb2e25093ce56f88"

RPROVIDES:${PN} += "layer-shell-qt5 \
layer-shell-qt5(aarch-64) \
libLayerShellQtInterface.so.5()(64bit) \
liblayer-shell.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
