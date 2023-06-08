SUMMARY = "Translations for package libgdata"
DESCRIPTION = "Provides translations for the 'libgdata' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "libgdata-lang-0.18.1-3.3.noarch.rpm"
RPM_HASH = "81f30e5db58f109ca56212ff028a9fbccdd783189f242d0f26f6e16cea864a851f970f3b1a69caa2a336954d421c72ceaeca5684a43dc976d486e72175b1e55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgdata-lang libgdata-lang-all locale(libgdata:ar) locale(libgdata:as) locale(libgdata:be) locale(libgdata:bg) locale(libgdata:bn_IN) locale(libgdata:bs) locale(libgdata:ca) locale(libgdata:ca@valencia) locale(libgdata:cs) locale(libgdata:da) locale(libgdata:de) locale(libgdata:el) locale(libgdata:en_GB) locale(libgdata:eo) locale(libgdata:es) locale(libgdata:et) locale(libgdata:eu) locale(libgdata:fi) locale(libgdata:fr) locale(libgdata:fur) locale(libgdata:gl) locale(libgdata:gu) locale(libgdata:he) locale(libgdata:hi) locale(libgdata:hr) locale(libgdata:hu) locale(libgdata:id) locale(libgdata:it) locale(libgdata:ja) locale(libgdata:kn) locale(libgdata:ko) locale(libgdata:lt) locale(libgdata:lv) locale(libgdata:ml) locale(libgdata:mr) locale(libgdata:ms) locale(libgdata:nb) locale(libgdata:ne) locale(libgdata:nl) locale(libgdata:oc) locale(libgdata:or) locale(libgdata:pa) locale(libgdata:pl) locale(libgdata:pt) locale(libgdata:pt_BR) locale(libgdata:ro) locale(libgdata:ru) locale(libgdata:sk) locale(libgdata:sl) locale(libgdata:sr) locale(libgdata:sr@latin) locale(libgdata:sv) locale(libgdata:ta) locale(libgdata:te) locale(libgdata:th) locale(libgdata:tr) locale(libgdata:ug) locale(libgdata:uk) locale(libgdata:vi) locale(libgdata:zh_CN) locale(libgdata:zh_HK) locale(libgdata:zh_TW)"
RDEPENDS:${PN} += "libgdata"

inherit rpm
