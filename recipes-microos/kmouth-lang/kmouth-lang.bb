SUMMARY = "Translations for package kmouth"
DESCRIPTION = "Provides translations for the 'kmouth' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmouth-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "69b829dd46460757667905d52b24e8edec1a536f91067ea087b8d474e0c623c31233cc4150557a5c142c8c5f9d1ba6c8de97310bd16d361130293c9ac7d9406e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmouth-lang kmouth-lang-all locale(kmouth:ar) locale(kmouth:be) locale(kmouth:bg) locale(kmouth:br) locale(kmouth:bs) locale(kmouth:ca) locale(kmouth:ca@valencia) locale(kmouth:cs) locale(kmouth:cy) locale(kmouth:da) locale(kmouth:de) locale(kmouth:el) locale(kmouth:en_GB) locale(kmouth:eo) locale(kmouth:es) locale(kmouth:et) locale(kmouth:eu) locale(kmouth:fa) locale(kmouth:fi) locale(kmouth:fr) locale(kmouth:ga) locale(kmouth:gl) locale(kmouth:he) locale(kmouth:hi) locale(kmouth:hr) locale(kmouth:hu) locale(kmouth:ia) locale(kmouth:is) locale(kmouth:it) locale(kmouth:ja) locale(kmouth:ka) locale(kmouth:kk) locale(kmouth:km) locale(kmouth:ko) locale(kmouth:lt) locale(kmouth:lv) locale(kmouth:mai) locale(kmouth:mk) locale(kmouth:ml) locale(kmouth:mr) locale(kmouth:ms) locale(kmouth:nb) locale(kmouth:nds) locale(kmouth:ne) locale(kmouth:nl) locale(kmouth:nn) locale(kmouth:oc) locale(kmouth:pa) locale(kmouth:pl) locale(kmouth:pt) locale(kmouth:pt_BR) locale(kmouth:ro) locale(kmouth:ru) locale(kmouth:sk) locale(kmouth:sl) locale(kmouth:sq) locale(kmouth:sr) locale(kmouth:sr@ijekavian) locale(kmouth:sr@ijekavianlatin) locale(kmouth:sr@latin) locale(kmouth:sv) locale(kmouth:ta) locale(kmouth:th) locale(kmouth:tr) locale(kmouth:ug) locale(kmouth:uk) locale(kmouth:vi) locale(kmouth:zh_CN) locale(kmouth:zh_TW)"
RDEPENDS:${PN} += "kmouth"

inherit rpm
