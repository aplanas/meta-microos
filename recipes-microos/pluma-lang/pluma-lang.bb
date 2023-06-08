SUMMARY = "Translations for package pluma"
DESCRIPTION = "Provides translations for the 'pluma' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "pluma-lang-1.26.0-2.5.noarch.rpm"
RPM_HASH = "cbb3ee975ecf191684348cbc618f1ba4f291c14b6d6458aaeea0985729c856210a5b0dd5ae5db63fee51bd7ea799308aace306758669cd5cf4f2a572f24327f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pluma:af) locale(pluma:ar) locale(pluma:as) locale(pluma:ast) locale(pluma:az) locale(pluma:be) locale(pluma:bg) locale(pluma:bn) locale(pluma:bn_IN) locale(pluma:br) locale(pluma:bs) locale(pluma:ca) locale(pluma:ca@valencia) locale(pluma:cs) locale(pluma:cy) locale(pluma:da) locale(pluma:de) locale(pluma:dz) locale(pluma:el) locale(pluma:en_AU) locale(pluma:en_CA) locale(pluma:en_GB) locale(pluma:eo) locale(pluma:es) locale(pluma:es_AR) locale(pluma:es_CO) locale(pluma:es_MX) locale(pluma:et) locale(pluma:eu) locale(pluma:fa) locale(pluma:fi) locale(pluma:fr) locale(pluma:fr_CA) locale(pluma:fur) locale(pluma:ga) locale(pluma:gl) locale(pluma:gu) locale(pluma:he) locale(pluma:hi) locale(pluma:hr) locale(pluma:hu) locale(pluma:ia) locale(pluma:id) locale(pluma:is) locale(pluma:it) locale(pluma:ja) locale(pluma:ka) locale(pluma:kk) locale(pluma:kn) locale(pluma:ko) locale(pluma:lt) locale(pluma:lv) locale(pluma:mai) locale(pluma:mk) locale(pluma:ml) locale(pluma:mr) locale(pluma:ms) locale(pluma:nb) locale(pluma:nds) locale(pluma:ne) locale(pluma:nl) locale(pluma:nn) locale(pluma:oc) locale(pluma:or) locale(pluma:pa) locale(pluma:pl) locale(pluma:pt) locale(pluma:pt_BR) locale(pluma:ro) locale(pluma:ru) locale(pluma:si) locale(pluma:sk) locale(pluma:sl) locale(pluma:sq) locale(pluma:sr) locale(pluma:sr@latin) locale(pluma:sv) locale(pluma:ta) locale(pluma:te) locale(pluma:th) locale(pluma:tr) locale(pluma:ug) locale(pluma:uk) locale(pluma:vi) locale(pluma:wa) locale(pluma:zh_CN) locale(pluma:zh_HK) locale(pluma:zh_TW) pluma-lang pluma-lang-all"
RDEPENDS:${PN} += "pluma"

inherit rpm
