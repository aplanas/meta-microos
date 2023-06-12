SUMMARY = "Translations for package mate-terminal"
DESCRIPTION = "Provides translations for the 'mate-terminal' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-terminal-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "d1ac8e0da6a6336127c8a37021689b3a664527ce586ce4785ba19ae4be7223ab57a7d83549f5948b8df4cc96d68ac10b552d71f74f59856a113596785959bd55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-terminal:af) \
locale(mate-terminal:ar) \
locale(mate-terminal:as) \
locale(mate-terminal:ast) \
locale(mate-terminal:az) \
locale(mate-terminal:be) \
locale(mate-terminal:bg) \
locale(mate-terminal:bn) \
locale(mate-terminal:bn_IN) \
locale(mate-terminal:br) \
locale(mate-terminal:bs) \
locale(mate-terminal:ca) \
locale(mate-terminal:ca@valencia) \
locale(mate-terminal:cs) \
locale(mate-terminal:cy) \
locale(mate-terminal:da) \
locale(mate-terminal:de) \
locale(mate-terminal:dz) \
locale(mate-terminal:el) \
locale(mate-terminal:en_AU) \
locale(mate-terminal:en_CA) \
locale(mate-terminal:en_GB) \
locale(mate-terminal:en_US) \
locale(mate-terminal:eo) \
locale(mate-terminal:es) \
locale(mate-terminal:es_AR) \
locale(mate-terminal:es_CL) \
locale(mate-terminal:es_CO) \
locale(mate-terminal:es_ES) \
locale(mate-terminal:es_MX) \
locale(mate-terminal:es_PR) \
locale(mate-terminal:et) \
locale(mate-terminal:eu) \
locale(mate-terminal:fa) \
locale(mate-terminal:fi) \
locale(mate-terminal:fr) \
locale(mate-terminal:fr_CA) \
locale(mate-terminal:fur) \
locale(mate-terminal:ga) \
locale(mate-terminal:gl) \
locale(mate-terminal:gu) \
locale(mate-terminal:he) \
locale(mate-terminal:hi) \
locale(mate-terminal:hr) \
locale(mate-terminal:hu) \
locale(mate-terminal:ia) \
locale(mate-terminal:id) \
locale(mate-terminal:is) \
locale(mate-terminal:it) \
locale(mate-terminal:ja) \
locale(mate-terminal:ka) \
locale(mate-terminal:kk) \
locale(mate-terminal:kn) \
locale(mate-terminal:ko) \
locale(mate-terminal:lt) \
locale(mate-terminal:lv) \
locale(mate-terminal:mai) \
locale(mate-terminal:mk) \
locale(mate-terminal:ml) \
locale(mate-terminal:mr) \
locale(mate-terminal:ms) \
locale(mate-terminal:nb) \
locale(mate-terminal:nds) \
locale(mate-terminal:ne) \
locale(mate-terminal:nl) \
locale(mate-terminal:nn) \
locale(mate-terminal:oc) \
locale(mate-terminal:or) \
locale(mate-terminal:pa) \
locale(mate-terminal:pl) \
locale(mate-terminal:pt) \
locale(mate-terminal:pt_BR) \
locale(mate-terminal:ro) \
locale(mate-terminal:ru) \
locale(mate-terminal:si) \
locale(mate-terminal:sk) \
locale(mate-terminal:sl) \
locale(mate-terminal:sq) \
locale(mate-terminal:sr) \
locale(mate-terminal:sr@latin) \
locale(mate-terminal:sv) \
locale(mate-terminal:ta) \
locale(mate-terminal:te) \
locale(mate-terminal:th) \
locale(mate-terminal:tr) \
locale(mate-terminal:ug) \
locale(mate-terminal:uk) \
locale(mate-terminal:vi) \
locale(mate-terminal:wa) \
locale(mate-terminal:zh_CN) \
locale(mate-terminal:zh_HK) \
locale(mate-terminal:zh_TW) \
mate-terminal-lang \
mate-terminal-lang-all"
RDEPENDS:${PN} += "mate-terminal"

inherit rpm
