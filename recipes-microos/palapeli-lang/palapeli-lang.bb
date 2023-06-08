SUMMARY = "Translations for package palapeli"
DESCRIPTION = "Provides translations for the 'palapeli' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "palapeli-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "8e5bb9bea1155ff089ffe08ca0d080c1fba130e54dc5c54d62667aadfad036b940910745194dac16a27bf878d84f488738a72284b2fc65923780193aee842c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(palapeli:bg) locale(palapeli:bs) locale(palapeli:ca) locale(palapeli:ca@valencia) locale(palapeli:cs) locale(palapeli:da) locale(palapeli:de) locale(palapeli:el) locale(palapeli:en_GB) locale(palapeli:eo) locale(palapeli:es) locale(palapeli:et) locale(palapeli:eu) locale(palapeli:fi) locale(palapeli:fr) locale(palapeli:ga) locale(palapeli:gl) locale(palapeli:hr) locale(palapeli:hu) locale(palapeli:is) locale(palapeli:it) locale(palapeli:ja) locale(palapeli:ka) locale(palapeli:kk) locale(palapeli:km) locale(palapeli:ko) locale(palapeli:lt) locale(palapeli:lv) locale(palapeli:mai) locale(palapeli:ml) locale(palapeli:mr) locale(palapeli:nb) locale(palapeli:nds) locale(palapeli:nl) locale(palapeli:nn) locale(palapeli:pl) locale(palapeli:pt) locale(palapeli:pt_BR) locale(palapeli:ro) locale(palapeli:ru) locale(palapeli:sk) locale(palapeli:sl) locale(palapeli:sq) locale(palapeli:sr) locale(palapeli:sr@ijekavian) locale(palapeli:sr@ijekavianlatin) locale(palapeli:sr@latin) locale(palapeli:sv) locale(palapeli:tr) locale(palapeli:ug) locale(palapeli:uk) locale(palapeli:zh_CN) locale(palapeli:zh_TW) palapeli-lang palapeli-lang-all"
RDEPENDS:${PN} += "palapeli"

inherit rpm
