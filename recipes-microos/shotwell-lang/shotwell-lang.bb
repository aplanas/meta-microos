SUMMARY = "Translations for package shotwell"
DESCRIPTION = "Provides translations for the 'shotwell' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.32.0"

RPM_NAME = "shotwell-lang-0.32.0-1.1.noarch.rpm"
RPM_HASH = "f0b8e4f5714bdd4e2350c0508a8b957a641ca659cd854fa4338dc72552aff672b0663e63a35c3b11632d5c1c3e89afa9bf0b5b822bf6fb5447a8b10d0e424f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(shotwell:af) locale(shotwell:ar) locale(shotwell:as) locale(shotwell:ast) locale(shotwell:bg) locale(shotwell:bn) locale(shotwell:bn_IN) locale(shotwell:bs) locale(shotwell:ca) locale(shotwell:cs) locale(shotwell:da) locale(shotwell:de) locale(shotwell:el) locale(shotwell:en_GB) locale(shotwell:eo) locale(shotwell:es) locale(shotwell:et) locale(shotwell:eu) locale(shotwell:fi) locale(shotwell:fr) locale(shotwell:gd) locale(shotwell:gl) locale(shotwell:gu) locale(shotwell:he) locale(shotwell:hi) locale(shotwell:hr) locale(shotwell:hu) locale(shotwell:ia) locale(shotwell:id) locale(shotwell:it) locale(shotwell:ja) locale(shotwell:ka) locale(shotwell:kk) locale(shotwell:km) locale(shotwell:kn) locale(shotwell:ko) locale(shotwell:lt) locale(shotwell:lv) locale(shotwell:mk) locale(shotwell:ml) locale(shotwell:mr) locale(shotwell:nb) locale(shotwell:nl) locale(shotwell:nn) locale(shotwell:oc) locale(shotwell:or) locale(shotwell:pa) locale(shotwell:pl) locale(shotwell:pt) locale(shotwell:pt_BR) locale(shotwell:ro) locale(shotwell:ru) locale(shotwell:sk) locale(shotwell:sl) locale(shotwell:sr) locale(shotwell:sr@latin) locale(shotwell:sv) locale(shotwell:ta) locale(shotwell:te) locale(shotwell:th) locale(shotwell:tr) locale(shotwell:uk) locale(shotwell:vi) locale(shotwell:zh_CN) locale(shotwell:zh_HK) locale(shotwell:zh_TW) shotwell-lang shotwell-lang-all"
RDEPENDS:${PN} += "shotwell"

inherit rpm
