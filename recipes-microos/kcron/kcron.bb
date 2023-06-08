SUMMARY = "Cron job configuration tool"
DESCRIPTION = "KCron allows you to change your cron jobs setup."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kcron-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a4366f035ac3eba0ab7ce7fc1b183d4bc2ab5f0f09451bed82da351086f4d2e1de6a9cbca5cd4cf40dc1e999b8eae6c58ea515c5f5c252a29610dab745357510"

RPROVIDES:${PN} += "kcron kcron(aarch-64) kcron5 metainfo() metainfo(org.kde.kcron.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5AuthCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
