SUMMARY = "Translations for package libKF5Archive5"
DESCRIPTION = "Provides translations for the 'libKF5Archive5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Archive5-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "a8278c05945fb7b508296f4ea5c7a076a87959b1f3a84a50a619fe7b84a18cf491b5e5f17e1007168f599735dfe9dc5d0c1e18ccb4fdf947e9274daea1706640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Archive5-lang libKF5Archive5-lang-all locale(libKF5Archive5:ar) locale(libKF5Archive5:ca) locale(libKF5Archive5:ca@valencia) locale(libKF5Archive5:cs) locale(libKF5Archive5:de) locale(libKF5Archive5:en_GB) locale(libKF5Archive5:es) locale(libKF5Archive5:fi) locale(libKF5Archive5:fr) locale(libKF5Archive5:ia) locale(libKF5Archive5:it) locale(libKF5Archive5:ja) locale(libKF5Archive5:ka) locale(libKF5Archive5:lt) locale(libKF5Archive5:nl) locale(libKF5Archive5:nn) locale(libKF5Archive5:pl) locale(libKF5Archive5:pt) locale(libKF5Archive5:ru) locale(libKF5Archive5:sk) locale(libKF5Archive5:sl) locale(libKF5Archive5:tr) locale(libKF5Archive5:uk) locale(libKF5Archive5:zh_CN) locale(libKF5Archive5:zh_TW)"
RDEPENDS:${PN} += "libKF5Archive5"

inherit rpm
