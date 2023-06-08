SUMMARY = "Method for binding Javascript objects to QObjects"
DESCRIPTION = "KSJEmbed provides a method of binding JavaScript objects to QObjects, \
so you can script your applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5JsEmbed5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "f7b16bd27aa44945fd4a25e8f9a748e7bf1703e3a82c08e9b6120ad6fe8e3d416c1d419c84064d570c40644bf0619622567abe88f0e109b4bb4e0977a51bf61c"

RPROVIDES:${PN} += "libKF5JsEmbed.so.5()(64bit) libKF5JsEmbed5 libKF5JsEmbed5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5JS.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
