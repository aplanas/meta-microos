SUMMARY = "Translations for package libKF5Solid5"
DESCRIPTION = "Provides translations for the 'libKF5Solid5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Solid5-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "70aa19dd0a7c83807826020291a6239e57a76685d47feab1e420c5ab872042320734971758af1ebfbe37407fdb039f3ce53fc5c9ea269c91a562788db3875f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Solid5-lang libKF5Solid5-lang-all locale(libKF5Solid5:ar) locale(libKF5Solid5:az) locale(libKF5Solid5:bg) locale(libKF5Solid5:bs) locale(libKF5Solid5:ca) locale(libKF5Solid5:ca@valencia) locale(libKF5Solid5:cs) locale(libKF5Solid5:da) locale(libKF5Solid5:de) locale(libKF5Solid5:el) locale(libKF5Solid5:en_GB) locale(libKF5Solid5:eo) locale(libKF5Solid5:es) locale(libKF5Solid5:et) locale(libKF5Solid5:eu) locale(libKF5Solid5:fi) locale(libKF5Solid5:fr) locale(libKF5Solid5:ga) locale(libKF5Solid5:gd) locale(libKF5Solid5:gl) locale(libKF5Solid5:he) locale(libKF5Solid5:hr) locale(libKF5Solid5:hu) locale(libKF5Solid5:ia) locale(libKF5Solid5:id) locale(libKF5Solid5:is) locale(libKF5Solid5:it) locale(libKF5Solid5:ja) locale(libKF5Solid5:ka) locale(libKF5Solid5:kk) locale(libKF5Solid5:km) locale(libKF5Solid5:ko) locale(libKF5Solid5:lt) locale(libKF5Solid5:lv) locale(libKF5Solid5:ml) locale(libKF5Solid5:mr) locale(libKF5Solid5:ms) locale(libKF5Solid5:nb) locale(libKF5Solid5:nds) locale(libKF5Solid5:nl) locale(libKF5Solid5:nn) locale(libKF5Solid5:pa) locale(libKF5Solid5:pl) locale(libKF5Solid5:pt) locale(libKF5Solid5:pt_BR) locale(libKF5Solid5:ro) locale(libKF5Solid5:ru) locale(libKF5Solid5:sk) locale(libKF5Solid5:sl) locale(libKF5Solid5:sr) locale(libKF5Solid5:sr@ijekavian) locale(libKF5Solid5:sr@ijekavianlatin) locale(libKF5Solid5:sr@latin) locale(libKF5Solid5:sv) locale(libKF5Solid5:ta) locale(libKF5Solid5:th) locale(libKF5Solid5:tr) locale(libKF5Solid5:ug) locale(libKF5Solid5:uk) locale(libKF5Solid5:zh_CN) locale(libKF5Solid5:zh_TW)"
RDEPENDS:${PN} += "libKF5Solid5"

inherit rpm
