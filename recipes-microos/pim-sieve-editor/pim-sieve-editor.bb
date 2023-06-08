SUMMARY = "Sieve scripts editor for KDE PIM applications"
DESCRIPTION = "This package provides an editor, complete with syntax highlighting and \
command completion, to edit Sieve scripts ('server side filtering') \
in KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "pim-sieve-editor-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5e0aca70754b0d051fbfed6917e02e4a5338a8c8f3f637e99b91fd0a21812a4d7e2ccb9283e7ddd1b7a65f7582d397270c99760c682c3220e5ea4ec08cb97d8c"

RPROVIDES:${PN} += "application() application(org.kde.sieveeditor.desktop) libsieveeditor.so.5()(64bit) metainfo() metainfo(org.kde.sieveeditor.appdata.xml) pim-sieve-editor pim-sieve-editor(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kmail ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Bookmarks.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5KManageSieve.so.5()(64bit) libKPim5KSieveUi.so.5()(64bit) libKPim5MailTransport.so.5()(64bit) libKUserFeedbackCore.so.1()(64bit) libKUserFeedbackWidgets.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libqt5keychain.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
