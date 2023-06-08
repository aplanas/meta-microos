SUMMARY = "Development files for kcontacts"
DESCRIPTION = "Development files for kcontacts, a Qt5 library to access \
address books."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcontacts-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "5f626a85b76d69b2129c4a6408ad1cb439ce7b79a4df2324976f9ebdc35c4fa10bdb07504937fc9d470a784ee4a5951cd9857cc834d1b861094c5b008edc4540"

RPROVIDES:${PN} += "cmake(KF5Contacts) kcontacts-devel kcontacts-devel(aarch-64) kcontacts5-devel"
RDEPENDS:${PN} += "cmake(KF5Codecs) cmake(KF5Config) cmake(KF5CoreAddons) cmake(KF5I18n) libKF5Contacts5"

inherit rpm
