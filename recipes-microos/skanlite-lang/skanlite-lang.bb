SUMMARY = "Translations for package skanlite"
DESCRIPTION = "Provides translations for the 'skanlite' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "skanlite-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6a1cbf433c8b00f013b3d3b74c8a2ea742371423d0572a0d1d20ef8e1309705172d250977f3e105385dc2c294ea147a266197b831debe22037e9672a88e3c3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(skanlite:ar) locale(skanlite:az) locale(skanlite:be) locale(skanlite:bg) locale(skanlite:bs) locale(skanlite:ca) locale(skanlite:ca@valencia) locale(skanlite:cs) locale(skanlite:da) locale(skanlite:de) locale(skanlite:el) locale(skanlite:en_GB) locale(skanlite:eo) locale(skanlite:es) locale(skanlite:et) locale(skanlite:eu) locale(skanlite:fi) locale(skanlite:fr) locale(skanlite:ga) locale(skanlite:gl) locale(skanlite:hi) locale(skanlite:hr) locale(skanlite:hu) locale(skanlite:ia) locale(skanlite:id) locale(skanlite:is) locale(skanlite:it) locale(skanlite:ja) locale(skanlite:ka) locale(skanlite:km) locale(skanlite:ko) locale(skanlite:lt) locale(skanlite:lv) locale(skanlite:mai) locale(skanlite:mr) locale(skanlite:nb) locale(skanlite:nds) locale(skanlite:nl) locale(skanlite:nn) locale(skanlite:pa) locale(skanlite:pl) locale(skanlite:pt) locale(skanlite:pt_BR) locale(skanlite:ro) locale(skanlite:ru) locale(skanlite:sk) locale(skanlite:sl) locale(skanlite:sq) locale(skanlite:sv) locale(skanlite:tr) locale(skanlite:ug) locale(skanlite:uk) locale(skanlite:wa) locale(skanlite:zh_CN) locale(skanlite:zh_TW) skanlite-lang skanlite-lang-all"
RDEPENDS:${PN} += "skanlite"

inherit rpm
