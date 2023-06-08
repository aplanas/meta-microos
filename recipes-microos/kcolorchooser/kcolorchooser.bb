SUMMARY = "Color Chooser"
DESCRIPTION = "This is an color chooser application by KDE."
LICENSE = "MIT"

PV = "23.04.0"

RPM_NAME = "kcolorchooser-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5fd9350a9f1496e10e16b2485cd8b6702d9892f11ac36443707878e81957a9e4c853f5f9ca0f767fb62dcf7890a52495456c8e1fccc55ee26bea4763b11ad29f"

RPROVIDES:${PN} += "application() application(org.kde.kcolorchooser.desktop) kcolorchooser kcolorchooser(aarch-64) metainfo() metainfo(org.kde.kcolorchooser.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
