SUMMARY = "Translations for package kbounce"
DESCRIPTION = "Provides translations for the 'kbounce' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kbounce-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7a9023494525eab3b5e8c6b9a8c080d76a5dd3ab29c68ff68aeb59d182f0aa4d19d453436e9ccaa3010cde13575d795ee21b0cf829052e2579b7971e0b7e2d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbounce-lang kbounce-lang-all locale(kbounce:af) locale(kbounce:ar) locale(kbounce:be) locale(kbounce:bg) locale(kbounce:bn) locale(kbounce:br) locale(kbounce:bs) locale(kbounce:ca) locale(kbounce:ca@valencia) locale(kbounce:cs) locale(kbounce:cy) locale(kbounce:da) locale(kbounce:de) locale(kbounce:el) locale(kbounce:en_GB) locale(kbounce:eo) locale(kbounce:es) locale(kbounce:et) locale(kbounce:eu) locale(kbounce:fa) locale(kbounce:fi) locale(kbounce:fr) locale(kbounce:ga) locale(kbounce:gl) locale(kbounce:he) locale(kbounce:hi) locale(kbounce:hr) locale(kbounce:hu) locale(kbounce:id) locale(kbounce:is) locale(kbounce:it) locale(kbounce:ja) locale(kbounce:ka) locale(kbounce:kk) locale(kbounce:km) locale(kbounce:ko) locale(kbounce:lt) locale(kbounce:lv) locale(kbounce:mai) locale(kbounce:mk) locale(kbounce:ml) locale(kbounce:mr) locale(kbounce:ms) locale(kbounce:nb) locale(kbounce:nds) locale(kbounce:ne) locale(kbounce:nl) locale(kbounce:nn) locale(kbounce:oc) locale(kbounce:pa) locale(kbounce:pl) locale(kbounce:pt) locale(kbounce:pt_BR) locale(kbounce:ro) locale(kbounce:ru) locale(kbounce:sk) locale(kbounce:sl) locale(kbounce:sq) locale(kbounce:sr) locale(kbounce:sr@ijekavian) locale(kbounce:sr@ijekavianlatin) locale(kbounce:sr@latin) locale(kbounce:sv) locale(kbounce:ta) locale(kbounce:te) locale(kbounce:th) locale(kbounce:tr) locale(kbounce:ug) locale(kbounce:uk) locale(kbounce:vi) locale(kbounce:zh_CN) locale(kbounce:zh_TW)"
RDEPENDS:${PN} += "kbounce"

inherit rpm
