SUMMARY = "Translations for package kcoreaddons"
DESCRIPTION = "Provides translations for the 'kcoreaddons' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcoreaddons-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "a286d030bb7a11403ad9a2fc79268342dcd9f7a00ae866f52ff9ff5e88ffc2b10782419577c3913635d4750b0d6a34e1f3a7a359eee5719d64fc135022eaf8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcoreaddons-lang kcoreaddons-lang-all locale(kcoreaddons:af) locale(kcoreaddons:ar) locale(kcoreaddons:as) locale(kcoreaddons:ast) locale(kcoreaddons:az) locale(kcoreaddons:be) locale(kcoreaddons:be@latin) locale(kcoreaddons:bg) locale(kcoreaddons:bn) locale(kcoreaddons:bn_IN) locale(kcoreaddons:br) locale(kcoreaddons:bs) locale(kcoreaddons:ca) locale(kcoreaddons:ca@valencia) locale(kcoreaddons:cs) locale(kcoreaddons:cy) locale(kcoreaddons:da) locale(kcoreaddons:de) locale(kcoreaddons:el) locale(kcoreaddons:en) locale(kcoreaddons:en_GB) locale(kcoreaddons:eo) locale(kcoreaddons:es) locale(kcoreaddons:et) locale(kcoreaddons:eu) locale(kcoreaddons:fa) locale(kcoreaddons:fi) locale(kcoreaddons:fr) locale(kcoreaddons:ga) locale(kcoreaddons:gd) locale(kcoreaddons:gl) locale(kcoreaddons:gu) locale(kcoreaddons:he) locale(kcoreaddons:hi) locale(kcoreaddons:hr) locale(kcoreaddons:hu) locale(kcoreaddons:ia) locale(kcoreaddons:id) locale(kcoreaddons:is) locale(kcoreaddons:it) locale(kcoreaddons:ja) locale(kcoreaddons:ka) locale(kcoreaddons:kk) locale(kcoreaddons:km) locale(kcoreaddons:kn) locale(kcoreaddons:ko) locale(kcoreaddons:lt) locale(kcoreaddons:lv) locale(kcoreaddons:mai) locale(kcoreaddons:mk) locale(kcoreaddons:ml) locale(kcoreaddons:mr) locale(kcoreaddons:ms) locale(kcoreaddons:nb) locale(kcoreaddons:nds) locale(kcoreaddons:ne) locale(kcoreaddons:nl) locale(kcoreaddons:nn) locale(kcoreaddons:oc) locale(kcoreaddons:or) locale(kcoreaddons:pa) locale(kcoreaddons:pl) locale(kcoreaddons:pt) locale(kcoreaddons:pt_BR) locale(kcoreaddons:ro) locale(kcoreaddons:ru) locale(kcoreaddons:si) locale(kcoreaddons:sk) locale(kcoreaddons:sl) locale(kcoreaddons:sq) locale(kcoreaddons:sr) locale(kcoreaddons:sr@ijekavian) locale(kcoreaddons:sr@ijekavianlatin) locale(kcoreaddons:sr@latin) locale(kcoreaddons:sv) locale(kcoreaddons:ta) locale(kcoreaddons:te) locale(kcoreaddons:th) locale(kcoreaddons:tr) locale(kcoreaddons:ug) locale(kcoreaddons:uk) locale(kcoreaddons:vi) locale(kcoreaddons:wa) locale(kcoreaddons:zh_CN) locale(kcoreaddons:zh_HK) locale(kcoreaddons:zh_TW)"
RDEPENDS:${PN} += "kcoreaddons"

inherit rpm
