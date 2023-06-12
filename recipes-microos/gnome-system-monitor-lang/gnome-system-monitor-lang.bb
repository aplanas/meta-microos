SUMMARY = "Translations for package gnome-system-monitor"
DESCRIPTION = "Provides translations for the 'gnome-system-monitor' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-system-monitor-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "f6bd97dd232b9b154112a75329d06307db42b234c1096a984f3c0ddd2b05a12bd627b9dd5c16721b19bb910884826d8108395a5d57e07a441fb562a0ac3ff15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-system-monitor-lang \
gnome-system-monitor-lang-all \
locale(gnome-system-monitor:ar) \
locale(gnome-system-monitor:as) \
locale(gnome-system-monitor:ast) \
locale(gnome-system-monitor:az) \
locale(gnome-system-monitor:be) \
locale(gnome-system-monitor:be@latin) \
locale(gnome-system-monitor:bg) \
locale(gnome-system-monitor:bn) \
locale(gnome-system-monitor:bn_IN) \
locale(gnome-system-monitor:bs) \
locale(gnome-system-monitor:ca) \
locale(gnome-system-monitor:ca@valencia) \
locale(gnome-system-monitor:cs) \
locale(gnome-system-monitor:cy) \
locale(gnome-system-monitor:da) \
locale(gnome-system-monitor:de) \
locale(gnome-system-monitor:dz) \
locale(gnome-system-monitor:el) \
locale(gnome-system-monitor:en@shaw) \
locale(gnome-system-monitor:en_CA) \
locale(gnome-system-monitor:en_GB) \
locale(gnome-system-monitor:eo) \
locale(gnome-system-monitor:es) \
locale(gnome-system-monitor:et) \
locale(gnome-system-monitor:eu) \
locale(gnome-system-monitor:fa) \
locale(gnome-system-monitor:fi) \
locale(gnome-system-monitor:fr) \
locale(gnome-system-monitor:fur) \
locale(gnome-system-monitor:ga) \
locale(gnome-system-monitor:gd) \
locale(gnome-system-monitor:gl) \
locale(gnome-system-monitor:gu) \
locale(gnome-system-monitor:he) \
locale(gnome-system-monitor:hi) \
locale(gnome-system-monitor:hr) \
locale(gnome-system-monitor:hu) \
locale(gnome-system-monitor:id) \
locale(gnome-system-monitor:is) \
locale(gnome-system-monitor:it) \
locale(gnome-system-monitor:ja) \
locale(gnome-system-monitor:ka) \
locale(gnome-system-monitor:kk) \
locale(gnome-system-monitor:km) \
locale(gnome-system-monitor:kn) \
locale(gnome-system-monitor:ko) \
locale(gnome-system-monitor:lt) \
locale(gnome-system-monitor:lv) \
locale(gnome-system-monitor:mai) \
locale(gnome-system-monitor:mk) \
locale(gnome-system-monitor:ml) \
locale(gnome-system-monitor:mr) \
locale(gnome-system-monitor:ms) \
locale(gnome-system-monitor:nb) \
locale(gnome-system-monitor:nds) \
locale(gnome-system-monitor:ne) \
locale(gnome-system-monitor:nl) \
locale(gnome-system-monitor:nn) \
locale(gnome-system-monitor:oc) \
locale(gnome-system-monitor:or) \
locale(gnome-system-monitor:pa) \
locale(gnome-system-monitor:pl) \
locale(gnome-system-monitor:pt) \
locale(gnome-system-monitor:pt_BR) \
locale(gnome-system-monitor:ro) \
locale(gnome-system-monitor:ru) \
locale(gnome-system-monitor:si) \
locale(gnome-system-monitor:sk) \
locale(gnome-system-monitor:sl) \
locale(gnome-system-monitor:sq) \
locale(gnome-system-monitor:sr) \
locale(gnome-system-monitor:sr@latin) \
locale(gnome-system-monitor:sv) \
locale(gnome-system-monitor:ta) \
locale(gnome-system-monitor:te) \
locale(gnome-system-monitor:th) \
locale(gnome-system-monitor:tr) \
locale(gnome-system-monitor:ug) \
locale(gnome-system-monitor:uk) \
locale(gnome-system-monitor:vi) \
locale(gnome-system-monitor:zh_CN) \
locale(gnome-system-monitor:zh_HK) \
locale(gnome-system-monitor:zh_TW)"
RDEPENDS:${PN} += "gnome-system-monitor"

inherit rpm
