SUMMARY = "Translations for package libktorrent"
DESCRIPTION = "Provides translations for the 'libktorrent' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libktorrent-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "651096a3572a5e290ce711187a8936a850c667ab10e9e00a8435877fb790cfe00ff2f6e1f08b9a05b20d23aef3ed114508945851677f43e0550fc9ae99e86e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libktorrent-lang libktorrent-lang-all locale(libktorrent:ar) locale(libktorrent:be) locale(libktorrent:bg) locale(libktorrent:bs) locale(libktorrent:ca) locale(libktorrent:ca@valencia) locale(libktorrent:cs) locale(libktorrent:da) locale(libktorrent:de) locale(libktorrent:el) locale(libktorrent:en_GB) locale(libktorrent:eo) locale(libktorrent:es) locale(libktorrent:et) locale(libktorrent:eu) locale(libktorrent:fi) locale(libktorrent:fr) locale(libktorrent:ga) locale(libktorrent:gl) locale(libktorrent:hi) locale(libktorrent:hr) locale(libktorrent:hu) locale(libktorrent:ia) locale(libktorrent:is) locale(libktorrent:it) locale(libktorrent:ja) locale(libktorrent:ka) locale(libktorrent:kk) locale(libktorrent:km) locale(libktorrent:ko) locale(libktorrent:lt) locale(libktorrent:lv) locale(libktorrent:mr) locale(libktorrent:ms) locale(libktorrent:nb) locale(libktorrent:nds) locale(libktorrent:nl) locale(libktorrent:nn) locale(libktorrent:oc) locale(libktorrent:pl) locale(libktorrent:pt) locale(libktorrent:pt_BR) locale(libktorrent:ro) locale(libktorrent:ru) locale(libktorrent:si) locale(libktorrent:sk) locale(libktorrent:sl) locale(libktorrent:sr) locale(libktorrent:sr@ijekavian) locale(libktorrent:sr@ijekavianlatin) locale(libktorrent:sr@latin) locale(libktorrent:sv) locale(libktorrent:tr) locale(libktorrent:ug) locale(libktorrent:uk) locale(libktorrent:zh_CN) locale(libktorrent:zh_TW)"
RDEPENDS:${PN} += "libktorrent"

inherit rpm
