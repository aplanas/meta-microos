SUMMARY = "Translations for package swell-foop"
DESCRIPTION = "Provides translations for the 'swell-foop' package."
LICENSE = "GPL-2.0-or-later"

PV = "41.1"

RPM_NAME = "swell-foop-lang-41.1-1.6.noarch.rpm"
RPM_HASH = "5b1a2b7f5c4901a4fce6fcebab2673bb945bbba7c74cab59e55f6c3aa904b1c7158d40a27ecc32e41cf6f547c44b01209b87a876f7adea3d031b84bf15dffcef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(swell-foop:af) locale(swell-foop:ar) locale(swell-foop:as) locale(swell-foop:ast) locale(swell-foop:az) locale(swell-foop:be) locale(swell-foop:bg) locale(swell-foop:bn) locale(swell-foop:bn_IN) locale(swell-foop:br) locale(swell-foop:bs) locale(swell-foop:ca) locale(swell-foop:ca@valencia) locale(swell-foop:cs) locale(swell-foop:cy) locale(swell-foop:da) locale(swell-foop:de) locale(swell-foop:dz) locale(swell-foop:el) locale(swell-foop:en@shaw) locale(swell-foop:en_CA) locale(swell-foop:en_GB) locale(swell-foop:eo) locale(swell-foop:es) locale(swell-foop:et) locale(swell-foop:eu) locale(swell-foop:fa) locale(swell-foop:fi) locale(swell-foop:fr) locale(swell-foop:fur) locale(swell-foop:ga) locale(swell-foop:gl) locale(swell-foop:gu) locale(swell-foop:he) locale(swell-foop:hi) locale(swell-foop:hr) locale(swell-foop:hu) locale(swell-foop:id) locale(swell-foop:is) locale(swell-foop:it) locale(swell-foop:ja) locale(swell-foop:ka) locale(swell-foop:kk) locale(swell-foop:km) locale(swell-foop:kn) locale(swell-foop:ko) locale(swell-foop:lt) locale(swell-foop:lv) locale(swell-foop:mai) locale(swell-foop:mk) locale(swell-foop:ml) locale(swell-foop:mr) locale(swell-foop:ms) locale(swell-foop:nb) locale(swell-foop:ne) locale(swell-foop:nl) locale(swell-foop:nn) locale(swell-foop:oc) locale(swell-foop:or) locale(swell-foop:pa) locale(swell-foop:pl) locale(swell-foop:pt) locale(swell-foop:pt_BR) locale(swell-foop:ro) locale(swell-foop:ru) locale(swell-foop:si) locale(swell-foop:sk) locale(swell-foop:sl) locale(swell-foop:sq) locale(swell-foop:sr) locale(swell-foop:sr@latin) locale(swell-foop:sv) locale(swell-foop:ta) locale(swell-foop:te) locale(swell-foop:th) locale(swell-foop:tr) locale(swell-foop:ug) locale(swell-foop:uk) locale(swell-foop:vi) locale(swell-foop:wa) locale(swell-foop:zh_CN) locale(swell-foop:zh_HK) locale(swell-foop:zh_TW) swell-foop-lang swell-foop-lang-all"
RDEPENDS:${PN} += "swell-foop"

inherit rpm
