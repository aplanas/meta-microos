SUMMARY = "Translations for package mate-menu"
DESCRIPTION = "Provides translations for the 'mate-menu' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.04.2"

RPM_NAME = "mate-menu-lang-22.04.2-1.4.noarch.rpm"
RPM_HASH = "04e915b34dfe7c3adaec1838ff36e1fe948fb76453322d2f3666794c5ac60c251ad3c914e9375e6290d9aa0240ba915fff5e42b285a69fd90501b492fbf4dfd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-menu:af) \
locale(mate-menu:ar) \
locale(mate-menu:as) \
locale(mate-menu:ast) \
locale(mate-menu:az) \
locale(mate-menu:be) \
locale(mate-menu:bg) \
locale(mate-menu:bn) \
locale(mate-menu:bn_IN) \
locale(mate-menu:br) \
locale(mate-menu:bs) \
locale(mate-menu:ca) \
locale(mate-menu:ca@valencia) \
locale(mate-menu:cs) \
locale(mate-menu:cy) \
locale(mate-menu:da) \
locale(mate-menu:de) \
locale(mate-menu:de_CH) \
locale(mate-menu:dz) \
locale(mate-menu:el) \
locale(mate-menu:en) \
locale(mate-menu:en_AU) \
locale(mate-menu:en_CA) \
locale(mate-menu:en_GB) \
locale(mate-menu:en_US) \
locale(mate-menu:eo) \
locale(mate-menu:es) \
locale(mate-menu:es_AR) \
locale(mate-menu:es_CL) \
locale(mate-menu:es_CO) \
locale(mate-menu:es_CR) \
locale(mate-menu:es_DO) \
locale(mate-menu:es_EC) \
locale(mate-menu:es_ES) \
locale(mate-menu:es_MX) \
locale(mate-menu:es_NI) \
locale(mate-menu:es_PA) \
locale(mate-menu:es_PE) \
locale(mate-menu:es_PR) \
locale(mate-menu:es_SV) \
locale(mate-menu:es_UY) \
locale(mate-menu:es_VE) \
locale(mate-menu:et) \
locale(mate-menu:eu) \
locale(mate-menu:fa) \
locale(mate-menu:fi) \
locale(mate-menu:fr) \
locale(mate-menu:fr_CA) \
locale(mate-menu:fur) \
locale(mate-menu:ga) \
locale(mate-menu:gd) \
locale(mate-menu:gl) \
locale(mate-menu:gu) \
locale(mate-menu:he) \
locale(mate-menu:hi) \
locale(mate-menu:hr) \
locale(mate-menu:hu) \
locale(mate-menu:ia) \
locale(mate-menu:id) \
locale(mate-menu:is) \
locale(mate-menu:it) \
locale(mate-menu:ja) \
locale(mate-menu:ka) \
locale(mate-menu:kk) \
locale(mate-menu:km) \
locale(mate-menu:kn) \
locale(mate-menu:ko) \
locale(mate-menu:lt) \
locale(mate-menu:lv) \
locale(mate-menu:mai) \
locale(mate-menu:mk) \
locale(mate-menu:ml) \
locale(mate-menu:mr) \
locale(mate-menu:ms) \
locale(mate-menu:nb) \
locale(mate-menu:nds) \
locale(mate-menu:ne) \
locale(mate-menu:nl) \
locale(mate-menu:nn) \
locale(mate-menu:oc) \
locale(mate-menu:or) \
locale(mate-menu:pa) \
locale(mate-menu:pl) \
locale(mate-menu:pl_PL) \
locale(mate-menu:pt) \
locale(mate-menu:pt_BR) \
locale(mate-menu:ro) \
locale(mate-menu:ru) \
locale(mate-menu:ru_RU) \
locale(mate-menu:si) \
locale(mate-menu:sk) \
locale(mate-menu:sl) \
locale(mate-menu:sq) \
locale(mate-menu:sr) \
locale(mate-menu:sr@latin) \
locale(mate-menu:sv) \
locale(mate-menu:ta) \
locale(mate-menu:te) \
locale(mate-menu:th) \
locale(mate-menu:tr) \
locale(mate-menu:ug) \
locale(mate-menu:uk) \
locale(mate-menu:uk_UA) \
locale(mate-menu:vi) \
locale(mate-menu:wa) \
locale(mate-menu:zh_CN) \
locale(mate-menu:zh_HK) \
locale(mate-menu:zh_TW) \
mate-menu-lang \
mate-menu-lang-all"
RDEPENDS:${PN} += "mate-menu"

inherit rpm
