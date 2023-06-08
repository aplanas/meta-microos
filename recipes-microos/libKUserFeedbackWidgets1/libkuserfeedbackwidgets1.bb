SUMMARY = "User interface components for kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides the user interface \
components to integrate the framework in Qt applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libKUserFeedbackWidgets1-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "ea20b828ef65af362fc87989d75e71426905790e0d63fe5cda7e9efff0fff0dff17ed0a7d81d8e98d15dc7fe9383b937f429a508f12fbe5ed2b2c42d157cfe7d"

RPROVIDES:${PN} += "libKUserFeedbackWidgets.so.1()(64bit) libKUserFeedbackWidgets1 libKUserFeedbackWidgets1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKUserFeedbackCore.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
