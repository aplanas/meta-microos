SUMMARY = "Translations for package glib-networking"
DESCRIPTION = "Provides translations for the 'glib-networking' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.0"

RPM_NAME = "glib-networking-lang-2.76.0-1.1.noarch.rpm"
RPM_HASH = "10968e3f9ac3ccf908ccb7dbfc7972df6fd00caf1b0b8c070bb042af8ca3b206c6f23acc8b92c758affa87bbc769422084cecea47c8191b8c436d973b48e9fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glib-networking-lang glib-networking-lang-all locale(glib-networking:ar) locale(glib-networking:as) locale(glib-networking:be) locale(glib-networking:bg) locale(glib-networking:bn_IN) locale(glib-networking:bs) locale(glib-networking:ca) locale(glib-networking:ca@valencia) locale(glib-networking:cs) locale(glib-networking:da) locale(glib-networking:de) locale(glib-networking:el) locale(glib-networking:en_CA) locale(glib-networking:en_GB) locale(glib-networking:eo) locale(glib-networking:es) locale(glib-networking:et) locale(glib-networking:eu) locale(glib-networking:fa) locale(glib-networking:fi) locale(glib-networking:fr) locale(glib-networking:fur) locale(glib-networking:gd) locale(glib-networking:gl) locale(glib-networking:gu) locale(glib-networking:he) locale(glib-networking:hi) locale(glib-networking:hr) locale(glib-networking:hu) locale(glib-networking:id) locale(glib-networking:it) locale(glib-networking:ja) locale(glib-networking:ka) locale(glib-networking:kk) locale(glib-networking:km) locale(glib-networking:kn) locale(glib-networking:ko) locale(glib-networking:lt) locale(glib-networking:lv) locale(glib-networking:ml) locale(glib-networking:mr) locale(glib-networking:ms) locale(glib-networking:nb) locale(glib-networking:ne) locale(glib-networking:nl) locale(glib-networking:oc) locale(glib-networking:or) locale(glib-networking:pa) locale(glib-networking:pl) locale(glib-networking:pt) locale(glib-networking:pt_BR) locale(glib-networking:ro) locale(glib-networking:ru) locale(glib-networking:sk) locale(glib-networking:sl) locale(glib-networking:sr) locale(glib-networking:sr@latin) locale(glib-networking:sv) locale(glib-networking:ta) locale(glib-networking:te) locale(glib-networking:th) locale(glib-networking:tr) locale(glib-networking:ug) locale(glib-networking:uk) locale(glib-networking:vi) locale(glib-networking:zh_CN) locale(glib-networking:zh_HK) locale(glib-networking:zh_TW)"
RDEPENDS:${PN} += "glib-networking"

inherit rpm
