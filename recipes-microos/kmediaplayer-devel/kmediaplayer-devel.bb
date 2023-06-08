SUMMARY = "Interface for media player KParts: Build Environment"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kmediaplayer-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "6750205e49f231ccb69ac3a0b4013f2bc8b3e9fcd74241b52cc90950a8e8ea2f309a38be2031c79131b5a1c265841ad796c482188b31760ce3dc39d2a8ce35d9"

RPROVIDES:${PN} += "cmake(KF5MediaPlayer) kmediaplayer-devel kmediaplayer-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5I18n) cmake(KF5Parts) extra-cmake-modules libKF5MediaPlayer5"

inherit rpm
