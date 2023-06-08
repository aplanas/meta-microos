SUMMARY = "Translations for package kolf"
DESCRIPTION = "Provides translations for the 'kolf' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kolf-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "2653777e24af0cf5e2282674bc3bf06354035aa026728011f3c56b571e70531d291b736341a2efeb92788a2f9edac4bdd90da2c7a435121c1f9d455b1e9a48b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kolf-lang kolf-lang-all locale(kolf:af) locale(kolf:ar) locale(kolf:be) locale(kolf:bg) locale(kolf:br) locale(kolf:bs) locale(kolf:ca) locale(kolf:ca@valencia) locale(kolf:cs) locale(kolf:cy) locale(kolf:da) locale(kolf:de) locale(kolf:el) locale(kolf:en_GB) locale(kolf:eo) locale(kolf:es) locale(kolf:et) locale(kolf:eu) locale(kolf:fa) locale(kolf:fi) locale(kolf:fr) locale(kolf:ga) locale(kolf:gl) locale(kolf:he) locale(kolf:hi) locale(kolf:hr) locale(kolf:hu) locale(kolf:is) locale(kolf:it) locale(kolf:ja) locale(kolf:ka) locale(kolf:kk) locale(kolf:km) locale(kolf:ko) locale(kolf:lt) locale(kolf:lv) locale(kolf:mai) locale(kolf:mk) locale(kolf:ml) locale(kolf:mr) locale(kolf:ms) locale(kolf:nb) locale(kolf:nds) locale(kolf:ne) locale(kolf:nl) locale(kolf:nn) locale(kolf:oc) locale(kolf:pa) locale(kolf:pl) locale(kolf:pt) locale(kolf:pt_BR) locale(kolf:ro) locale(kolf:ru) locale(kolf:sk) locale(kolf:sl) locale(kolf:sq) locale(kolf:sr) locale(kolf:sr@ijekavian) locale(kolf:sr@ijekavianlatin) locale(kolf:sr@latin) locale(kolf:sv) locale(kolf:ta) locale(kolf:tr) locale(kolf:ug) locale(kolf:uk) locale(kolf:zh_CN) locale(kolf:zh_TW)"
RDEPENDS:${PN} += "kolf"

inherit rpm
