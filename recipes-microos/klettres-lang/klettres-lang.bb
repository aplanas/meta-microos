SUMMARY = "Translations for package klettres"
DESCRIPTION = "Provides translations for the 'klettres' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "klettres-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "f416ba0fb55ecc0803d8068314f944bf40c2972f75355fe95f222694fc162ce3f548aed0c8b802c936e16a599841bef815e804e15ec48fd07758d9a10147ac38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klettres-lang klettres-lang-all locale(klettres:af) locale(klettres:ar) locale(klettres:be) locale(klettres:bg) locale(klettres:bn) locale(klettres:br) locale(klettres:bs) locale(klettres:ca) locale(klettres:ca@valencia) locale(klettres:cs) locale(klettres:cy) locale(klettres:da) locale(klettres:de) locale(klettres:el) locale(klettres:en_GB) locale(klettres:eo) locale(klettres:es) locale(klettres:et) locale(klettres:eu) locale(klettres:fa) locale(klettres:fi) locale(klettres:fr) locale(klettres:ga) locale(klettres:gl) locale(klettres:gu) locale(klettres:he) locale(klettres:hi) locale(klettres:hr) locale(klettres:hu) locale(klettres:id) locale(klettres:is) locale(klettres:it) locale(klettres:ja) locale(klettres:ka) locale(klettres:kk) locale(klettres:km) locale(klettres:ko) locale(klettres:lt) locale(klettres:lv) locale(klettres:mk) locale(klettres:ml) locale(klettres:mr) locale(klettres:ms) locale(klettres:nb) locale(klettres:nds) locale(klettres:ne) locale(klettres:nl) locale(klettres:nn) locale(klettres:oc) locale(klettres:pa) locale(klettres:pl) locale(klettres:pt) locale(klettres:pt_BR) locale(klettres:ro) locale(klettres:ru) locale(klettres:si) locale(klettres:sk) locale(klettres:sl) locale(klettres:sq) locale(klettres:sv) locale(klettres:ta) locale(klettres:tr) locale(klettres:ug) locale(klettres:uk) locale(klettres:vi) locale(klettres:wa) locale(klettres:zh_CN) locale(klettres:zh_TW)"
RDEPENDS:${PN} += "klettres"

inherit rpm
