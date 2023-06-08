SUMMARY = "Telepathy Krunner plugin"
DESCRIPTION = "A KRunner plugin to find your Telepathy contacts."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-contact-runner-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "95a1d4c36eee8c51eec07a89ebcbbd372e36b9248c91e21144509c750327ec429ec97f543b8338053f2ad287c85b576a841c7c5d9c1004e8559af9e25e3902be"

RPROVIDES:${PN} += "ktp-contact-runner ktp-contact-runner(aarch-64) ktp-contact-runner5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Runner.so.5()(64bit) libKTpCommonInternals.so.9()(64bit) libKTpModels.so.9()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit)"

inherit rpm
