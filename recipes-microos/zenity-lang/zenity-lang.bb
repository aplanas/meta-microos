SUMMARY = "Translations for package zenity"
DESCRIPTION = "Provides translations for the 'zenity' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.92.0"

RPM_NAME = "zenity-lang-3.92.0-1.1.noarch.rpm"
RPM_HASH = "fcb1a9e8b6c9b06f5136a2d9de66a01c78aa9a49cee31e54b0a3af43326f63c167bf4fc4d260add62ee92dff8b751b8cc8c08b053f5ee715311ffd9752503aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(zenity:af) \
locale(zenity:ar) \
locale(zenity:as) \
locale(zenity:ast) \
locale(zenity:az) \
locale(zenity:be) \
locale(zenity:be@latin) \
locale(zenity:bg) \
locale(zenity:bn) \
locale(zenity:bn_IN) \
locale(zenity:bs) \
locale(zenity:ca) \
locale(zenity:ca@valencia) \
locale(zenity:cs) \
locale(zenity:cy) \
locale(zenity:da) \
locale(zenity:de) \
locale(zenity:dz) \
locale(zenity:el) \
locale(zenity:en@shaw) \
locale(zenity:en_CA) \
locale(zenity:en_GB) \
locale(zenity:eo) \
locale(zenity:es) \
locale(zenity:et) \
locale(zenity:eu) \
locale(zenity:fa) \
locale(zenity:fi) \
locale(zenity:fr) \
locale(zenity:fur) \
locale(zenity:ga) \
locale(zenity:gl) \
locale(zenity:gu) \
locale(zenity:he) \
locale(zenity:hi) \
locale(zenity:hr) \
locale(zenity:hu) \
locale(zenity:id) \
locale(zenity:is) \
locale(zenity:it) \
locale(zenity:ja) \
locale(zenity:ka) \
locale(zenity:kk) \
locale(zenity:kn) \
locale(zenity:ko) \
locale(zenity:lt) \
locale(zenity:lv) \
locale(zenity:mai) \
locale(zenity:mk) \
locale(zenity:ml) \
locale(zenity:mr) \
locale(zenity:ms) \
locale(zenity:nb) \
locale(zenity:ne) \
locale(zenity:nl) \
locale(zenity:nn) \
locale(zenity:oc) \
locale(zenity:or) \
locale(zenity:pa) \
locale(zenity:pl) \
locale(zenity:pt) \
locale(zenity:pt_BR) \
locale(zenity:ro) \
locale(zenity:ru) \
locale(zenity:si) \
locale(zenity:sk) \
locale(zenity:sl) \
locale(zenity:sq) \
locale(zenity:sr) \
locale(zenity:sr@latin) \
locale(zenity:sv) \
locale(zenity:ta) \
locale(zenity:te) \
locale(zenity:th) \
locale(zenity:tr) \
locale(zenity:ug) \
locale(zenity:uk) \
locale(zenity:vi) \
locale(zenity:zh_CN) \
locale(zenity:zh_HK) \
locale(zenity:zh_TW) \
zenity-lang \
zenity-lang-all"
RDEPENDS:${PN} += "zenity"

inherit rpm
