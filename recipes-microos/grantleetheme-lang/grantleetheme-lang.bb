SUMMARY = "Translations for package grantleetheme"
DESCRIPTION = "Provides translations for the 'grantleetheme' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "grantleetheme-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "6d19f1c68eb7d884bfb5e528274bcd23275cb768a7f99f016009cd464c98af16748bab535dad0448cc3328900392785cd08c28d40744bc9419606e3204161ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grantleetheme-lang grantleetheme-lang-all locale(grantleetheme:ar) locale(grantleetheme:bg) locale(grantleetheme:bs) locale(grantleetheme:ca) locale(grantleetheme:ca@valencia) locale(grantleetheme:cs) locale(grantleetheme:da) locale(grantleetheme:de) locale(grantleetheme:el) locale(grantleetheme:en_GB) locale(grantleetheme:es) locale(grantleetheme:et) locale(grantleetheme:eu) locale(grantleetheme:fi) locale(grantleetheme:fr) locale(grantleetheme:gl) locale(grantleetheme:hi) locale(grantleetheme:hu) locale(grantleetheme:ia) locale(grantleetheme:it) locale(grantleetheme:ja) locale(grantleetheme:ka) locale(grantleetheme:kk) locale(grantleetheme:ko) locale(grantleetheme:lt) locale(grantleetheme:nb) locale(grantleetheme:nds) locale(grantleetheme:nl) locale(grantleetheme:nn) locale(grantleetheme:pl) locale(grantleetheme:pt) locale(grantleetheme:pt_BR) locale(grantleetheme:ro) locale(grantleetheme:ru) locale(grantleetheme:sk) locale(grantleetheme:sl) locale(grantleetheme:sr) locale(grantleetheme:sr@ijekavian) locale(grantleetheme:sr@ijekavianlatin) locale(grantleetheme:sr@latin) locale(grantleetheme:sv) locale(grantleetheme:tr) locale(grantleetheme:ug) locale(grantleetheme:uk) locale(grantleetheme:zh_CN) locale(grantleetheme:zh_TW)"
RDEPENDS:${PN} += "grantleetheme"

inherit rpm
