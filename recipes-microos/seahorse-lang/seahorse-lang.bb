SUMMARY = "Translations for package seahorse"
DESCRIPTION = "Provides translations for the 'seahorse' package."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "seahorse-lang-43.0-3.4.noarch.rpm"
RPM_HASH = "3b3d2d05c3d125f888dc64a193601fbe49d546a76320d9376941f2fb9bb20ccecee2c5e2e4bb38573ce8be8ae6a5faeef69185e62abe2650bfb77075b1ecb2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(seahorse:ar) locale(seahorse:as) locale(seahorse:ast) locale(seahorse:az) locale(seahorse:be) locale(seahorse:be@latin) locale(seahorse:bg) locale(seahorse:bn) locale(seahorse:bn_IN) locale(seahorse:br) locale(seahorse:bs) locale(seahorse:ca) locale(seahorse:ca@valencia) locale(seahorse:cs) locale(seahorse:cy) locale(seahorse:da) locale(seahorse:de) locale(seahorse:dz) locale(seahorse:el) locale(seahorse:en@shaw) locale(seahorse:en_CA) locale(seahorse:en_GB) locale(seahorse:eo) locale(seahorse:es) locale(seahorse:et) locale(seahorse:eu) locale(seahorse:fa) locale(seahorse:fi) locale(seahorse:fr) locale(seahorse:fur) locale(seahorse:ga) locale(seahorse:gd) locale(seahorse:gl) locale(seahorse:gu) locale(seahorse:he) locale(seahorse:hi) locale(seahorse:hr) locale(seahorse:hu) locale(seahorse:id) locale(seahorse:is) locale(seahorse:it) locale(seahorse:ja) locale(seahorse:ka) locale(seahorse:kk) locale(seahorse:kn) locale(seahorse:ko) locale(seahorse:lt) locale(seahorse:lv) locale(seahorse:mai) locale(seahorse:mk) locale(seahorse:ml) locale(seahorse:mr) locale(seahorse:ms) locale(seahorse:nb) locale(seahorse:ne) locale(seahorse:nl) locale(seahorse:nn) locale(seahorse:oc) locale(seahorse:or) locale(seahorse:pa) locale(seahorse:pl) locale(seahorse:pt) locale(seahorse:pt_BR) locale(seahorse:ro) locale(seahorse:ru) locale(seahorse:si) locale(seahorse:sk) locale(seahorse:sl) locale(seahorse:sq) locale(seahorse:sr) locale(seahorse:sr@latin) locale(seahorse:sv) locale(seahorse:ta) locale(seahorse:te) locale(seahorse:th) locale(seahorse:tr) locale(seahorse:ug) locale(seahorse:uk) locale(seahorse:vi) locale(seahorse:zh_CN) locale(seahorse:zh_HK) locale(seahorse:zh_TW) seahorse-lang seahorse-lang-all"
RDEPENDS:${PN} += "seahorse"

inherit rpm
