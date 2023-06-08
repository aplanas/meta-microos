SUMMARY = "Audio recording application"
DESCRIPTION = "Recorder is a simple, cross-platform audio recording application."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "krecorder-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "86e2e2e0b6b2c93cf51edf6da4478b8dad10c5e24f1dc44138709eb77ee57386f0619e781175dfe5f50ba07a938ddbb6f687f4314797af2cf74cf2f770e3204c"

RPROVIDES:${PN} += "application() application(org.kde.krecorder.desktop) krecorder krecorder(aarch-64) metainfo() metainfo(org.kde.krecorder.appdata.xml)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
