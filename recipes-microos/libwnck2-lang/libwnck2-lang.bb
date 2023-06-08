SUMMARY = "Translations for package libwnck2"
DESCRIPTION = "Provides translations for the 'libwnck2' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.31.0"

RPM_NAME = "libwnck2-lang-2.31.0-13.3.noarch.rpm"
RPM_HASH = "24f9fb2713cc059a99d39bbc80be53a4f970d2ae84377b129fdd8e5994532f36dba84f2acc8c4ef05754574cafb09fddfa0039b85dfad3056971469e26894d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwnck2-lang libwnck2-lang-all locale(libwnck2:ar) locale(libwnck2:as) locale(libwnck2:ast) locale(libwnck2:az) locale(libwnck2:be) locale(libwnck2:be@latin) locale(libwnck2:bg) locale(libwnck2:bn) locale(libwnck2:bn_IN) locale(libwnck2:br) locale(libwnck2:bs) locale(libwnck2:ca) locale(libwnck2:ca@valencia) locale(libwnck2:cs) locale(libwnck2:cy) locale(libwnck2:da) locale(libwnck2:de) locale(libwnck2:dz) locale(libwnck2:el) locale(libwnck2:en@shaw) locale(libwnck2:en_CA) locale(libwnck2:en_GB) locale(libwnck2:eo) locale(libwnck2:es) locale(libwnck2:et) locale(libwnck2:eu) locale(libwnck2:fa) locale(libwnck2:fi) locale(libwnck2:fr) locale(libwnck2:ga) locale(libwnck2:gl) locale(libwnck2:gu) locale(libwnck2:he) locale(libwnck2:hi) locale(libwnck2:hr) locale(libwnck2:hu) locale(libwnck2:id) locale(libwnck2:is) locale(libwnck2:it) locale(libwnck2:ja) locale(libwnck2:ka) locale(libwnck2:kk) locale(libwnck2:kn) locale(libwnck2:ko) locale(libwnck2:lt) locale(libwnck2:lv) locale(libwnck2:mai) locale(libwnck2:mk) locale(libwnck2:ml) locale(libwnck2:mr) locale(libwnck2:ms) locale(libwnck2:nb) locale(libwnck2:ne) locale(libwnck2:nl) locale(libwnck2:nn) locale(libwnck2:oc) locale(libwnck2:or) locale(libwnck2:pa) locale(libwnck2:pl) locale(libwnck2:pt) locale(libwnck2:pt_BR) locale(libwnck2:ro) locale(libwnck2:ru) locale(libwnck2:si) locale(libwnck2:sk) locale(libwnck2:sl) locale(libwnck2:sq) locale(libwnck2:sr) locale(libwnck2:sr@latin) locale(libwnck2:sv) locale(libwnck2:ta) locale(libwnck2:te) locale(libwnck2:th) locale(libwnck2:tr) locale(libwnck2:ug) locale(libwnck2:uk) locale(libwnck2:vi) locale(libwnck2:wa) locale(libwnck2:zh_CN) locale(libwnck2:zh_HK) locale(libwnck2:zh_TW)"
RDEPENDS:${PN} += "libwnck2"

inherit rpm
