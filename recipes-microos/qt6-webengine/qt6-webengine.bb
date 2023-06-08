SUMMARY = "Web browser engine for Qt applications"
DESCRIPTION = "The Qt WebEngine module provides a web browser engine to embed web content into \
Qt applications. \
The functionality in Qt WebEngine is divided into the following \
modules: \
* Qt WebEngine Core module for interacting with Chromium \
* Qt WebEngine Widgets module for creating widget-based web applications \
* Qt WebEngine module for creating Qt Quick based web applications"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webengine-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "f5b713f081caf592604301aa48b5a028d41076b1bd80baab4603a7e4e8bacbf87b12d1b9d57215340ea425fc41b985f638b0728d4a945dc12fd06514f808b3db"

RPROVIDES:${PN} += "libqwebengineview.so()(64bit) libqwebengineview.so(Qt_6)(64bit) libqwebengineview.so(Qt_6.0)(64bit) libqwebengineview.so(Qt_6.1)(64bit) libqwebengineview.so(Qt_6.2)(64bit) libqwebengineview.so(Qt_6.3)(64bit) libqwebengineview.so(Qt_6.4)(64bit) libqwebengineview.so(Qt_6.5)(64bit) libqwebengineview.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-webengine qt6-webengine(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6()(64bit) libQt6WebEngineCore.so.6(Qt_6)(64bit) libQt6WebEngineWidgets.so.6()(64bit) libQt6WebEngineWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
