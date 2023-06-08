SUMMARY = "KDE Desktop notifications: Build Environment"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "knotifications-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "654ccab6dcca5ef8ae0de6e338b3654ccf692890cf0994b4810ae7ecc9a7a1f011a8ec63bef33bd91561f555855e731b411f29b405e99f406d0ed908ce0e2747"

RPROVIDES:${PN} += "cmake(KF5Notifications) knotifications-devel knotifications-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5DBus) cmake(Qt5TextToSpeech) cmake(Qt5Widgets) extra-cmake-modules libKF5Notifications5"

inherit rpm
