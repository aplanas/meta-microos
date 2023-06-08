SUMMARY = "ROCS Graph Theory IDE main component library"
DESCRIPTION = "Rocs is a Graph Theory IDE for helping professors to show the results \
of a graph algorithm and also helping students to do the algorithms. \
 \
Rocs has a scripting module, done in Qt Script, which interacts with \
the drawn graph and every change in the graph with the script is \
reflected on the drawn one."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "librocsgraphtheory0-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0146526a52f93f003654a40bc9e3db6529ff664adbacd8f3e3bccfeee37ca6331b3edef22999ee413f9689f3cd9d8449020cf266b22989a044b7ecfb4b1b0a32"

RPROVIDES:${PN} += "librocsgraphtheory.so.0()(64bit) librocsgraphtheory0 librocsgraphtheory0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Script.so.5()(64bit) libQt5Script.so.5(Qt_5)(64bit) libQt5ScriptTools.so.5()(64bit) libQt5ScriptTools.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
