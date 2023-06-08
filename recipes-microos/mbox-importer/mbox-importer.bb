SUMMARY = "Tool for importing mbox archives into akonadi"
DESCRIPTION = "This package contains a tool that can be used to import mbox archives \
into akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "mbox-importer-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "49ee6d18f1b319618055d9ca0cfe8a43d672a2f24c2c71a0be0cd24f92b88067b90eef7322b24d8556960257157f9a3dbf7014f9d7720e19c012f78ea6cec164"

RPROVIDES:${PN} += "application() application(org.kde.mboximporter.desktop) mbox-importer mbox-importer(aarch-64) mimehandler(application/mbox)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5MailCommon.so.5()(64bit) libKPim5MailImporter.so.5()(64bit) libKPim5MailImporterAkonadi.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
