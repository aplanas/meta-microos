SUMMARY = "Translations for package kreversi"
DESCRIPTION = "Provides translations for the 'kreversi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kreversi-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "27adbad595b4ab27d21d83052790e50648c711c26ac2cbcc332a12750d37ea36ce942c13de20bd089d8d416fc72d1f44b6f352d5d4fb94ffa726d58f2ac30879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kreversi-lang kreversi-lang-all locale(kreversi:af) locale(kreversi:ar) locale(kreversi:be) locale(kreversi:bg) locale(kreversi:bn) locale(kreversi:br) locale(kreversi:bs) locale(kreversi:ca) locale(kreversi:ca@valencia) locale(kreversi:cs) locale(kreversi:cy) locale(kreversi:da) locale(kreversi:de) locale(kreversi:el) locale(kreversi:en_GB) locale(kreversi:eo) locale(kreversi:es) locale(kreversi:et) locale(kreversi:eu) locale(kreversi:fa) locale(kreversi:fi) locale(kreversi:fr) locale(kreversi:ga) locale(kreversi:gl) locale(kreversi:he) locale(kreversi:hi) locale(kreversi:hr) locale(kreversi:hu) locale(kreversi:id) locale(kreversi:is) locale(kreversi:it) locale(kreversi:ja) locale(kreversi:ka) locale(kreversi:kk) locale(kreversi:km) locale(kreversi:ko) locale(kreversi:lt) locale(kreversi:lv) locale(kreversi:mai) locale(kreversi:mk) locale(kreversi:ml) locale(kreversi:mr) locale(kreversi:nb) locale(kreversi:nds) locale(kreversi:ne) locale(kreversi:nl) locale(kreversi:nn) locale(kreversi:oc) locale(kreversi:pa) locale(kreversi:pl) locale(kreversi:pt) locale(kreversi:pt_BR) locale(kreversi:ro) locale(kreversi:ru) locale(kreversi:sk) locale(kreversi:sl) locale(kreversi:sq) locale(kreversi:sr) locale(kreversi:sr@ijekavian) locale(kreversi:sr@ijekavianlatin) locale(kreversi:sr@latin) locale(kreversi:sv) locale(kreversi:ta) locale(kreversi:th) locale(kreversi:tr) locale(kreversi:ug) locale(kreversi:uk) locale(kreversi:zh_CN) locale(kreversi:zh_TW)"
RDEPENDS:${PN} += "kreversi"

inherit rpm
