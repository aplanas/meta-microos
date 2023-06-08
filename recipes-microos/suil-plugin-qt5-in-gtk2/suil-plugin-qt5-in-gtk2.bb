SUMMARY = "Shared object for Qt5 hosts displaying GTK2 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt5 hosts displaying GTK2 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-qt5-in-gtk2-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "4d5a849539ffa9c1be3fc98421a1aeff3df4f11d3c643c9f3d6255da13b42c611f858aa0005d533adb685e08d9d482bf46ae42eae03bdcd585c31a33ae5cd425"

RPROVIDES:${PN} += "libsuil_qt5_in_gtk2.so()(64bit) suil-plugin-qt5-in-gtk2 suil-plugin-qt5-in-gtk2(aarch-64)"
RDEPENDS:${PN} += "libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libsuil-0-0"

inherit rpm
