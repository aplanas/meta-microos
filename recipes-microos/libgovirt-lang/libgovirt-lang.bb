SUMMARY = "Translations for package libgovirt"
DESCRIPTION = "Provides translations for the 'libgovirt' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.9"

RPM_NAME = "libgovirt-lang-0.3.9-1.3.noarch.rpm"
RPM_HASH = "84a96dd47b744d3aeea3738865dbea871b9405911e648a2001dcabfdd61d575e0201fb8ec1a6b5c98382b189373ef1133d8e460dad7a32e12cdbd5536641b1af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgovirt-lang libgovirt-lang-all locale(libgovirt:bs) locale(libgovirt:ca) locale(libgovirt:cs) locale(libgovirt:da) locale(libgovirt:de) locale(libgovirt:el) locale(libgovirt:es) locale(libgovirt:eu) locale(libgovirt:fi) locale(libgovirt:fr) locale(libgovirt:fur) locale(libgovirt:hr) locale(libgovirt:hu) locale(libgovirt:id) locale(libgovirt:it) locale(libgovirt:ka) locale(libgovirt:lt) locale(libgovirt:nl) locale(libgovirt:oc) locale(libgovirt:pl) locale(libgovirt:pt) locale(libgovirt:pt_BR) locale(libgovirt:ro) locale(libgovirt:ru) locale(libgovirt:sl) locale(libgovirt:sr) locale(libgovirt:sr@latin) locale(libgovirt:sv) locale(libgovirt:tr) locale(libgovirt:uk) locale(libgovirt:zh_CN)"
RDEPENDS:${PN} += "libgovirt"

inherit rpm
