SUMMARY = "KDE Desktop notifications: Build Environment"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knotifications-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f9c3adf4d6a4167e9b2e07e837ea64f1d7c32378f080f34cc13a9649c5a0e9efa22776461474a315c0a66ae5a69dcc2651c70bba82daa178c9de6a3c76b6be73"

RPROVIDES:${PN} += "cmake(KF5Notifications) knotifications-devel knotifications-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5DBus) cmake(Qt5TextToSpeech) cmake(Qt5Widgets) extra-cmake-modules libKF5Notifications5"

inherit rpm
