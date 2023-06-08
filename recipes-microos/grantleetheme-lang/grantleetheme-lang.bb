SUMMARY = "Translations for package grantleetheme"
DESCRIPTION = "Provides translations for the 'grantleetheme' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "grantleetheme-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "1e6868424ca0364784b98290bb3543659cd43154721a3d014592643257bb0d26f92c4593a08d709148137235cc721cc49a3df200c1c65bb4ef5fbfb1b43f3a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grantleetheme-lang grantleetheme-lang-all locale(grantleetheme:ar) locale(grantleetheme:bg) locale(grantleetheme:bs) locale(grantleetheme:ca) locale(grantleetheme:ca@valencia) locale(grantleetheme:cs) locale(grantleetheme:da) locale(grantleetheme:de) locale(grantleetheme:el) locale(grantleetheme:en_GB) locale(grantleetheme:es) locale(grantleetheme:et) locale(grantleetheme:eu) locale(grantleetheme:fi) locale(grantleetheme:fr) locale(grantleetheme:gl) locale(grantleetheme:hi) locale(grantleetheme:hu) locale(grantleetheme:ia) locale(grantleetheme:it) locale(grantleetheme:ja) locale(grantleetheme:ka) locale(grantleetheme:kk) locale(grantleetheme:ko) locale(grantleetheme:lt) locale(grantleetheme:nb) locale(grantleetheme:nds) locale(grantleetheme:nl) locale(grantleetheme:nn) locale(grantleetheme:pl) locale(grantleetheme:pt) locale(grantleetheme:pt_BR) locale(grantleetheme:ro) locale(grantleetheme:ru) locale(grantleetheme:sk) locale(grantleetheme:sl) locale(grantleetheme:sr) locale(grantleetheme:sr@ijekavian) locale(grantleetheme:sr@ijekavianlatin) locale(grantleetheme:sr@latin) locale(grantleetheme:sv) locale(grantleetheme:tr) locale(grantleetheme:ug) locale(grantleetheme:uk) locale(grantleetheme:zh_CN) locale(grantleetheme:zh_TW)"
RDEPENDS:${PN} += "grantleetheme"

inherit rpm
