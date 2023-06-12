SUMMARY = "Web browser engine for Qt applications"
DESCRIPTION = "The Qt WebEngine module provides a web browser engine to embed web content into \
Qt applications. \
The functionality in Qt WebEngine is divided into the following \
modules: \
* Qt WebEngine Core module for interacting with Chromium \
* Qt WebEngine Widgets module for creating widget-based web applications \
* Qt WebEngine module for creating Qt Quick based web applications"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2339d9d84c263fd093c14a077552f80577f959008dc6cb1893a9d04b59a8d4adf662b2ac9007cd47b5a8abf7843f5dfbc346d20ca760dbbc984d17c6565af6d3"

RPROVIDES:${PN} += "libqwebengineview.so()(64bit) libqwebengineview.so(Qt_6)(64bit) libqwebengineview.so(Qt_6.0)(64bit) libqwebengineview.so(Qt_6.1)(64bit) libqwebengineview.so(Qt_6.2)(64bit) libqwebengineview.so(Qt_6.3)(64bit) libqwebengineview.so(Qt_6.4)(64bit) libqwebengineview.so(Qt_6.5)(64bit) libqwebengineview.so(Qt_6.5.1_PRIVATE_API)(64bit) qt6-webengine qt6-webengine(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6()(64bit) libQt6WebEngineCore.so.6(Qt_6)(64bit) libQt6WebEngineWidgets.so.6()(64bit) libQt6WebEngineWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
