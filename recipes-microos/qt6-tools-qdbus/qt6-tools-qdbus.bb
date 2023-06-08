SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-tools-qdbus-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "41ba7aa2568339a4b10923df37f0c59970561176781476bbfa13ab2b34562692f416e786af4db1463928d4b56f334e50e0f44f2d7ba02d28b7a49aaa0c44efe9"

RPROVIDES:${PN} += "application() application(org.qt.qdbusviewer6.desktop) qt6-tools-qdbus qt6-tools-qdbus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
