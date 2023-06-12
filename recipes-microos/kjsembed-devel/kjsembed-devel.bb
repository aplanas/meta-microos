SUMMARY = "Build environment for kjsembed"
DESCRIPTION = "Development files for KSJEmbed, which provides a method of binding \
JavaScript objects to QObjects, so applications can be scripted."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kjsembed-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "45b89a262d5bc6eedc45452a6702f89965543d3de1d8c568c568aa40cc8cadb30a6660bdeeaf37d0461a08aaf7b5909c9c37ef02d35175741a7e643cd9fe37c9"

RPROVIDES:${PN} += "cmake(KF5JsEmbed) kjsembed-devel kjsembed-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5I18n) cmake(KF5JS) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5JS.so.5()(64bit) libKF5JsEmbed.so.5()(64bit) libKF5JsEmbed5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
