SUMMARY = "Translations for package seahorse-nautilus"
DESCRIPTION = "Provides translations for the 'seahorse-nautilus' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.92+95"

RPM_NAME = "seahorse-nautilus-lang-3.11.92+95-1.3.noarch.rpm"
RPM_HASH = "84ad2503645dbc8966738a9e7c9739124ca7927f86f11edc02e230bd9458475cd70dab2759a3af046ca9dab947008299e7a7377942063f5d68c86182fd38ade3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(seahorse-nautilus:ar) locale(seahorse-nautilus:as) locale(seahorse-nautilus:ast) locale(seahorse-nautilus:az) locale(seahorse-nautilus:be@latin) locale(seahorse-nautilus:bg) locale(seahorse-nautilus:bn) locale(seahorse-nautilus:bn_IN) locale(seahorse-nautilus:br) locale(seahorse-nautilus:bs) locale(seahorse-nautilus:ca) locale(seahorse-nautilus:ca@valencia) locale(seahorse-nautilus:cs) locale(seahorse-nautilus:da) locale(seahorse-nautilus:de) locale(seahorse-nautilus:dz) locale(seahorse-nautilus:el) locale(seahorse-nautilus:en@shaw) locale(seahorse-nautilus:en_CA) locale(seahorse-nautilus:en_GB) locale(seahorse-nautilus:eo) locale(seahorse-nautilus:es) locale(seahorse-nautilus:et) locale(seahorse-nautilus:eu) locale(seahorse-nautilus:fi) locale(seahorse-nautilus:fr) locale(seahorse-nautilus:fur) locale(seahorse-nautilus:ga) locale(seahorse-nautilus:gl) locale(seahorse-nautilus:gu) locale(seahorse-nautilus:he) locale(seahorse-nautilus:hi) locale(seahorse-nautilus:hr) locale(seahorse-nautilus:hu) locale(seahorse-nautilus:id) locale(seahorse-nautilus:it) locale(seahorse-nautilus:ja) locale(seahorse-nautilus:kn) locale(seahorse-nautilus:ko) locale(seahorse-nautilus:lt) locale(seahorse-nautilus:lv) locale(seahorse-nautilus:mai) locale(seahorse-nautilus:mk) locale(seahorse-nautilus:ml) locale(seahorse-nautilus:mr) locale(seahorse-nautilus:ms) locale(seahorse-nautilus:nb) locale(seahorse-nautilus:ne) locale(seahorse-nautilus:nl) locale(seahorse-nautilus:nn) locale(seahorse-nautilus:oc) locale(seahorse-nautilus:or) locale(seahorse-nautilus:pa) locale(seahorse-nautilus:pl) locale(seahorse-nautilus:pt) locale(seahorse-nautilus:pt_BR) locale(seahorse-nautilus:ro) locale(seahorse-nautilus:ru) locale(seahorse-nautilus:si) locale(seahorse-nautilus:sk) locale(seahorse-nautilus:sl) locale(seahorse-nautilus:sq) locale(seahorse-nautilus:sr) locale(seahorse-nautilus:sr@latin) locale(seahorse-nautilus:sv) locale(seahorse-nautilus:ta) locale(seahorse-nautilus:te) locale(seahorse-nautilus:th) locale(seahorse-nautilus:tr) locale(seahorse-nautilus:ug) locale(seahorse-nautilus:uk) locale(seahorse-nautilus:vi) locale(seahorse-nautilus:zh_CN) locale(seahorse-nautilus:zh_HK) locale(seahorse-nautilus:zh_TW) seahorse-nautilus-lang seahorse-nautilus-lang-all"
RDEPENDS:${PN} += "seahorse-nautilus"

inherit rpm
