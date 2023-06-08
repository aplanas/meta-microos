SUMMARY = "KDE PIM Libraries: Identity Management - widgets library"
DESCRIPTION = "This package provides graphical widgets to handle multiple email identities \
and associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5IdentityManagementWidgets5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d49661043bba1ebde419e7f42b2dd93327984717cfb7c9cc94c893984e3df35f0ddc7d91ad910ccb6478c70e4c4378ecf71ec730f49d1f868994c929a6d4fd74"

RPROVIDES:${PN} += "libKPim5IdentityManagementWidgets.so.5()(64bit) libKPim5IdentityManagementWidgets5 libKPim5IdentityManagementWidgets5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5IdentityManagement5 libKPim5TextEdit.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
