SUMMARY = "Translations for package kfilemetadata5"
DESCRIPTION = "Provides translations for the 'kfilemetadata5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "kfilemetadata5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "7aff47a9fb9d0a513dfcaf02d8bc90a6a845223ea35d571ca5cdc9753adad376b23e2ef308a0f9d8efbef21e68353eb5ff420191ea18a1ef640d96e02dd4fd3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfilemetadata5-lang kfilemetadata5-lang-all locale(kfilemetadata5:ar) locale(kfilemetadata5:az) locale(kfilemetadata5:bg) locale(kfilemetadata5:bs) locale(kfilemetadata5:ca) locale(kfilemetadata5:ca@valencia) locale(kfilemetadata5:cs) locale(kfilemetadata5:da) locale(kfilemetadata5:de) locale(kfilemetadata5:el) locale(kfilemetadata5:en_GB) locale(kfilemetadata5:es) locale(kfilemetadata5:et) locale(kfilemetadata5:eu) locale(kfilemetadata5:fi) locale(kfilemetadata5:fr) locale(kfilemetadata5:gd) locale(kfilemetadata5:gl) locale(kfilemetadata5:hu) locale(kfilemetadata5:ia) locale(kfilemetadata5:id) locale(kfilemetadata5:it) locale(kfilemetadata5:ja) locale(kfilemetadata5:ka) locale(kfilemetadata5:ko) locale(kfilemetadata5:lt) locale(kfilemetadata5:ml) locale(kfilemetadata5:nb) locale(kfilemetadata5:nds) locale(kfilemetadata5:nl) locale(kfilemetadata5:nn) locale(kfilemetadata5:pa) locale(kfilemetadata5:pl) locale(kfilemetadata5:pt) locale(kfilemetadata5:pt_BR) locale(kfilemetadata5:ro) locale(kfilemetadata5:ru) locale(kfilemetadata5:sk) locale(kfilemetadata5:sl) locale(kfilemetadata5:sr) locale(kfilemetadata5:sr@ijekavian) locale(kfilemetadata5:sr@ijekavianlatin) locale(kfilemetadata5:sr@latin) locale(kfilemetadata5:sv) locale(kfilemetadata5:ta) locale(kfilemetadata5:tr) locale(kfilemetadata5:uk) locale(kfilemetadata5:zh_CN) locale(kfilemetadata5:zh_TW)"
RDEPENDS:${PN} += "kfilemetadata5"

inherit rpm
