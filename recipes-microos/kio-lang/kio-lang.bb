SUMMARY = "Translations for package kio"
DESCRIPTION = "Provides translations for the 'kio' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kio-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "6dcc64cfa3d4cf73e5f26d0262a4eb1c30e503e25cdaecb24fce600d3dec7e3f47374da9e423f94ed377aa6f102e442b5143d90a49b0892960943bd00c17e9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-lang kio-lang-all locale(kio:af) locale(kio:ar) locale(kio:ast) locale(kio:az) locale(kio:be) locale(kio:be@latin) locale(kio:bg) locale(kio:bn) locale(kio:br) locale(kio:bs) locale(kio:ca) locale(kio:ca@valencia) locale(kio:cs) locale(kio:cy) locale(kio:da) locale(kio:de) locale(kio:el) locale(kio:en_GB) locale(kio:eo) locale(kio:es) locale(kio:et) locale(kio:eu) locale(kio:fa) locale(kio:fi) locale(kio:fr) locale(kio:ga) locale(kio:gl) locale(kio:gu) locale(kio:he) locale(kio:hi) locale(kio:hr) locale(kio:hu) locale(kio:ia) locale(kio:id) locale(kio:is) locale(kio:it) locale(kio:ja) locale(kio:ka) locale(kio:kk) locale(kio:km) locale(kio:ko) locale(kio:lt) locale(kio:lv) locale(kio:mai) locale(kio:mk) locale(kio:ml) locale(kio:mr) locale(kio:ms) locale(kio:nb) locale(kio:nds) locale(kio:ne) locale(kio:nl) locale(kio:nn) locale(kio:oc) locale(kio:pa) locale(kio:pl) locale(kio:pt) locale(kio:pt_BR) locale(kio:ro) locale(kio:ru) locale(kio:sk) locale(kio:sl) locale(kio:sq) locale(kio:sr) locale(kio:sr@ijekavian) locale(kio:sr@ijekavianlatin) locale(kio:sr@latin) locale(kio:sv) locale(kio:ta) locale(kio:th) locale(kio:tr) locale(kio:ug) locale(kio:uk) locale(kio:vi) locale(kio:wa) locale(kio:zh_CN) locale(kio:zh_TW)"
RDEPENDS:${PN} += "kio"

inherit rpm
