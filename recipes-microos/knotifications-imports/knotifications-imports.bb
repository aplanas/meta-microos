SUMMARY = "KDE Desktop notifications - QML files"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. \
This package contains files that allow using knotification in QtQuick based \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "knotifications-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "6782bd56602a8f9fb609a57ddb4484c041f435ef4f7ceec11a8baac3c387583571774fcdc861aa9aea40def89bd15d809097ade001471be972d13d19374b2544"

RPROVIDES:${PN} += "knotifications-imports knotifications-imports(aarch-64) libknotificationqmlplugin.so()(64bit) qt5qmlimport(org.kde.notification.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Notifications.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
