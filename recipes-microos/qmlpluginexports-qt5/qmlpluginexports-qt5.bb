SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt5-1.0-1.16.aarch64.rpm"
RPM_HASH = "f40b03221091b4586f17e729a7d312dfc13d23cbc53499d9d5703f563cb6ec643754e3801576afb60e0dc610f82eaaf08818a600fcbdfc309e9ac7005aecd408"

RPROVIDES:${PN} += "qmlpluginexports-qt5 qmlpluginexports-qt5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
