SUMMARY = "Translations for package kalendar"
DESCRIPTION = "Provides translations for the 'kalendar' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "kalendar-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e2259ec4f5b2d3c0546885d06e2688a9b8bc8496158e9d25ea7ca92e4bdaa27f5f4569ea860c8c277b3c1492a204732ce32009c6805b9fc55aef5f242b16e352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalendar-lang kalendar-lang-all locale(kalendar:ar) locale(kalendar:az) locale(kalendar:ca) locale(kalendar:ca@valencia) locale(kalendar:cs) locale(kalendar:de) locale(kalendar:el) locale(kalendar:en_GB) locale(kalendar:es) locale(kalendar:eu) locale(kalendar:fi) locale(kalendar:fr) locale(kalendar:hu) locale(kalendar:id) locale(kalendar:it) locale(kalendar:ja) locale(kalendar:ka) locale(kalendar:ko) locale(kalendar:lt) locale(kalendar:lv) locale(kalendar:nl) locale(kalendar:nn) locale(kalendar:pl) locale(kalendar:pt) locale(kalendar:pt_BR) locale(kalendar:ru) locale(kalendar:sk) locale(kalendar:sl) locale(kalendar:sv) locale(kalendar:ta) locale(kalendar:tr) locale(kalendar:uk) locale(kalendar:zh_CN) locale(kalendar:zh_TW)"
RDEPENDS:${PN} += "kalendar"

inherit rpm
