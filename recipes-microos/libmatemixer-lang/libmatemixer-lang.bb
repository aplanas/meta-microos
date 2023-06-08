SUMMARY = "Translations for package libmatemixer"
DESCRIPTION = "Provides translations for the 'libmatemixer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "libmatemixer-lang-1.26.0-1.8.noarch.rpm"
RPM_HASH = "7698741020e8a3d54311431584ad3b56a6e2da68617bfce38b35393f9d39eeb2b23e5b6613ea74578d1d54504aae53ecac79864178c0de74d49074bdb72e44c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmatemixer-lang libmatemixer-lang-all locale(libmatemixer:af) locale(libmatemixer:ar) locale(libmatemixer:as) locale(libmatemixer:ast) locale(libmatemixer:az) locale(libmatemixer:be) locale(libmatemixer:bg) locale(libmatemixer:bn) locale(libmatemixer:bn_IN) locale(libmatemixer:br) locale(libmatemixer:bs) locale(libmatemixer:ca) locale(libmatemixer:ca@valencia) locale(libmatemixer:cs) locale(libmatemixer:cy) locale(libmatemixer:da) locale(libmatemixer:de) locale(libmatemixer:dz) locale(libmatemixer:el) locale(libmatemixer:en_AU) locale(libmatemixer:en_CA) locale(libmatemixer:en_GB) locale(libmatemixer:eo) locale(libmatemixer:es) locale(libmatemixer:es_CL) locale(libmatemixer:es_CO) locale(libmatemixer:es_MX) locale(libmatemixer:et) locale(libmatemixer:eu) locale(libmatemixer:fa) locale(libmatemixer:fi) locale(libmatemixer:fr) locale(libmatemixer:fr_CA) locale(libmatemixer:fur) locale(libmatemixer:ga) locale(libmatemixer:gl) locale(libmatemixer:gu) locale(libmatemixer:he) locale(libmatemixer:hi) locale(libmatemixer:hr) locale(libmatemixer:hu) locale(libmatemixer:ia) locale(libmatemixer:id) locale(libmatemixer:is) locale(libmatemixer:it) locale(libmatemixer:ja) locale(libmatemixer:ka) locale(libmatemixer:kk) locale(libmatemixer:kn) locale(libmatemixer:ko) locale(libmatemixer:lt) locale(libmatemixer:lv) locale(libmatemixer:mai) locale(libmatemixer:mk) locale(libmatemixer:ml) locale(libmatemixer:mr) locale(libmatemixer:ms) locale(libmatemixer:nb) locale(libmatemixer:nds) locale(libmatemixer:ne) locale(libmatemixer:nl) locale(libmatemixer:nn) locale(libmatemixer:oc) locale(libmatemixer:or) locale(libmatemixer:pa) locale(libmatemixer:pl) locale(libmatemixer:pt) locale(libmatemixer:pt_BR) locale(libmatemixer:ro) locale(libmatemixer:ru) locale(libmatemixer:si) locale(libmatemixer:sk) locale(libmatemixer:sl) locale(libmatemixer:sq) locale(libmatemixer:sr) locale(libmatemixer:sr@latin) locale(libmatemixer:sv) locale(libmatemixer:ta) locale(libmatemixer:te) locale(libmatemixer:th) locale(libmatemixer:tr) locale(libmatemixer:ug) locale(libmatemixer:uk) locale(libmatemixer:vi) locale(libmatemixer:wa) locale(libmatemixer:zh_CN) locale(libmatemixer:zh_HK) locale(libmatemixer:zh_TW)"
RDEPENDS:${PN} += "libmatemixer"

inherit rpm
