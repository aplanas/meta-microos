SUMMARY = "Translations for package nautilus-sendto"
DESCRIPTION = "Provides translations for the 'nautilus-sendto' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "nautilus-sendto-lang-3.8.6-6.7.noarch.rpm"
RPM_HASH = "8f8f97dd87e2797bad6c007b02d063f63e9588bc5727852b9e2ee66fc53e9727e4009071997505400daaa93aeff73cf67277e9ad6d4aae3227fad189df94615f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nautilus-sendto:af) \
locale(nautilus-sendto:ar) \
locale(nautilus-sendto:as) \
locale(nautilus-sendto:ast) \
locale(nautilus-sendto:be) \
locale(nautilus-sendto:be@latin) \
locale(nautilus-sendto:bg) \
locale(nautilus-sendto:bn) \
locale(nautilus-sendto:bn_IN) \
locale(nautilus-sendto:br) \
locale(nautilus-sendto:bs) \
locale(nautilus-sendto:ca) \
locale(nautilus-sendto:ca@valencia) \
locale(nautilus-sendto:cs) \
locale(nautilus-sendto:da) \
locale(nautilus-sendto:de) \
locale(nautilus-sendto:dz) \
locale(nautilus-sendto:el) \
locale(nautilus-sendto:en@shaw) \
locale(nautilus-sendto:en_CA) \
locale(nautilus-sendto:en_GB) \
locale(nautilus-sendto:eo) \
locale(nautilus-sendto:es) \
locale(nautilus-sendto:et) \
locale(nautilus-sendto:eu) \
locale(nautilus-sendto:fa) \
locale(nautilus-sendto:fi) \
locale(nautilus-sendto:fr) \
locale(nautilus-sendto:fur) \
locale(nautilus-sendto:ga) \
locale(nautilus-sendto:gd) \
locale(nautilus-sendto:gl) \
locale(nautilus-sendto:gu) \
locale(nautilus-sendto:he) \
locale(nautilus-sendto:hi) \
locale(nautilus-sendto:hr) \
locale(nautilus-sendto:hu) \
locale(nautilus-sendto:id) \
locale(nautilus-sendto:is) \
locale(nautilus-sendto:it) \
locale(nautilus-sendto:ja) \
locale(nautilus-sendto:ka) \
locale(nautilus-sendto:kk) \
locale(nautilus-sendto:km) \
locale(nautilus-sendto:kn) \
locale(nautilus-sendto:ko) \
locale(nautilus-sendto:lt) \
locale(nautilus-sendto:lv) \
locale(nautilus-sendto:mk) \
locale(nautilus-sendto:ml) \
locale(nautilus-sendto:mr) \
locale(nautilus-sendto:ms) \
locale(nautilus-sendto:nb) \
locale(nautilus-sendto:nds) \
locale(nautilus-sendto:ne) \
locale(nautilus-sendto:nl) \
locale(nautilus-sendto:nn) \
locale(nautilus-sendto:oc) \
locale(nautilus-sendto:or) \
locale(nautilus-sendto:pa) \
locale(nautilus-sendto:pl) \
locale(nautilus-sendto:pt) \
locale(nautilus-sendto:pt_BR) \
locale(nautilus-sendto:ro) \
locale(nautilus-sendto:ru) \
locale(nautilus-sendto:sk) \
locale(nautilus-sendto:sl) \
locale(nautilus-sendto:sq) \
locale(nautilus-sendto:sr) \
locale(nautilus-sendto:sr@latin) \
locale(nautilus-sendto:sv) \
locale(nautilus-sendto:ta) \
locale(nautilus-sendto:te) \
locale(nautilus-sendto:th) \
locale(nautilus-sendto:tr) \
locale(nautilus-sendto:ug) \
locale(nautilus-sendto:uk) \
locale(nautilus-sendto:vi) \
locale(nautilus-sendto:zh_CN) \
locale(nautilus-sendto:zh_HK) \
locale(nautilus-sendto:zh_TW) \
nautilus-sendto-lang \
nautilus-sendto-lang-all"
RDEPENDS:${PN} += "nautilus-sendto"

inherit rpm
