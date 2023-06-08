SUMMARY = "Translations for package gnome-desktop"
DESCRIPTION = "Provides translations for the 'gnome-desktop' package."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "gnome-desktop-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "5e56fa82f0104afff01c344db1c28247ef51627607f11cb12b05a46e6f1bba71fea4a4aa16808eadc63996d98b2a5cda03fd13efd9257a1b6ac3dbd1a37a3e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-desktop-lang gnome-desktop-lang-all locale(gnome-desktop:af) locale(gnome-desktop:ar) locale(gnome-desktop:as) locale(gnome-desktop:ast) locale(gnome-desktop:az) locale(gnome-desktop:be) locale(gnome-desktop:be@latin) locale(gnome-desktop:bg) locale(gnome-desktop:bn) locale(gnome-desktop:bn_IN) locale(gnome-desktop:br) locale(gnome-desktop:bs) locale(gnome-desktop:ca) locale(gnome-desktop:ca@valencia) locale(gnome-desktop:cs) locale(gnome-desktop:cy) locale(gnome-desktop:da) locale(gnome-desktop:de) locale(gnome-desktop:dz) locale(gnome-desktop:el) locale(gnome-desktop:en@shaw) locale(gnome-desktop:en_CA) locale(gnome-desktop:en_GB) locale(gnome-desktop:eo) locale(gnome-desktop:es) locale(gnome-desktop:et) locale(gnome-desktop:eu) locale(gnome-desktop:fa) locale(gnome-desktop:fi) locale(gnome-desktop:fr) locale(gnome-desktop:fur) locale(gnome-desktop:ga) locale(gnome-desktop:gd) locale(gnome-desktop:gl) locale(gnome-desktop:gu) locale(gnome-desktop:he) locale(gnome-desktop:hi) locale(gnome-desktop:hr) locale(gnome-desktop:hu) locale(gnome-desktop:id) locale(gnome-desktop:is) locale(gnome-desktop:it) locale(gnome-desktop:ja) locale(gnome-desktop:ka) locale(gnome-desktop:kk) locale(gnome-desktop:km) locale(gnome-desktop:kn) locale(gnome-desktop:ko) locale(gnome-desktop:lt) locale(gnome-desktop:lv) locale(gnome-desktop:mai) locale(gnome-desktop:mk) locale(gnome-desktop:ml) locale(gnome-desktop:mr) locale(gnome-desktop:ms) locale(gnome-desktop:nb) locale(gnome-desktop:nds) locale(gnome-desktop:ne) locale(gnome-desktop:nl) locale(gnome-desktop:nn) locale(gnome-desktop:oc) locale(gnome-desktop:or) locale(gnome-desktop:pa) locale(gnome-desktop:pl) locale(gnome-desktop:pt) locale(gnome-desktop:pt_BR) locale(gnome-desktop:ro) locale(gnome-desktop:ru) locale(gnome-desktop:si) locale(gnome-desktop:sk) locale(gnome-desktop:sl) locale(gnome-desktop:sq) locale(gnome-desktop:sr) locale(gnome-desktop:sr@latin) locale(gnome-desktop:sv) locale(gnome-desktop:ta) locale(gnome-desktop:te) locale(gnome-desktop:th) locale(gnome-desktop:tr) locale(gnome-desktop:ug) locale(gnome-desktop:uk) locale(gnome-desktop:vi) locale(gnome-desktop:wa) locale(gnome-desktop:zh_CN) locale(gnome-desktop:zh_HK) locale(gnome-desktop:zh_TW)"
RDEPENDS:${PN} += "gnome-desktop"

inherit rpm
