SUMMARY = "Provides direct access to plasma data engines"
DESCRIPTION = "Plasmaengineexplorer is a graphical tool allowing developers to \
test Plasma data engines without writing a Plasma applet."
LICENSE = "GPL-2.0-only"

PV = "5.27.4"

RPM_NAME = "plasmaengineexplorer5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "e186ff2af830c7d7c37d8015ea28479274fbbcc4624a1b7758c05dcef6cc0c5dd07421868af72570a911d8d6cf273ecc4ebb13bfe19971de5ccffd08585ac3b4"

RPROVIDES:${PN} += "application() application(org.kde.plasmaengineexplorer.desktop) metainfo() metainfo(org.kde.plasmaengineexplorer.appdata.xml) plasmaengineexplorer5 plasmaengineexplorer5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Plasma.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
