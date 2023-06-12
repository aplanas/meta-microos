SUMMARY = "Translations for package gtksourceview4"
DESCRIPTION = "Provides translations for the 'gtksourceview4' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "gtksourceview4-lang-4.8.4-1.3.noarch.rpm"
RPM_HASH = "d1a5565841447366ff9ba821f16037163e80e369e192f1558bb10918af71b00d57c71316f35a2626590c17c6dd41506f29166332bfeaba7c7a2626a10060b05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtksourceview4-lang \
gtksourceview4-lang-all \
locale(gtksourceview4:ar) \
locale(gtksourceview4:as) \
locale(gtksourceview4:ast) \
locale(gtksourceview4:az) \
locale(gtksourceview4:be) \
locale(gtksourceview4:bg) \
locale(gtksourceview4:bn) \
locale(gtksourceview4:bn_IN) \
locale(gtksourceview4:bs) \
locale(gtksourceview4:ca) \
locale(gtksourceview4:ca@valencia) \
locale(gtksourceview4:cs) \
locale(gtksourceview4:cy) \
locale(gtksourceview4:da) \
locale(gtksourceview4:de) \
locale(gtksourceview4:dz) \
locale(gtksourceview4:el) \
locale(gtksourceview4:en@shaw) \
locale(gtksourceview4:en_CA) \
locale(gtksourceview4:en_GB) \
locale(gtksourceview4:eo) \
locale(gtksourceview4:es) \
locale(gtksourceview4:et) \
locale(gtksourceview4:eu) \
locale(gtksourceview4:fa) \
locale(gtksourceview4:fi) \
locale(gtksourceview4:fr) \
locale(gtksourceview4:fur) \
locale(gtksourceview4:ga) \
locale(gtksourceview4:gl) \
locale(gtksourceview4:gu) \
locale(gtksourceview4:he) \
locale(gtksourceview4:hi) \
locale(gtksourceview4:hr) \
locale(gtksourceview4:hu) \
locale(gtksourceview4:id) \
locale(gtksourceview4:is) \
locale(gtksourceview4:it) \
locale(gtksourceview4:ja) \
locale(gtksourceview4:ka) \
locale(gtksourceview4:kk) \
locale(gtksourceview4:kn) \
locale(gtksourceview4:ko) \
locale(gtksourceview4:lt) \
locale(gtksourceview4:lv) \
locale(gtksourceview4:mai) \
locale(gtksourceview4:mk) \
locale(gtksourceview4:ml) \
locale(gtksourceview4:mr) \
locale(gtksourceview4:ms) \
locale(gtksourceview4:nb) \
locale(gtksourceview4:ne) \
locale(gtksourceview4:nl) \
locale(gtksourceview4:nn) \
locale(gtksourceview4:oc) \
locale(gtksourceview4:or) \
locale(gtksourceview4:pa) \
locale(gtksourceview4:pl) \
locale(gtksourceview4:pt) \
locale(gtksourceview4:pt_BR) \
locale(gtksourceview4:ro) \
locale(gtksourceview4:ru) \
locale(gtksourceview4:si) \
locale(gtksourceview4:sk) \
locale(gtksourceview4:sl) \
locale(gtksourceview4:sq) \
locale(gtksourceview4:sr) \
locale(gtksourceview4:sr@latin) \
locale(gtksourceview4:sv) \
locale(gtksourceview4:ta) \
locale(gtksourceview4:te) \
locale(gtksourceview4:th) \
locale(gtksourceview4:tr) \
locale(gtksourceview4:ug) \
locale(gtksourceview4:uk) \
locale(gtksourceview4:vi) \
locale(gtksourceview4:zh_CN) \
locale(gtksourceview4:zh_HK) \
locale(gtksourceview4:zh_TW)"
RDEPENDS:${PN} += "gtksourceview4"

inherit rpm
