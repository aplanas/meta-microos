SUMMARY = "Translations for package gnome-user-share"
DESCRIPTION = "Provides translations for the 'gnome-user-share' package."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-user-share-lang-43.0-1.3.noarch.rpm"
RPM_HASH = "145ebf0bd5bc75743d3c19cf61990aee464080095147a8518d10a10ca910493ed56e44b66e4f4f914fa14e8996ca3335e92d4aef9c58e10c9112fae97bdf7ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-user-share-lang \
gnome-user-share-lang-all \
locale(gnome-user-share:af) \
locale(gnome-user-share:ar) \
locale(gnome-user-share:as) \
locale(gnome-user-share:ast) \
locale(gnome-user-share:be) \
locale(gnome-user-share:bg) \
locale(gnome-user-share:bn) \
locale(gnome-user-share:bn_IN) \
locale(gnome-user-share:br) \
locale(gnome-user-share:bs) \
locale(gnome-user-share:ca) \
locale(gnome-user-share:ca@valencia) \
locale(gnome-user-share:cs) \
locale(gnome-user-share:da) \
locale(gnome-user-share:de) \
locale(gnome-user-share:dz) \
locale(gnome-user-share:el) \
locale(gnome-user-share:en@shaw) \
locale(gnome-user-share:en_CA) \
locale(gnome-user-share:en_GB) \
locale(gnome-user-share:eo) \
locale(gnome-user-share:es) \
locale(gnome-user-share:et) \
locale(gnome-user-share:eu) \
locale(gnome-user-share:fa) \
locale(gnome-user-share:fi) \
locale(gnome-user-share:fr) \
locale(gnome-user-share:fur) \
locale(gnome-user-share:ga) \
locale(gnome-user-share:gd) \
locale(gnome-user-share:gl) \
locale(gnome-user-share:gu) \
locale(gnome-user-share:he) \
locale(gnome-user-share:hi) \
locale(gnome-user-share:hr) \
locale(gnome-user-share:hu) \
locale(gnome-user-share:id) \
locale(gnome-user-share:is) \
locale(gnome-user-share:it) \
locale(gnome-user-share:ja) \
locale(gnome-user-share:ka) \
locale(gnome-user-share:kk) \
locale(gnome-user-share:km) \
locale(gnome-user-share:kn) \
locale(gnome-user-share:ko) \
locale(gnome-user-share:lt) \
locale(gnome-user-share:lv) \
locale(gnome-user-share:mai) \
locale(gnome-user-share:mk) \
locale(gnome-user-share:ml) \
locale(gnome-user-share:mr) \
locale(gnome-user-share:ms) \
locale(gnome-user-share:nb) \
locale(gnome-user-share:ne) \
locale(gnome-user-share:nl) \
locale(gnome-user-share:nn) \
locale(gnome-user-share:oc) \
locale(gnome-user-share:or) \
locale(gnome-user-share:pa) \
locale(gnome-user-share:pl) \
locale(gnome-user-share:pt) \
locale(gnome-user-share:pt_BR) \
locale(gnome-user-share:ro) \
locale(gnome-user-share:ru) \
locale(gnome-user-share:sk) \
locale(gnome-user-share:sl) \
locale(gnome-user-share:sq) \
locale(gnome-user-share:sr) \
locale(gnome-user-share:sr@latin) \
locale(gnome-user-share:sv) \
locale(gnome-user-share:ta) \
locale(gnome-user-share:te) \
locale(gnome-user-share:th) \
locale(gnome-user-share:tr) \
locale(gnome-user-share:ug) \
locale(gnome-user-share:uk) \
locale(gnome-user-share:vi) \
locale(gnome-user-share:zh_CN) \
locale(gnome-user-share:zh_HK) \
locale(gnome-user-share:zh_TW)"
RDEPENDS:${PN} += "gnome-user-share"

inherit rpm
