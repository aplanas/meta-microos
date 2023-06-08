SUMMARY = "Translations for package orca"
DESCRIPTION = "Provides translations for the 'orca' package."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "orca-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "993afed567c5def4227cfe62b81a37dd742e0b9ab16be96e7c3882c535eb6e1b757f062b9fd28e4a4bf2263fb8a0de380631eb0f90bac6a7bcaa1545a2c34933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(orca:ar) locale(orca:ast) locale(orca:be) locale(orca:bg) locale(orca:bn) locale(orca:bn_IN) locale(orca:bs) locale(orca:ca) locale(orca:ca@valencia) locale(orca:cs) locale(orca:cy) locale(orca:da) locale(orca:de) locale(orca:dz) locale(orca:el) locale(orca:en_CA) locale(orca:en_GB) locale(orca:eo) locale(orca:es) locale(orca:et) locale(orca:eu) locale(orca:fa) locale(orca:fi) locale(orca:fr) locale(orca:fur) locale(orca:ga) locale(orca:gl) locale(orca:gu) locale(orca:he) locale(orca:hi) locale(orca:hr) locale(orca:hu) locale(orca:id) locale(orca:is) locale(orca:it) locale(orca:ja) locale(orca:ka) locale(orca:kk) locale(orca:kn) locale(orca:ko) locale(orca:lt) locale(orca:lv) locale(orca:mai) locale(orca:mk) locale(orca:ml) locale(orca:mr) locale(orca:ms) locale(orca:nb) locale(orca:ne) locale(orca:nl) locale(orca:nn) locale(orca:oc) locale(orca:or) locale(orca:pa) locale(orca:pl) locale(orca:pt) locale(orca:pt_BR) locale(orca:ro) locale(orca:ru) locale(orca:si) locale(orca:sk) locale(orca:sl) locale(orca:sq) locale(orca:sr) locale(orca:sr@latin) locale(orca:sv) locale(orca:ta) locale(orca:te) locale(orca:th) locale(orca:tr) locale(orca:ug) locale(orca:uk) locale(orca:vi) locale(orca:zh_CN) locale(orca:zh_HK) locale(orca:zh_TW) orca-lang orca-lang-all"
RDEPENDS:${PN} += "orca"

inherit rpm
