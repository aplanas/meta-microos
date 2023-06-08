SUMMARY = "Translations for package kcolorchooser"
DESCRIPTION = "Provides translations for the 'kcolorchooser' package."
LICENSE = "MIT"

PV = "23.04.0"

RPM_NAME = "kcolorchooser-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "b42b6d1e38177aba9517f377209fbeabae2ebde6b38dd5f3b14ba80ab82f2447204b7c43de233e73284f0c20a93e481fc305dd8af29378edd97a507efb5c86a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcolorchooser-lang kcolorchooser-lang-all locale(kcolorchooser:ar) locale(kcolorchooser:az) locale(kcolorchooser:be) locale(kcolorchooser:bg) locale(kcolorchooser:bs) locale(kcolorchooser:ca) locale(kcolorchooser:ca@valencia) locale(kcolorchooser:cs) locale(kcolorchooser:da) locale(kcolorchooser:de) locale(kcolorchooser:el) locale(kcolorchooser:en_GB) locale(kcolorchooser:eo) locale(kcolorchooser:es) locale(kcolorchooser:et) locale(kcolorchooser:eu) locale(kcolorchooser:fi) locale(kcolorchooser:fr) locale(kcolorchooser:ga) locale(kcolorchooser:gl) locale(kcolorchooser:he) locale(kcolorchooser:hi) locale(kcolorchooser:hr) locale(kcolorchooser:hu) locale(kcolorchooser:ia) locale(kcolorchooser:is) locale(kcolorchooser:it) locale(kcolorchooser:ja) locale(kcolorchooser:ka) locale(kcolorchooser:kk) locale(kcolorchooser:km) locale(kcolorchooser:ko) locale(kcolorchooser:lt) locale(kcolorchooser:lv) locale(kcolorchooser:mk) locale(kcolorchooser:ml) locale(kcolorchooser:mr) locale(kcolorchooser:nb) locale(kcolorchooser:nds) locale(kcolorchooser:nl) locale(kcolorchooser:nn) locale(kcolorchooser:oc) locale(kcolorchooser:pa) locale(kcolorchooser:pl) locale(kcolorchooser:pt) locale(kcolorchooser:pt_BR) locale(kcolorchooser:ro) locale(kcolorchooser:ru) locale(kcolorchooser:si) locale(kcolorchooser:sk) locale(kcolorchooser:sl) locale(kcolorchooser:sq) locale(kcolorchooser:sr) locale(kcolorchooser:sr@ijekavian) locale(kcolorchooser:sr@ijekavianlatin) locale(kcolorchooser:sr@latin) locale(kcolorchooser:sv) locale(kcolorchooser:th) locale(kcolorchooser:tr) locale(kcolorchooser:ug) locale(kcolorchooser:uk) locale(kcolorchooser:vi) locale(kcolorchooser:wa) locale(kcolorchooser:zh_CN) locale(kcolorchooser:zh_TW)"
RDEPENDS:${PN} += "kcolorchooser"

inherit rpm
