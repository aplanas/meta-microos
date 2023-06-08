SUMMARY = "Display gamma configuration"
DESCRIPTION = "This package contains a KDE system settings module to configure display \
gamma."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kgamma5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "0a1a90e769dbdc1ddb75fe8476a2fb6ac19089c87a11f4b26a45485681d25d26e5601121e4b484613ff29ab0efbefb46d74b49acdc961a65ec50a0371aeb76a6"

RPROVIDES:${PN} += "kgamma kgamma5 kgamma5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXxf86vm.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
