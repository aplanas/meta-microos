SUMMARY = "Translations for package translator"
DESCRIPTION = "Provides translations for the 'translator' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "translator-lang-1.4.1-1.19.noarch.rpm"
RPM_HASH = "6319f6fa0b92cc72a13fa7482203fbe4f38b6c80f23824be0bd584e0e8cc1a90cbf0bf4ac55cdda37694237e4d89e4e850529533bf2087de91a2d95572109151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translator:af) locale(translator:ar) locale(translator:as) locale(translator:ast) locale(translator:az) locale(translator:be) locale(translator:bg) locale(translator:bn) locale(translator:br) locale(translator:bs) locale(translator:ca) locale(translator:cs) locale(translator:cy) locale(translator:da) locale(translator:de) locale(translator:dz) locale(translator:el) locale(translator:en_AU) locale(translator:en_CA) locale(translator:en_GB) locale(translator:eo) locale(translator:es) locale(translator:et) locale(translator:eu) locale(translator:fa) locale(translator:fi) locale(translator:fr) locale(translator:fr_CA) locale(translator:ga) locale(translator:gd) locale(translator:gl) locale(translator:gu) locale(translator:he) locale(translator:hi) locale(translator:hr) locale(translator:hu) locale(translator:ia) locale(translator:id) locale(translator:is) locale(translator:it) locale(translator:ja) locale(translator:ka) locale(translator:kk) locale(translator:km) locale(translator:kn) locale(translator:ko) locale(translator:lt) locale(translator:lv) locale(translator:mk) locale(translator:ml) locale(translator:mr) locale(translator:ms) locale(translator:nb) locale(translator:ne) locale(translator:nl) locale(translator:nn) locale(translator:oc) locale(translator:or) locale(translator:pa) locale(translator:pl) locale(translator:pt) locale(translator:pt_BR) locale(translator:ro) locale(translator:ru) locale(translator:si) locale(translator:sk) locale(translator:sl) locale(translator:sq) locale(translator:sr) locale(translator:sv) locale(translator:ta) locale(translator:te) locale(translator:th) locale(translator:tr) locale(translator:ug) locale(translator:uk) locale(translator:vi) locale(translator:wa) locale(translator:zh) locale(translator:zh_CN) locale(translator:zh_HK) locale(translator:zh_TW) translator-lang translator-lang-all"
RDEPENDS:${PN} += "translator"

inherit rpm
