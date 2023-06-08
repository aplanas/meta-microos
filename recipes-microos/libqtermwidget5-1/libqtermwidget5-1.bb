SUMMARY = "Qt5 terminal widget"
DESCRIPTION = "QTermWidget is a project based on the KDE4 \
Konsole application whose goal is to provide a Unicode- \
enabled, embeddable Qt widget to be used as a built-in console (or \
terminal emulation widget). Though Konsole is able of getting embedded, \
it is possible to have Qt without KDE. The original \
Konsole code was rewritten entirely with using Qt only, and all \
code dealing with user interface parts and session management was \
removed."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libqtermwidget5-1-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "bcfe3748d5e5206d6659f30cfff9dda48a0195957b31326e17b05a2c4edce19a32e46967a32a29e2b5ede88613ddbdd41a8fe1764d723238e50fcc867bfbf708"

RPROVIDES:${PN} += "libqtermwidget5-1 libqtermwidget5-1(aarch-64) libqtermwidget5.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.33)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libutf8proc.so.2()(64bit) qtermwidget-qt5-data"

inherit rpm
