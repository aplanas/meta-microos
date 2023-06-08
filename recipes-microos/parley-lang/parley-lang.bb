SUMMARY = "Translations for package parley"
DESCRIPTION = "Provides translations for the 'parley' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "parley-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "331d0238038a20a179af8cf957e9b524b6d02f31481ea7313338568a39b9e4bb1be07104e1cc2dc2998f0764e781c5a8eef5225317db3c0fef544326c1834853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(parley:af) locale(parley:ar) locale(parley:be) locale(parley:bg) locale(parley:bn) locale(parley:br) locale(parley:bs) locale(parley:ca) locale(parley:ca@valencia) locale(parley:cs) locale(parley:cy) locale(parley:da) locale(parley:de) locale(parley:el) locale(parley:en_GB) locale(parley:eo) locale(parley:es) locale(parley:et) locale(parley:eu) locale(parley:fa) locale(parley:fi) locale(parley:fr) locale(parley:ga) locale(parley:gl) locale(parley:he) locale(parley:hi) locale(parley:hr) locale(parley:hu) locale(parley:ia) locale(parley:is) locale(parley:it) locale(parley:ja) locale(parley:ka) locale(parley:kk) locale(parley:km) locale(parley:lt) locale(parley:lv) locale(parley:mk) locale(parley:ml) locale(parley:mr) locale(parley:ms) locale(parley:nb) locale(parley:nds) locale(parley:ne) locale(parley:nl) locale(parley:nn) locale(parley:oc) locale(parley:pa) locale(parley:pl) locale(parley:pt) locale(parley:pt_BR) locale(parley:ro) locale(parley:ru) locale(parley:si) locale(parley:sk) locale(parley:sl) locale(parley:sq) locale(parley:sv) locale(parley:ta) locale(parley:tr) locale(parley:ug) locale(parley:uk) locale(parley:zh_CN) locale(parley:zh_TW) parley-lang parley-lang-all"
RDEPENDS:${PN} += "parley"

inherit rpm
