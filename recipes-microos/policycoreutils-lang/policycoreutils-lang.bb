SUMMARY = "Translations for package policycoreutils"
DESCRIPTION = "Provides translations for the 'policycoreutils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-lang-3.5-1.4.noarch.rpm"
RPM_HASH = "524f0fb2544713f8997cdef6491718e9b81b8c7625bf601a05d3e647df22f0fe6dfd98108efb1e089394f9a5ac3e6bd989787bce0eb97afd53afb2b927c9fd1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(policycoreutils:af) locale(policycoreutils:ar) locale(policycoreutils:as) locale(policycoreutils:ast) locale(policycoreutils:az) locale(policycoreutils:be) locale(policycoreutils:bg) locale(policycoreutils:bn) locale(policycoreutils:bn_IN) locale(policycoreutils:br) locale(policycoreutils:bs) locale(policycoreutils:ca) locale(policycoreutils:cs) locale(policycoreutils:cy) locale(policycoreutils:da) locale(policycoreutils:de) locale(policycoreutils:de_CH) locale(policycoreutils:dz) locale(policycoreutils:el) locale(policycoreutils:en_GB) locale(policycoreutils:eo) locale(policycoreutils:es) locale(policycoreutils:es_MX) locale(policycoreutils:et) locale(policycoreutils:eu) locale(policycoreutils:fa) locale(policycoreutils:fi) locale(policycoreutils:fr) locale(policycoreutils:ga) locale(policycoreutils:gl) locale(policycoreutils:gu) locale(policycoreutils:he) locale(policycoreutils:hi) locale(policycoreutils:hr) locale(policycoreutils:hu) locale(policycoreutils:ia) locale(policycoreutils:id) locale(policycoreutils:is) locale(policycoreutils:it) locale(policycoreutils:ja) locale(policycoreutils:ka) locale(policycoreutils:kk) locale(policycoreutils:km) locale(policycoreutils:kn) locale(policycoreutils:ko) locale(policycoreutils:lt) locale(policycoreutils:lv) locale(policycoreutils:mai) locale(policycoreutils:mk) locale(policycoreutils:ml) locale(policycoreutils:mr) locale(policycoreutils:ms) locale(policycoreutils:nb) locale(policycoreutils:nds) locale(policycoreutils:ne) locale(policycoreutils:nl) locale(policycoreutils:nn) locale(policycoreutils:or) locale(policycoreutils:pa) locale(policycoreutils:pl) locale(policycoreutils:pt) locale(policycoreutils:pt_BR) locale(policycoreutils:ro) locale(policycoreutils:ru) locale(policycoreutils:si) locale(policycoreutils:sk) locale(policycoreutils:sl) locale(policycoreutils:sq) locale(policycoreutils:sr) locale(policycoreutils:sr@latin) locale(policycoreutils:sv) locale(policycoreutils:ta) locale(policycoreutils:te) locale(policycoreutils:th) locale(policycoreutils:tr) locale(policycoreutils:uk) locale(policycoreutils:vi) locale(policycoreutils:zh_CN) locale(policycoreutils:zh_HK) locale(policycoreutils:zh_TW) policycoreutils-lang policycoreutils-lang-all"
RDEPENDS:${PN} += "policycoreutils"

inherit rpm
