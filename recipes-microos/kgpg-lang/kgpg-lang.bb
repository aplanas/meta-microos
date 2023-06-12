SUMMARY = "Translations for package kgpg"
DESCRIPTION = "Provides translations for the 'kgpg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kgpg-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "fac879de4d72e9b21ccf0511786d6384b76c74d3f4136998c4ede4b1d352ee6b60c1bb58f37d8a3808f6c3f997e3e95ffa9285f88ceb37fda7ce1d5612f18503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgpg-lang kgpg-lang-all locale(kgpg:ar) locale(kgpg:be) locale(kgpg:bg) locale(kgpg:br) locale(kgpg:bs) locale(kgpg:ca) locale(kgpg:ca@valencia) locale(kgpg:cs) locale(kgpg:cy) locale(kgpg:da) locale(kgpg:de) locale(kgpg:el) locale(kgpg:en_GB) locale(kgpg:eo) locale(kgpg:es) locale(kgpg:et) locale(kgpg:eu) locale(kgpg:fa) locale(kgpg:fi) locale(kgpg:fr) locale(kgpg:ga) locale(kgpg:gl) locale(kgpg:he) locale(kgpg:hr) locale(kgpg:hu) locale(kgpg:ia) locale(kgpg:id) locale(kgpg:is) locale(kgpg:it) locale(kgpg:ja) locale(kgpg:ka) locale(kgpg:kk) locale(kgpg:km) locale(kgpg:ko) locale(kgpg:lt) locale(kgpg:lv) locale(kgpg:mk) locale(kgpg:mr) locale(kgpg:ms) locale(kgpg:nb) locale(kgpg:nds) locale(kgpg:ne) locale(kgpg:nl) locale(kgpg:nn) locale(kgpg:oc) locale(kgpg:pa) locale(kgpg:pl) locale(kgpg:pt) locale(kgpg:pt_BR) locale(kgpg:ro) locale(kgpg:ru) locale(kgpg:sk) locale(kgpg:sl) locale(kgpg:sq) locale(kgpg:sr) locale(kgpg:sr@ijekavian) locale(kgpg:sr@ijekavianlatin) locale(kgpg:sr@latin) locale(kgpg:sv) locale(kgpg:ta) locale(kgpg:tr) locale(kgpg:ug) locale(kgpg:uk) locale(kgpg:zh_CN) locale(kgpg:zh_TW)"
RDEPENDS:${PN} += "kgpg"

inherit rpm
