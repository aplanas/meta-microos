SUMMARY = "Translations for package gtkhtml-4_0"
DESCRIPTION = "Provides translations for the 'gtkhtml-4_0' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkhtml-4_0-lang-4.10.0-7.3.noarch.rpm"
RPM_HASH = "9acf74e03698192f72ce2b185cb4639947f4eaae0136e23062e1fa2b017ce17b1446542580d3765d3e1311ef0c201222c1cf053e4bbf3f786a8ee4edc66f3125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkhtml-4_0-lang gtkhtml-4_0-lang-all locale(gtkhtml-4_0:af) locale(gtkhtml-4_0:ar) locale(gtkhtml-4_0:as) locale(gtkhtml-4_0:ast) locale(gtkhtml-4_0:az) locale(gtkhtml-4_0:be) locale(gtkhtml-4_0:bg) locale(gtkhtml-4_0:bn) locale(gtkhtml-4_0:bn_IN) locale(gtkhtml-4_0:bs) locale(gtkhtml-4_0:ca) locale(gtkhtml-4_0:ca@valencia) locale(gtkhtml-4_0:cs) locale(gtkhtml-4_0:cy) locale(gtkhtml-4_0:da) locale(gtkhtml-4_0:de) locale(gtkhtml-4_0:dz) locale(gtkhtml-4_0:el) locale(gtkhtml-4_0:en@shaw) locale(gtkhtml-4_0:en_CA) locale(gtkhtml-4_0:en_GB) locale(gtkhtml-4_0:eo) locale(gtkhtml-4_0:es) locale(gtkhtml-4_0:et) locale(gtkhtml-4_0:eu) locale(gtkhtml-4_0:fa) locale(gtkhtml-4_0:fi) locale(gtkhtml-4_0:fr) locale(gtkhtml-4_0:ga) locale(gtkhtml-4_0:gl) locale(gtkhtml-4_0:gu) locale(gtkhtml-4_0:he) locale(gtkhtml-4_0:hi) locale(gtkhtml-4_0:hr) locale(gtkhtml-4_0:hu) locale(gtkhtml-4_0:id) locale(gtkhtml-4_0:it) locale(gtkhtml-4_0:ja) locale(gtkhtml-4_0:ka) locale(gtkhtml-4_0:kn) locale(gtkhtml-4_0:ko) locale(gtkhtml-4_0:lt) locale(gtkhtml-4_0:lv) locale(gtkhtml-4_0:mai) locale(gtkhtml-4_0:mk) locale(gtkhtml-4_0:ml) locale(gtkhtml-4_0:mr) locale(gtkhtml-4_0:ms) locale(gtkhtml-4_0:nb) locale(gtkhtml-4_0:ne) locale(gtkhtml-4_0:nl) locale(gtkhtml-4_0:nn) locale(gtkhtml-4_0:oc) locale(gtkhtml-4_0:or) locale(gtkhtml-4_0:pa) locale(gtkhtml-4_0:pl) locale(gtkhtml-4_0:pt) locale(gtkhtml-4_0:pt_BR) locale(gtkhtml-4_0:ro) locale(gtkhtml-4_0:ru) locale(gtkhtml-4_0:si) locale(gtkhtml-4_0:sk) locale(gtkhtml-4_0:sl) locale(gtkhtml-4_0:sq) locale(gtkhtml-4_0:sr) locale(gtkhtml-4_0:sr@latin) locale(gtkhtml-4_0:sv) locale(gtkhtml-4_0:ta) locale(gtkhtml-4_0:te) locale(gtkhtml-4_0:th) locale(gtkhtml-4_0:tr) locale(gtkhtml-4_0:ug) locale(gtkhtml-4_0:uk) locale(gtkhtml-4_0:vi) locale(gtkhtml-4_0:zh_CN) locale(gtkhtml-4_0:zh_HK) locale(gtkhtml-4_0:zh_TW)"
RDEPENDS:${PN} += "gtkhtml-4_0"

inherit rpm
