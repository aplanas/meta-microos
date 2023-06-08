SUMMARY = "Libgravatar library for KDE PIM applications"
DESCRIPTION = "libgravatar adds support for downloading and displaying gravatars in \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Gravatar5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "138c66af2f7c251e5a8612c29cb550267114cefb97f4a14bd51f57b8ea0cfb846cc187a467600fdb02396dc8d952ace7172657c270cae5c7c4fdaa20eee8ae51"

RPROVIDES:${PN} += "libKPim5Gravatar.so.5()(64bit) libKPim5Gravatar5 libKPim5Gravatar5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgravatar libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
