SUMMARY = "Translations for package libksieve"
DESCRIPTION = "Provides translations for the 'libksieve' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libksieve-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "0bf73478acb3701f229aed844bfd55e764daae87ab829d7740985e443d32ef88c45489e24bd3189fd91d06dd050512c20966c5c74b699e475a77fe44ee0e376a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksieve-lang libksieve-lang-all locale(libksieve:ar) locale(libksieve:be) locale(libksieve:bg) locale(libksieve:br) locale(libksieve:bs) locale(libksieve:ca) locale(libksieve:ca@valencia) locale(libksieve:cs) locale(libksieve:cy) locale(libksieve:da) locale(libksieve:de) locale(libksieve:el) locale(libksieve:en_GB) locale(libksieve:eo) locale(libksieve:es) locale(libksieve:et) locale(libksieve:eu) locale(libksieve:fa) locale(libksieve:fi) locale(libksieve:fr) locale(libksieve:ga) locale(libksieve:gl) locale(libksieve:hi) locale(libksieve:hu) locale(libksieve:ia) locale(libksieve:is) locale(libksieve:it) locale(libksieve:ja) locale(libksieve:ka) locale(libksieve:kk) locale(libksieve:km) locale(libksieve:ko) locale(libksieve:lt) locale(libksieve:lv) locale(libksieve:mk) locale(libksieve:mr) locale(libksieve:ms) locale(libksieve:nb) locale(libksieve:nds) locale(libksieve:ne) locale(libksieve:nl) locale(libksieve:nn) locale(libksieve:pa) locale(libksieve:pl) locale(libksieve:pt) locale(libksieve:pt_BR) locale(libksieve:ro) locale(libksieve:ru) locale(libksieve:sk) locale(libksieve:sl) locale(libksieve:sq) locale(libksieve:sr) locale(libksieve:sr@ijekavian) locale(libksieve:sr@ijekavianlatin) locale(libksieve:sr@latin) locale(libksieve:sv) locale(libksieve:ta) locale(libksieve:tr) locale(libksieve:ug) locale(libksieve:uk) locale(libksieve:zh_CN) locale(libksieve:zh_TW)"
RDEPENDS:${PN} += "libksieve"

inherit rpm
