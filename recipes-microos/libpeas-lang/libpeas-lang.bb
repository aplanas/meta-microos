SUMMARY = "Translations for package libpeas"
DESCRIPTION = "Provides translations for the 'libpeas' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-lang-1.36.0-1.1.noarch.rpm"
RPM_HASH = "9189b63ae360fa3e0b1faf6e799b27fa3f2490751d5794eed41861b8d36ddf87a3e9b9731f81854daeb0243f732b225fe3cf728f06516a9902639072719e98c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpeas-lang libpeas-lang-all locale(libpeas:ar) locale(libpeas:as) locale(libpeas:ast) locale(libpeas:be) locale(libpeas:bg) locale(libpeas:bn_IN) locale(libpeas:bs) locale(libpeas:ca) locale(libpeas:ca@valencia) locale(libpeas:cs) locale(libpeas:da) locale(libpeas:de) locale(libpeas:el) locale(libpeas:en_GB) locale(libpeas:eo) locale(libpeas:es) locale(libpeas:et) locale(libpeas:eu) locale(libpeas:fa) locale(libpeas:fi) locale(libpeas:fr) locale(libpeas:fur) locale(libpeas:gl) locale(libpeas:gu) locale(libpeas:he) locale(libpeas:hi) locale(libpeas:hr) locale(libpeas:hu) locale(libpeas:id) locale(libpeas:is) locale(libpeas:it) locale(libpeas:ja) locale(libpeas:ka) locale(libpeas:kk) locale(libpeas:kn) locale(libpeas:ko) locale(libpeas:lt) locale(libpeas:lv) locale(libpeas:ml) locale(libpeas:mr) locale(libpeas:ms) locale(libpeas:nb) locale(libpeas:nds) locale(libpeas:ne) locale(libpeas:nl) locale(libpeas:oc) locale(libpeas:or) locale(libpeas:pa) locale(libpeas:pl) locale(libpeas:pt) locale(libpeas:pt_BR) locale(libpeas:ro) locale(libpeas:ru) locale(libpeas:sk) locale(libpeas:sl) locale(libpeas:sr) locale(libpeas:sr@latin) locale(libpeas:sv) locale(libpeas:ta) locale(libpeas:te) locale(libpeas:th) locale(libpeas:tr) locale(libpeas:ug) locale(libpeas:uk) locale(libpeas:vi) locale(libpeas:zh_CN) locale(libpeas:zh_HK) locale(libpeas:zh_TW)"
RDEPENDS:${PN} += "libpeas"

inherit rpm
