SUMMARY = "Translations for package lightsoff"
DESCRIPTION = "Provides translations for the 'lightsoff' package."
LICENSE = "GPL-2.0-or-later"

PV = "40.0.1"

RPM_NAME = "lightsoff-lang-40.0.1-2.3.noarch.rpm"
RPM_HASH = "7e0faf808856ccf293a717d6470188dd0cb2b774b98289f984ef302305c7186e97256cfea7d0f847ebe0b2b864800db1979659f4c30e80cd2a7642dd877bdb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightsoff-lang lightsoff-lang-all locale(lightsoff:af) locale(lightsoff:ar) locale(lightsoff:as) locale(lightsoff:ast) locale(lightsoff:az) locale(lightsoff:be) locale(lightsoff:bg) locale(lightsoff:bn) locale(lightsoff:bn_IN) locale(lightsoff:br) locale(lightsoff:bs) locale(lightsoff:ca) locale(lightsoff:ca@valencia) locale(lightsoff:cs) locale(lightsoff:cy) locale(lightsoff:da) locale(lightsoff:de) locale(lightsoff:dz) locale(lightsoff:el) locale(lightsoff:en@shaw) locale(lightsoff:en_CA) locale(lightsoff:en_GB) locale(lightsoff:eo) locale(lightsoff:es) locale(lightsoff:et) locale(lightsoff:eu) locale(lightsoff:fa) locale(lightsoff:fi) locale(lightsoff:fr) locale(lightsoff:fur) locale(lightsoff:ga) locale(lightsoff:gl) locale(lightsoff:gu) locale(lightsoff:he) locale(lightsoff:hi) locale(lightsoff:hr) locale(lightsoff:hu) locale(lightsoff:id) locale(lightsoff:is) locale(lightsoff:it) locale(lightsoff:ja) locale(lightsoff:ka) locale(lightsoff:kk) locale(lightsoff:km) locale(lightsoff:kn) locale(lightsoff:ko) locale(lightsoff:lt) locale(lightsoff:lv) locale(lightsoff:mai) locale(lightsoff:mk) locale(lightsoff:ml) locale(lightsoff:mr) locale(lightsoff:ms) locale(lightsoff:nb) locale(lightsoff:ne) locale(lightsoff:nl) locale(lightsoff:nn) locale(lightsoff:oc) locale(lightsoff:or) locale(lightsoff:pa) locale(lightsoff:pl) locale(lightsoff:pt) locale(lightsoff:pt_BR) locale(lightsoff:ro) locale(lightsoff:ru) locale(lightsoff:si) locale(lightsoff:sk) locale(lightsoff:sl) locale(lightsoff:sq) locale(lightsoff:sr) locale(lightsoff:sr@latin) locale(lightsoff:sv) locale(lightsoff:ta) locale(lightsoff:te) locale(lightsoff:th) locale(lightsoff:tr) locale(lightsoff:ug) locale(lightsoff:uk) locale(lightsoff:vi) locale(lightsoff:wa) locale(lightsoff:zh_CN) locale(lightsoff:zh_HK) locale(lightsoff:zh_TW)"
RDEPENDS:${PN} += "lightsoff"

inherit rpm
