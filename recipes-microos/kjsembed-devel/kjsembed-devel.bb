SUMMARY = "Build environment for kjsembed"
DESCRIPTION = "Development files for KSJEmbed, which provides a method of binding \
JavaScript objects to QObjects, so applications can be scripted."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kjsembed-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "fe510acd87a959c6ed429c47ce35825e89a40d41bf6b2526dbf3dde4c0dfb5f59f2bffda2687a27835cca69f6c4d6b384200cafc42fd48cf5632a63257d22082"

RPROVIDES:${PN} += "cmake(KF5JsEmbed) kjsembed-devel kjsembed-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5I18n) cmake(KF5JS) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5JS.so.5()(64bit) libKF5JsEmbed.so.5()(64bit) libKF5JsEmbed5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
