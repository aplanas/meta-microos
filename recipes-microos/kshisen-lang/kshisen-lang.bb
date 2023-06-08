SUMMARY = "Translations for package kshisen"
DESCRIPTION = "Provides translations for the 'kshisen' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kshisen-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "60d6bbf363f0c69ab0a8adddb78f6f0581001dcb912d90436f39f0cb0356af34736f4bb35c890351a307ff117fa335b5c232f787d30816c49a7fb950fedce41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kshisen-lang kshisen-lang-all locale(kshisen:af) locale(kshisen:ar) locale(kshisen:be) locale(kshisen:bg) locale(kshisen:bn) locale(kshisen:br) locale(kshisen:bs) locale(kshisen:ca) locale(kshisen:ca@valencia) locale(kshisen:cs) locale(kshisen:cy) locale(kshisen:da) locale(kshisen:de) locale(kshisen:el) locale(kshisen:en_GB) locale(kshisen:eo) locale(kshisen:es) locale(kshisen:et) locale(kshisen:eu) locale(kshisen:fa) locale(kshisen:fi) locale(kshisen:fr) locale(kshisen:ga) locale(kshisen:gl) locale(kshisen:he) locale(kshisen:hi) locale(kshisen:hr) locale(kshisen:hu) locale(kshisen:id) locale(kshisen:is) locale(kshisen:it) locale(kshisen:ja) locale(kshisen:ka) locale(kshisen:kk) locale(kshisen:km) locale(kshisen:ko) locale(kshisen:lt) locale(kshisen:lv) locale(kshisen:mai) locale(kshisen:mk) locale(kshisen:ml) locale(kshisen:mr) locale(kshisen:nb) locale(kshisen:nds) locale(kshisen:ne) locale(kshisen:nl) locale(kshisen:nn) locale(kshisen:oc) locale(kshisen:pa) locale(kshisen:pl) locale(kshisen:pt) locale(kshisen:pt_BR) locale(kshisen:ro) locale(kshisen:ru) locale(kshisen:sk) locale(kshisen:sl) locale(kshisen:sq) locale(kshisen:sr) locale(kshisen:sr@ijekavian) locale(kshisen:sr@ijekavianlatin) locale(kshisen:sr@latin) locale(kshisen:sv) locale(kshisen:ta) locale(kshisen:th) locale(kshisen:tr) locale(kshisen:ug) locale(kshisen:uk) locale(kshisen:zh_CN) locale(kshisen:zh_TW)"
RDEPENDS:${PN} += "kshisen"

inherit rpm
