SUMMARY = "Python support for KDevelop"
DESCRIPTION = "A KDevelop plugin which provides Python language support, including code completion and debugging using PDB."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdevelop5-plugin-python3-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8878d249cfafcfbdbfde379d2fa2ce54329c9e52668ea133771c35d1792a9f0f8823f7dc62804ab5a69d770306a9154ab054dbcfa90c8a621ddbc9ee021464da"

RPROVIDES:${PN} += "kdevelop4-plugin-python kdevelop4-plugin-python3 kdevelop5-plugin-python3 kdevelop5-plugin-python3(aarch-64) libkdevpythoncompletion.so()(64bit) libkdevpythonduchain.so()(64bit) libkdevpythonparser.so()(64bit) metainfo() metainfo(org.kde.kdev-python.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig kdevelop5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKDevPlatformDebugger.so.511()(64bit) libKDevPlatformInterfaces.so.511()(64bit) libKDevPlatformLanguage.so.511()(64bit) libKDevPlatformOutputView.so.511()(64bit) libKDevPlatformSerialization.so.511()(64bit) libKDevPlatformUtil.so.511()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5TextEditor.so.5()(64bit) libKF5ThreadWeaver.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
