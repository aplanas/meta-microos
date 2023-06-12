SUMMARY = "Translations for package vte"
DESCRIPTION = "Provides translations for the 'vte' package."
LICENSE = "CC-BY-4.0 & LGPL-3.0-or-later & GPL-3.0-or-later & MIT"

PV = "0.72.1"

RPM_NAME = "vte-lang-0.72.1-2.2.noarch.rpm"
RPM_HASH = "3071d67fd2038ac8b3fa18abdb55d976cffc90a002abc064167b201aecb903711dc1eb8ef8100155fcc3fc879a93e2a59ecea7c8818ff9fc85262bef2b39c2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(vte:ar) locale(vte:as) locale(vte:ast) locale(vte:az) locale(vte:be) locale(vte:be@latin) locale(vte:bg) locale(vte:bn) locale(vte:bn_IN) locale(vte:bs) locale(vte:ca) locale(vte:ca@valencia) locale(vte:cs) locale(vte:cy) locale(vte:da) locale(vte:de) locale(vte:dz) locale(vte:el) locale(vte:en@shaw) locale(vte:en_CA) locale(vte:en_GB) locale(vte:eo) locale(vte:es) locale(vte:et) locale(vte:eu) locale(vte:fa) locale(vte:fi) locale(vte:fr) locale(vte:fur) locale(vte:ga) locale(vte:gd) locale(vte:gl) locale(vte:gu) locale(vte:he) locale(vte:hi) locale(vte:hr) locale(vte:hu) locale(vte:id) locale(vte:is) locale(vte:it) locale(vte:ja) locale(vte:ka) locale(vte:kk) locale(vte:kn) locale(vte:ko) locale(vte:lt) locale(vte:lv) locale(vte:mai) locale(vte:mk) locale(vte:ml) locale(vte:mr) locale(vte:ms) locale(vte:nb) locale(vte:nds) locale(vte:ne) locale(vte:nl) locale(vte:nn) locale(vte:oc) locale(vte:or) locale(vte:pa) locale(vte:pl) locale(vte:pt) locale(vte:pt_BR) locale(vte:ro) locale(vte:ru) locale(vte:si) locale(vte:sk) locale(vte:sl) locale(vte:sq) locale(vte:sr) locale(vte:sr@latin) locale(vte:sv) locale(vte:ta) locale(vte:te) locale(vte:th) locale(vte:tr) locale(vte:ug) locale(vte:uk) locale(vte:vi) locale(vte:wa) locale(vte:zh_CN) locale(vte:zh_HK) locale(vte:zh_TW) vte-lang vte-lang-all"
RDEPENDS:${PN} += "vte"

inherit rpm
