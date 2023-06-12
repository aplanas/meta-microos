SUMMARY = "Translations for package gnome-menus"
DESCRIPTION = "Provides translations for the 'gnome-menus' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-menus-lang-3.36.0-3.3.noarch.rpm"
RPM_HASH = "e14a3fdf2159f30961e4b8015920a68bd7f7aa80782ad9c65c4de61ce6e0f92a7230321e5f7bda90ac6e6273b3693652719df62de99b15d9cc05c12fbe6cf03d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-menus-lang \
gnome-menus-lang-all \
locale(gnome-menus:af) \
locale(gnome-menus:ar) \
locale(gnome-menus:as) \
locale(gnome-menus:ast) \
locale(gnome-menus:be) \
locale(gnome-menus:be@latin) \
locale(gnome-menus:bg) \
locale(gnome-menus:bn) \
locale(gnome-menus:bn_IN) \
locale(gnome-menus:br) \
locale(gnome-menus:bs) \
locale(gnome-menus:ca) \
locale(gnome-menus:ca@valencia) \
locale(gnome-menus:cs) \
locale(gnome-menus:cy) \
locale(gnome-menus:da) \
locale(gnome-menus:de) \
locale(gnome-menus:dz) \
locale(gnome-menus:el) \
locale(gnome-menus:en@shaw) \
locale(gnome-menus:en_CA) \
locale(gnome-menus:en_GB) \
locale(gnome-menus:eo) \
locale(gnome-menus:es) \
locale(gnome-menus:et) \
locale(gnome-menus:eu) \
locale(gnome-menus:fa) \
locale(gnome-menus:fi) \
locale(gnome-menus:fr) \
locale(gnome-menus:fur) \
locale(gnome-menus:ga) \
locale(gnome-menus:gd) \
locale(gnome-menus:gl) \
locale(gnome-menus:gu) \
locale(gnome-menus:he) \
locale(gnome-menus:hi) \
locale(gnome-menus:hr) \
locale(gnome-menus:hu) \
locale(gnome-menus:ia) \
locale(gnome-menus:id) \
locale(gnome-menus:is) \
locale(gnome-menus:it) \
locale(gnome-menus:ja) \
locale(gnome-menus:ka) \
locale(gnome-menus:kk) \
locale(gnome-menus:km) \
locale(gnome-menus:kn) \
locale(gnome-menus:ko) \
locale(gnome-menus:lt) \
locale(gnome-menus:lv) \
locale(gnome-menus:mai) \
locale(gnome-menus:mk) \
locale(gnome-menus:ml) \
locale(gnome-menus:mr) \
locale(gnome-menus:ms) \
locale(gnome-menus:nb) \
locale(gnome-menus:nds) \
locale(gnome-menus:ne) \
locale(gnome-menus:nl) \
locale(gnome-menus:nn) \
locale(gnome-menus:oc) \
locale(gnome-menus:or) \
locale(gnome-menus:pa) \
locale(gnome-menus:pl) \
locale(gnome-menus:pt) \
locale(gnome-menus:pt_BR) \
locale(gnome-menus:ro) \
locale(gnome-menus:ru) \
locale(gnome-menus:si) \
locale(gnome-menus:sk) \
locale(gnome-menus:sl) \
locale(gnome-menus:sq) \
locale(gnome-menus:sr) \
locale(gnome-menus:sr@latin) \
locale(gnome-menus:sv) \
locale(gnome-menus:ta) \
locale(gnome-menus:te) \
locale(gnome-menus:th) \
locale(gnome-menus:tr) \
locale(gnome-menus:ug) \
locale(gnome-menus:uk) \
locale(gnome-menus:vi) \
locale(gnome-menus:zh_CN) \
locale(gnome-menus:zh_HK) \
locale(gnome-menus:zh_TW)"
RDEPENDS:${PN} += "gnome-menus"

inherit rpm
