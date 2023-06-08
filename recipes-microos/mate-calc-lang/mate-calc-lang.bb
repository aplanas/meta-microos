SUMMARY = "Translations for package mate-calc"
DESCRIPTION = "Provides translations for the 'mate-calc' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-calc-lang-1.26.0-1.9.noarch.rpm"
RPM_HASH = "37b49cd1e5580adc6f912fc6332406afa50d7a0373cfd512e90fd3513357e8dee2aa60ec0528d217ec68d090501139a4f2d977ce03eadf58537288d76703f1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-calc:af) locale(mate-calc:ar) locale(mate-calc:as) locale(mate-calc:ast) locale(mate-calc:az) locale(mate-calc:be) locale(mate-calc:bg) locale(mate-calc:bn) locale(mate-calc:bn_IN) locale(mate-calc:br) locale(mate-calc:bs) locale(mate-calc:ca) locale(mate-calc:ca@valencia) locale(mate-calc:cs) locale(mate-calc:cy) locale(mate-calc:da) locale(mate-calc:de) locale(mate-calc:dz) locale(mate-calc:el) locale(mate-calc:en_AU) locale(mate-calc:en_CA) locale(mate-calc:en_GB) locale(mate-calc:eo) locale(mate-calc:es) locale(mate-calc:es_AR) locale(mate-calc:es_CL) locale(mate-calc:es_CO) locale(mate-calc:es_CR) locale(mate-calc:es_DO) locale(mate-calc:es_EC) locale(mate-calc:es_ES) locale(mate-calc:es_MX) locale(mate-calc:es_NI) locale(mate-calc:es_PA) locale(mate-calc:es_PE) locale(mate-calc:es_PR) locale(mate-calc:es_SV) locale(mate-calc:es_UY) locale(mate-calc:es_VE) locale(mate-calc:et) locale(mate-calc:eu) locale(mate-calc:fa) locale(mate-calc:fi) locale(mate-calc:fr) locale(mate-calc:fr_CA) locale(mate-calc:fur) locale(mate-calc:ga) locale(mate-calc:gl) locale(mate-calc:gu) locale(mate-calc:he) locale(mate-calc:hi) locale(mate-calc:hr) locale(mate-calc:hu) locale(mate-calc:id) locale(mate-calc:is) locale(mate-calc:it) locale(mate-calc:ja) locale(mate-calc:ka) locale(mate-calc:kk) locale(mate-calc:km) locale(mate-calc:kn) locale(mate-calc:ko) locale(mate-calc:lt) locale(mate-calc:lv) locale(mate-calc:mai) locale(mate-calc:mk) locale(mate-calc:ml) locale(mate-calc:mr) locale(mate-calc:ms) locale(mate-calc:nb) locale(mate-calc:nds) locale(mate-calc:ne) locale(mate-calc:nl) locale(mate-calc:nn) locale(mate-calc:oc) locale(mate-calc:or) locale(mate-calc:pa) locale(mate-calc:pl) locale(mate-calc:pt) locale(mate-calc:pt_BR) locale(mate-calc:ro) locale(mate-calc:ru) locale(mate-calc:si) locale(mate-calc:sk) locale(mate-calc:sl) locale(mate-calc:sq) locale(mate-calc:sr) locale(mate-calc:sr@latin) locale(mate-calc:sv) locale(mate-calc:ta) locale(mate-calc:te) locale(mate-calc:th) locale(mate-calc:tr) locale(mate-calc:ug) locale(mate-calc:uk) locale(mate-calc:vi) locale(mate-calc:wa) locale(mate-calc:zh_CN) locale(mate-calc:zh_HK) locale(mate-calc:zh_TW) mate-calc-lang mate-calc-lang-all"
RDEPENDS:${PN} += "mate-calc"

inherit rpm
