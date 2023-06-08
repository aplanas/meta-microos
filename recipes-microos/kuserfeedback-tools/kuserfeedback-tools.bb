SUMMARY = "Command line utilities for the kuserfeedback server"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides tools to connect to \
and query a local or remote KUserFeedback server."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-tools-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "b94d91c2318171e7349eb6d7d99006c32a836f82fe2c08ebea727fe4b448e8aa133a507cc6e0bce599aa702f01b790f28931ca85f08019c71a593753051b67f7"

RPROVIDES:${PN} += "application() application(org.kde.kuserfeedback-console.desktop) kuserfeedback-tools kuserfeedback-tools(aarch-64) metainfo() metainfo(org.kde.kuserfeedback-console.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKUserFeedbackCore.so.1()(64bit) libKUserFeedbackWidgets.so.1()(64bit) libQt5Charts.so.5()(64bit) libQt5Charts.so.5(Qt_5)(64bit) libQt5Charts.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
