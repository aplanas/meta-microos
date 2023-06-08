SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libksieve5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3730ea9f98fee7e9723a24d6a3d7b5f246890ac4e4b98443f818cb6fc252497e18542e0614d20e183bc6af11aef5d752af0f739dea3294d9b59fdd067dbbc99e"

RPROVIDES:${PN} += "libKPim5KManageSieve.so.5()(64bit) libKPim5KSieve.so.5()(64bit) libKPim5KSieveUi.so.5()(64bit) libksieve5 libksieve5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5SyntaxHighlighting.so.5()(64bit) libKF5TextEditTextToSpeech.so.1()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5Libkdepim.so.5()(64bit) libKPim5Mime.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libksieve libsasl2.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
