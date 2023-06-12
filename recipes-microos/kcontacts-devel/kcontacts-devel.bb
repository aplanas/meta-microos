SUMMARY = "Development files for kcontacts"
DESCRIPTION = "Development files for kcontacts, a Qt5 library to access \
address books."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcontacts-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "89568118fc34671ee3df6eab76cd16038df49fd4c5fe4f9c2cb8ea5158c4fdd6400a877384872ad9999489a09f634172d134c235dfc080a0ca6c3e2855bd421c"

RPROVIDES:${PN} += "cmake(KF5Contacts) \
kcontacts-devel \
kcontacts-devel(aarch-64) \
kcontacts5-devel"
RDEPENDS:${PN} += "cmake(KF5Codecs) \
cmake(KF5Config) \
cmake(KF5CoreAddons) \
cmake(KF5I18n) \
libKF5Contacts5"

inherit rpm
