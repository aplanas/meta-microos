SUMMARY = "Translations for package gwenview5"
DESCRIPTION = "Provides translations for the 'gwenview5' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "gwenview5-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "5f18bd04027e41c95328d4b258e832f3976a474bc326f11a30d9a6e0320e6716656fa07950c786df986b48f3a36d24155d84b49371e6f9f27409134f9ac0c18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gwenview5-lang gwenview5-lang-all locale(gwenview5:ar) locale(gwenview5:az) locale(gwenview5:be) locale(gwenview5:bg) locale(gwenview5:bn) locale(gwenview5:bs) locale(gwenview5:ca) locale(gwenview5:ca@valencia) locale(gwenview5:cs) locale(gwenview5:da) locale(gwenview5:de) locale(gwenview5:el) locale(gwenview5:en_GB) locale(gwenview5:eo) locale(gwenview5:es) locale(gwenview5:et) locale(gwenview5:eu) locale(gwenview5:fi) locale(gwenview5:fr) locale(gwenview5:ga) locale(gwenview5:gl) locale(gwenview5:he) locale(gwenview5:hi) locale(gwenview5:hr) locale(gwenview5:hu) locale(gwenview5:ia) locale(gwenview5:id) locale(gwenview5:is) locale(gwenview5:it) locale(gwenview5:ja) locale(gwenview5:ka) locale(gwenview5:kk) locale(gwenview5:km) locale(gwenview5:ko) locale(gwenview5:lt) locale(gwenview5:lv) locale(gwenview5:ml) locale(gwenview5:mr) locale(gwenview5:nb) locale(gwenview5:nds) locale(gwenview5:nl) locale(gwenview5:nn) locale(gwenview5:oc) locale(gwenview5:pa) locale(gwenview5:pl) locale(gwenview5:pt) locale(gwenview5:pt_BR) locale(gwenview5:ro) locale(gwenview5:ru) locale(gwenview5:sk) locale(gwenview5:sl) locale(gwenview5:sq) locale(gwenview5:sr) locale(gwenview5:sr@ijekavian) locale(gwenview5:sr@ijekavianlatin) locale(gwenview5:sr@latin) locale(gwenview5:sv) locale(gwenview5:ta) locale(gwenview5:th) locale(gwenview5:tr) locale(gwenview5:ug) locale(gwenview5:uk) locale(gwenview5:wa) locale(gwenview5:zh_CN) locale(gwenview5:zh_TW)"
RDEPENDS:${PN} += "gwenview5"

inherit rpm
