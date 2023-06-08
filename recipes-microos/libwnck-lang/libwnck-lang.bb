SUMMARY = "Translations for package libwnck"
DESCRIPTION = "Provides translations for the 'libwnck' package."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "libwnck-lang-43.0-3.3.noarch.rpm"
RPM_HASH = "37e8fa4de4778f37d26f07a26e72f4ddc559738d2c93b6e0586a86d739e6e91dd0048761c6711154ffb2d475528e321f4ac23829831915f5892ccdf2445c99f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwnck-lang libwnck-lang-all locale(libwnck:ar) locale(libwnck:as) locale(libwnck:ast) locale(libwnck:az) locale(libwnck:be) locale(libwnck:be@latin) locale(libwnck:bg) locale(libwnck:bn) locale(libwnck:bn_IN) locale(libwnck:br) locale(libwnck:bs) locale(libwnck:ca) locale(libwnck:ca@valencia) locale(libwnck:cs) locale(libwnck:cy) locale(libwnck:da) locale(libwnck:de) locale(libwnck:dz) locale(libwnck:el) locale(libwnck:en@shaw) locale(libwnck:en_CA) locale(libwnck:en_GB) locale(libwnck:eo) locale(libwnck:es) locale(libwnck:et) locale(libwnck:eu) locale(libwnck:fa) locale(libwnck:fi) locale(libwnck:fr) locale(libwnck:ga) locale(libwnck:gd) locale(libwnck:gl) locale(libwnck:gu) locale(libwnck:he) locale(libwnck:hi) locale(libwnck:hr) locale(libwnck:hu) locale(libwnck:id) locale(libwnck:is) locale(libwnck:it) locale(libwnck:ja) locale(libwnck:ka) locale(libwnck:kk) locale(libwnck:km) locale(libwnck:kn) locale(libwnck:ko) locale(libwnck:lt) locale(libwnck:lv) locale(libwnck:mai) locale(libwnck:mk) locale(libwnck:ml) locale(libwnck:mr) locale(libwnck:ms) locale(libwnck:nb) locale(libwnck:ne) locale(libwnck:nl) locale(libwnck:nn) locale(libwnck:oc) locale(libwnck:or) locale(libwnck:pa) locale(libwnck:pl) locale(libwnck:pt) locale(libwnck:pt_BR) locale(libwnck:ro) locale(libwnck:ru) locale(libwnck:si) locale(libwnck:sk) locale(libwnck:sl) locale(libwnck:sq) locale(libwnck:sr) locale(libwnck:sr@latin) locale(libwnck:sv) locale(libwnck:ta) locale(libwnck:te) locale(libwnck:th) locale(libwnck:tr) locale(libwnck:ug) locale(libwnck:uk) locale(libwnck:vi) locale(libwnck:wa) locale(libwnck:zh_CN) locale(libwnck:zh_HK) locale(libwnck:zh_TW)"
RDEPENDS:${PN} += "libwnck"

inherit rpm
