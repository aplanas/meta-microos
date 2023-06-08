SUMMARY = "Translations for package gnome-clocks"
DESCRIPTION = "Provides translations for the 'gnome-clocks' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-clocks-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "311f843ffb48b854cd4c5f0bf491b60128decb7fcd5deb80a0ec8cfc2ac728ff1875f0f2f3d30b312b2b03a7089ef01b0a44c4b25ad5e1a9de4416f5a0a98281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-clocks-lang gnome-clocks-lang-all locale(gnome-clocks:af) locale(gnome-clocks:ar) locale(gnome-clocks:as) locale(gnome-clocks:be) locale(gnome-clocks:bg) locale(gnome-clocks:bn_IN) locale(gnome-clocks:bs) locale(gnome-clocks:ca) locale(gnome-clocks:ca@valencia) locale(gnome-clocks:cs) locale(gnome-clocks:da) locale(gnome-clocks:de) locale(gnome-clocks:el) locale(gnome-clocks:en_GB) locale(gnome-clocks:eo) locale(gnome-clocks:es) locale(gnome-clocks:et) locale(gnome-clocks:eu) locale(gnome-clocks:fa) locale(gnome-clocks:fi) locale(gnome-clocks:fr) locale(gnome-clocks:fur) locale(gnome-clocks:ga) locale(gnome-clocks:gd) locale(gnome-clocks:gl) locale(gnome-clocks:gu) locale(gnome-clocks:he) locale(gnome-clocks:hi) locale(gnome-clocks:hr) locale(gnome-clocks:hu) locale(gnome-clocks:id) locale(gnome-clocks:is) locale(gnome-clocks:it) locale(gnome-clocks:ja) locale(gnome-clocks:ka) locale(gnome-clocks:kk) locale(gnome-clocks:kn) locale(gnome-clocks:ko) locale(gnome-clocks:lt) locale(gnome-clocks:lv) locale(gnome-clocks:ml) locale(gnome-clocks:mr) locale(gnome-clocks:ms) locale(gnome-clocks:nb) locale(gnome-clocks:ne) locale(gnome-clocks:nl) locale(gnome-clocks:oc) locale(gnome-clocks:or) locale(gnome-clocks:pa) locale(gnome-clocks:pl) locale(gnome-clocks:pt) locale(gnome-clocks:pt_BR) locale(gnome-clocks:ro) locale(gnome-clocks:ru) locale(gnome-clocks:sk) locale(gnome-clocks:sl) locale(gnome-clocks:sr) locale(gnome-clocks:sr@latin) locale(gnome-clocks:sv) locale(gnome-clocks:ta) locale(gnome-clocks:te) locale(gnome-clocks:th) locale(gnome-clocks:tr) locale(gnome-clocks:ug) locale(gnome-clocks:uk) locale(gnome-clocks:vi) locale(gnome-clocks:zh_CN) locale(gnome-clocks:zh_HK) locale(gnome-clocks:zh_TW)"
RDEPENDS:${PN} += "gnome-clocks"

inherit rpm
