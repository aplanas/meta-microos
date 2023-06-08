SUMMARY = "Translations for package libKF5Screen8"
DESCRIPTION = "Provides translations for the 'libKF5Screen8' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libKF5Screen8-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "39d5eb029ac58721fe1ca0d7e9459918faaa80eb212b2f43c383b3e1e054fff9c21789074c591844d177cca80884eb1595306012d22726cbd47143e5362934b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Screen8-lang libKF5Screen8-lang-all locale(libKF5Screen8:ca) locale(libKF5Screen8:ca@valencia) locale(libKF5Screen8:cs) locale(libKF5Screen8:en_GB) locale(libKF5Screen8:es) locale(libKF5Screen8:eu) locale(libKF5Screen8:fi) locale(libKF5Screen8:fr) locale(libKF5Screen8:it) locale(libKF5Screen8:ka) locale(libKF5Screen8:nl) locale(libKF5Screen8:nn) locale(libKF5Screen8:pl) locale(libKF5Screen8:pt) locale(libKF5Screen8:pt_BR) locale(libKF5Screen8:ru) locale(libKF5Screen8:sk) locale(libKF5Screen8:sl) locale(libKF5Screen8:tr) locale(libKF5Screen8:uk) locale(libKF5Screen8:zh_CN) locale(libKF5Screen8:zh_TW)"
RDEPENDS:${PN} += "libKF5Screen8"

inherit rpm
