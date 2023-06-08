SUMMARY = "Scripting bridge for programs"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kross-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "a4eb4bbf10da68388be1435f111f4922feb308ce94588143892901d5cb522a5eab96cc16922b5662239776e154d29c55cf62355d92374560f471a8410418bc10"

RPROVIDES:${PN} += "kross kross(aarch-64) libKF5KrossCore.so.5()(64bit) libKF5KrossUi.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Script.so.5()(64bit) libQt5Script.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
