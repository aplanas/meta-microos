SUMMARY = "Translations for package kalgebra"
DESCRIPTION = "Provides translations for the 'kalgebra' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kalgebra-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "483ce025a3184a974e96e349657d97f670d3ed66618206e8cdc16d058bf94a753465510aa0fae08ab4511e7e0106c5de033474968dd54e89b8bafd3f0245ee4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalgebra-lang kalgebra-lang-all locale(kalgebra:ar) locale(kalgebra:be) locale(kalgebra:bg) locale(kalgebra:bs) locale(kalgebra:ca) locale(kalgebra:ca@valencia) locale(kalgebra:cs) locale(kalgebra:da) locale(kalgebra:de) locale(kalgebra:el) locale(kalgebra:en_GB) locale(kalgebra:eo) locale(kalgebra:es) locale(kalgebra:et) locale(kalgebra:eu) locale(kalgebra:fi) locale(kalgebra:fr) locale(kalgebra:ga) locale(kalgebra:gl) locale(kalgebra:hi) locale(kalgebra:hr) locale(kalgebra:hu) locale(kalgebra:it) locale(kalgebra:ja) locale(kalgebra:ka) locale(kalgebra:kk) locale(kalgebra:km) locale(kalgebra:ko) locale(kalgebra:lt) locale(kalgebra:lv) locale(kalgebra:mai) locale(kalgebra:ml) locale(kalgebra:mr) locale(kalgebra:nb) locale(kalgebra:nds) locale(kalgebra:nl) locale(kalgebra:nn) locale(kalgebra:oc) locale(kalgebra:pa) locale(kalgebra:pl) locale(kalgebra:pt) locale(kalgebra:pt_BR) locale(kalgebra:ro) locale(kalgebra:ru) locale(kalgebra:si) locale(kalgebra:sk) locale(kalgebra:sl) locale(kalgebra:sv) locale(kalgebra:te) locale(kalgebra:tr) locale(kalgebra:ug) locale(kalgebra:uk) locale(kalgebra:zh_CN) locale(kalgebra:zh_TW)"
RDEPENDS:${PN} += "kalgebra"

inherit rpm
