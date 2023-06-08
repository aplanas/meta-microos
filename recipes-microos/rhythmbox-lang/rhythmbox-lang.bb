SUMMARY = "Translations for package rhythmbox"
DESCRIPTION = "Provides translations for the 'rhythmbox' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.7"

RPM_NAME = "rhythmbox-lang-3.4.7-1.1.noarch.rpm"
RPM_HASH = "a4d18ca6b198fca150c60e40633003b616ae8e79e1112b2faf6d4a165a6fa14237fe2c756ef6bc44a728a7bc6d8edd69df774db3087f32ae93a0e37308169bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rhythmbox:af) locale(rhythmbox:ar) locale(rhythmbox:as) locale(rhythmbox:az) locale(rhythmbox:be) locale(rhythmbox:be@latin) locale(rhythmbox:bg) locale(rhythmbox:bn_IN) locale(rhythmbox:br) locale(rhythmbox:bs) locale(rhythmbox:ca) locale(rhythmbox:ca@valencia) locale(rhythmbox:cs) locale(rhythmbox:cy) locale(rhythmbox:da) locale(rhythmbox:de) locale(rhythmbox:dz) locale(rhythmbox:el) locale(rhythmbox:en_CA) locale(rhythmbox:en_GB) locale(rhythmbox:eo) locale(rhythmbox:es) locale(rhythmbox:et) locale(rhythmbox:eu) locale(rhythmbox:fa) locale(rhythmbox:fi) locale(rhythmbox:fr) locale(rhythmbox:fur) locale(rhythmbox:ga) locale(rhythmbox:gd) locale(rhythmbox:gl) locale(rhythmbox:gu) locale(rhythmbox:he) locale(rhythmbox:hi) locale(rhythmbox:hr) locale(rhythmbox:hu) locale(rhythmbox:id) locale(rhythmbox:is) locale(rhythmbox:it) locale(rhythmbox:ja) locale(rhythmbox:ka) locale(rhythmbox:kk) locale(rhythmbox:kn) locale(rhythmbox:ko) locale(rhythmbox:lt) locale(rhythmbox:lv) locale(rhythmbox:mk) locale(rhythmbox:ml) locale(rhythmbox:mr) locale(rhythmbox:ms) locale(rhythmbox:nb) locale(rhythmbox:nds) locale(rhythmbox:ne) locale(rhythmbox:nl) locale(rhythmbox:nn) locale(rhythmbox:oc) locale(rhythmbox:or) locale(rhythmbox:pa) locale(rhythmbox:pl) locale(rhythmbox:pt) locale(rhythmbox:pt_BR) locale(rhythmbox:ro) locale(rhythmbox:ru) locale(rhythmbox:si) locale(rhythmbox:sk) locale(rhythmbox:sl) locale(rhythmbox:sr) locale(rhythmbox:sr@latin) locale(rhythmbox:sv) locale(rhythmbox:ta) locale(rhythmbox:te) locale(rhythmbox:th) locale(rhythmbox:tr) locale(rhythmbox:uk) locale(rhythmbox:vi) locale(rhythmbox:zh_CN) locale(rhythmbox:zh_HK) locale(rhythmbox:zh_TW) rhythmbox-lang rhythmbox-lang-all"
RDEPENDS:${PN} += "rhythmbox"

inherit rpm
