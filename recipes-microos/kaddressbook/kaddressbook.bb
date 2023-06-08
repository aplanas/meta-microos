SUMMARY = "Address book application to manage contacts"
DESCRIPTION = "KAddressbook is an application by KDE to manage contacts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kaddressbook-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "46eedf497f38f44d8c34ff25205a167977fd1f8194c90676229dcef81b9ee9bc20d2b7f10bc5d5ef9b0ac3b42941a6770550a4e34ef34a2c16f398483f6a26a7"

RPROVIDES:${PN} += "application() application(kaddressbook-importer.desktop) application(kaddressbook-view.desktop) application(org.kde.kaddressbook.desktop) kaddressbook kaddressbook(aarch-64) kaddressbook5 libkaddressbookprivate.so.5()(64bit) metainfo() metainfo(org.kde.kaddressbook.appdata.xml) mimehandler(application/x-vnd.kde.contactgroup) mimehandler(text/directory) mimehandler(text/vcard) mimehandler(text/x-ldif)"
RDEPENDS:${PN} += "/sbin/ldconfig kdepim-runtime ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5PimCommonAkonadi.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AddressbookImportExport.so.5()(64bit) libKPim5AddressbookImportExport5 libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiSearchDebug.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5GrantleeTheme.so.5()(64bit) libKPim5KontactInterface.so.5()(64bit) libKPim5Libkdepim.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
