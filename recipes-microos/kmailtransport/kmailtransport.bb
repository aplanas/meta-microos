SUMMARY = "KDE PIM Libraries: Mailtransport layer"
DESCRIPTION = "This package contains library to provide mailtransport functionality for \
KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kmailtransport-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "dc8fa2514a9b5328c7d60a2d8694a067a64c18cd3c44bc6ca00cd89866c1047888e57e4ba134d631ffcfd4b7f80b779edf3ed8236c591ac810e31aa874b2b977"

RPROVIDES:${PN} += "kmailtransport kmailtransport(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5GAPICore.so.5()(64bit) libKPim5MailTransport.so.5()(64bit) libKPim5MailTransportAkonadi.so.5()(64bit) libKPim5Mime.so.5()(64bit) libKPim5SMTP.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
