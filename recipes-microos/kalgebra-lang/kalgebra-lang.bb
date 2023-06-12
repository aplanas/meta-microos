SUMMARY = "Translations for package kalgebra"
DESCRIPTION = "Provides translations for the 'kalgebra' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalgebra-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "a302206926a8e3c802c3da8a953a3335c13be46f30bc99352bcbfa9b0e6174e66fd732d39dcc7f47850364ca4cbc915568baeb2191b776c47f1fb93b2a5633eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalgebra-lang kalgebra-lang-all locale(kalgebra:ar) locale(kalgebra:be) locale(kalgebra:bg) locale(kalgebra:bs) locale(kalgebra:ca) locale(kalgebra:ca@valencia) locale(kalgebra:cs) locale(kalgebra:da) locale(kalgebra:de) locale(kalgebra:el) locale(kalgebra:en_GB) locale(kalgebra:eo) locale(kalgebra:es) locale(kalgebra:et) locale(kalgebra:eu) locale(kalgebra:fi) locale(kalgebra:fr) locale(kalgebra:ga) locale(kalgebra:gl) locale(kalgebra:hi) locale(kalgebra:hr) locale(kalgebra:hu) locale(kalgebra:it) locale(kalgebra:ja) locale(kalgebra:ka) locale(kalgebra:kk) locale(kalgebra:km) locale(kalgebra:ko) locale(kalgebra:lt) locale(kalgebra:lv) locale(kalgebra:mai) locale(kalgebra:ml) locale(kalgebra:mr) locale(kalgebra:nb) locale(kalgebra:nds) locale(kalgebra:nl) locale(kalgebra:nn) locale(kalgebra:oc) locale(kalgebra:pa) locale(kalgebra:pl) locale(kalgebra:pt) locale(kalgebra:pt_BR) locale(kalgebra:ro) locale(kalgebra:ru) locale(kalgebra:si) locale(kalgebra:sk) locale(kalgebra:sl) locale(kalgebra:sv) locale(kalgebra:te) locale(kalgebra:tr) locale(kalgebra:ug) locale(kalgebra:uk) locale(kalgebra:zh_CN) locale(kalgebra:zh_TW)"
RDEPENDS:${PN} += "kalgebra"

inherit rpm
