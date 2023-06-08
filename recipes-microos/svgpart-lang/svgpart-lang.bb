SUMMARY = "Translations for package svgpart"
DESCRIPTION = "Provides translations for the 'svgpart' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "svgpart-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "4173418dcd37fcd3414ede8003ca8a0714d1b49e6706d091ed061c3f865d49c66633e5cc6835c6c67d6c1e6b96421950ba1d7bcc7a9a21619536d8a582c1343e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(svgpart:ar) locale(svgpart:be) locale(svgpart:bg) locale(svgpart:bs) locale(svgpart:ca) locale(svgpart:ca@valencia) locale(svgpart:cs) locale(svgpart:da) locale(svgpart:de) locale(svgpart:el) locale(svgpart:en_GB) locale(svgpart:eo) locale(svgpart:es) locale(svgpart:et) locale(svgpart:eu) locale(svgpart:fi) locale(svgpart:fr) locale(svgpart:ga) locale(svgpart:gl) locale(svgpart:hi) locale(svgpart:hr) locale(svgpart:hu) locale(svgpart:ia) locale(svgpart:id) locale(svgpart:is) locale(svgpart:it) locale(svgpart:ja) locale(svgpart:ka) locale(svgpart:kk) locale(svgpart:km) locale(svgpart:ko) locale(svgpart:lt) locale(svgpart:lv) locale(svgpart:mk) locale(svgpart:ml) locale(svgpart:mr) locale(svgpart:nb) locale(svgpart:nds) locale(svgpart:nl) locale(svgpart:nn) locale(svgpart:pa) locale(svgpart:pl) locale(svgpart:pt) locale(svgpart:pt_BR) locale(svgpart:ro) locale(svgpart:ru) locale(svgpart:si) locale(svgpart:sk) locale(svgpart:sl) locale(svgpart:sq) locale(svgpart:sv) locale(svgpart:ta) locale(svgpart:th) locale(svgpart:tr) locale(svgpart:ug) locale(svgpart:uk) locale(svgpart:vi) locale(svgpart:wa) locale(svgpart:zh_CN) locale(svgpart:zh_TW) svgpart-lang svgpart-lang-all"
RDEPENDS:${PN} += "svgpart"

inherit rpm
