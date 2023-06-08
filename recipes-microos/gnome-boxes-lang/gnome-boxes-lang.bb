SUMMARY = "Translations for package gnome-boxes"
DESCRIPTION = "Provides translations for the 'gnome-boxes' package."
LICENSE = "LGPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-boxes-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "d3d57a24d8961035a56a6d3c2c949eb8576304b7bdb529174e05872325485e109870a242b658f4cb6bbb480797c699ceb834d9ee4c4b8c9282729163b630754f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-boxes-lang gnome-boxes-lang-all locale(gnome-boxes:af) locale(gnome-boxes:ar) locale(gnome-boxes:as) locale(gnome-boxes:be) locale(gnome-boxes:bg) locale(gnome-boxes:bn_IN) locale(gnome-boxes:bs) locale(gnome-boxes:ca) locale(gnome-boxes:ca@valencia) locale(gnome-boxes:cs) locale(gnome-boxes:da) locale(gnome-boxes:de) locale(gnome-boxes:el) locale(gnome-boxes:en_GB) locale(gnome-boxes:eo) locale(gnome-boxes:es) locale(gnome-boxes:et) locale(gnome-boxes:eu) locale(gnome-boxes:fa) locale(gnome-boxes:fi) locale(gnome-boxes:fr) locale(gnome-boxes:fur) locale(gnome-boxes:ga) locale(gnome-boxes:gl) locale(gnome-boxes:gu) locale(gnome-boxes:he) locale(gnome-boxes:hi) locale(gnome-boxes:hr) locale(gnome-boxes:hu) locale(gnome-boxes:id) locale(gnome-boxes:it) locale(gnome-boxes:ja) locale(gnome-boxes:ka) locale(gnome-boxes:kk) locale(gnome-boxes:km) locale(gnome-boxes:kn) locale(gnome-boxes:ko) locale(gnome-boxes:lt) locale(gnome-boxes:lv) locale(gnome-boxes:ml) locale(gnome-boxes:mr) locale(gnome-boxes:ms) locale(gnome-boxes:nb) locale(gnome-boxes:ne) locale(gnome-boxes:nl) locale(gnome-boxes:oc) locale(gnome-boxes:or) locale(gnome-boxes:pa) locale(gnome-boxes:pl) locale(gnome-boxes:pt) locale(gnome-boxes:pt_BR) locale(gnome-boxes:ro) locale(gnome-boxes:ru) locale(gnome-boxes:sk) locale(gnome-boxes:sl) locale(gnome-boxes:sr) locale(gnome-boxes:sr@latin) locale(gnome-boxes:sv) locale(gnome-boxes:ta) locale(gnome-boxes:te) locale(gnome-boxes:th) locale(gnome-boxes:tr) locale(gnome-boxes:ug) locale(gnome-boxes:uk) locale(gnome-boxes:vi) locale(gnome-boxes:zh_CN) locale(gnome-boxes:zh_HK) locale(gnome-boxes:zh_TW)"
RDEPENDS:${PN} += "gnome-boxes"

inherit rpm
