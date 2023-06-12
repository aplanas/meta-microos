SUMMARY = "Translations for package xplayer-plparser"
DESCRIPTION = "Provides translations for the 'xplayer-plparser' package."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "xplayer-plparser-lang-1.0.2-2.12.noarch.rpm"
RPM_HASH = "5095ab289ecedc85648ae43b400b4690c5b3d7622be37886898d80367daf4f3828dda26323af0f5c31cabc0d20f7f878366cdffa9de9d7ec7f3f1c6528c3c299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xplayer-plparser:af) \
locale(xplayer-plparser:ar) \
locale(xplayer-plparser:as) \
locale(xplayer-plparser:ast) \
locale(xplayer-plparser:az) \
locale(xplayer-plparser:be) \
locale(xplayer-plparser:be@latin) \
locale(xplayer-plparser:bg) \
locale(xplayer-plparser:bn) \
locale(xplayer-plparser:bn_IN) \
locale(xplayer-plparser:br) \
locale(xplayer-plparser:ca) \
locale(xplayer-plparser:ca@valencia) \
locale(xplayer-plparser:cs) \
locale(xplayer-plparser:cy) \
locale(xplayer-plparser:da) \
locale(xplayer-plparser:de) \
locale(xplayer-plparser:dz) \
locale(xplayer-plparser:el) \
locale(xplayer-plparser:en@shaw) \
locale(xplayer-plparser:en_CA) \
locale(xplayer-plparser:en_GB) \
locale(xplayer-plparser:eo) \
locale(xplayer-plparser:es) \
locale(xplayer-plparser:et) \
locale(xplayer-plparser:eu) \
locale(xplayer-plparser:fa) \
locale(xplayer-plparser:fi) \
locale(xplayer-plparser:fr) \
locale(xplayer-plparser:fur) \
locale(xplayer-plparser:ga) \
locale(xplayer-plparser:gd) \
locale(xplayer-plparser:gl) \
locale(xplayer-plparser:gu) \
locale(xplayer-plparser:he) \
locale(xplayer-plparser:hi) \
locale(xplayer-plparser:hr) \
locale(xplayer-plparser:hu) \
locale(xplayer-plparser:id) \
locale(xplayer-plparser:is) \
locale(xplayer-plparser:it) \
locale(xplayer-plparser:ja) \
locale(xplayer-plparser:ka) \
locale(xplayer-plparser:km) \
locale(xplayer-plparser:kn) \
locale(xplayer-plparser:ko) \
locale(xplayer-plparser:lt) \
locale(xplayer-plparser:lv) \
locale(xplayer-plparser:mai) \
locale(xplayer-plparser:mk) \
locale(xplayer-plparser:ml) \
locale(xplayer-plparser:mr) \
locale(xplayer-plparser:ms) \
locale(xplayer-plparser:nb) \
locale(xplayer-plparser:nds) \
locale(xplayer-plparser:ne) \
locale(xplayer-plparser:nl) \
locale(xplayer-plparser:nn) \
locale(xplayer-plparser:oc) \
locale(xplayer-plparser:or) \
locale(xplayer-plparser:pa) \
locale(xplayer-plparser:pl) \
locale(xplayer-plparser:pt) \
locale(xplayer-plparser:pt_BR) \
locale(xplayer-plparser:ro) \
locale(xplayer-plparser:ru) \
locale(xplayer-plparser:si) \
locale(xplayer-plparser:sk) \
locale(xplayer-plparser:sl) \
locale(xplayer-plparser:sq) \
locale(xplayer-plparser:sr) \
locale(xplayer-plparser:sr@latin) \
locale(xplayer-plparser:sv) \
locale(xplayer-plparser:ta) \
locale(xplayer-plparser:te) \
locale(xplayer-plparser:th) \
locale(xplayer-plparser:tr) \
locale(xplayer-plparser:ug) \
locale(xplayer-plparser:uk) \
locale(xplayer-plparser:vi) \
locale(xplayer-plparser:wa) \
locale(xplayer-plparser:zh_CN) \
locale(xplayer-plparser:zh_HK) \
locale(xplayer-plparser:zh_TW) \
xplayer-plparser-lang \
xplayer-plparser-lang-all"
RDEPENDS:${PN} += "xplayer-plparser"

inherit rpm
