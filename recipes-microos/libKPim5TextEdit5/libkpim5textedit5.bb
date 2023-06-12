SUMMARY = "KDE PIM Libraries: Text editing functionality"
DESCRIPTION = "This package provides text editing functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5TextEdit5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "af05085ab30586c411446944259fb572d5f2a3eb5595d35659f86e5e9a8badc9f7d1681e276b86d5c4c530b75d8159b00c50b79c104c496da435716be1bce09c"

RPROVIDES:${PN} += "libKPim5TextEdit.so.5()(64bit) libKPim5TextEdit5 libKPim5TextEdit5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kpimtextedit ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5SonnetCore.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5SyntaxHighlighting.so.5()(64bit) libKF5TextEditTextToSpeech.so.1()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
