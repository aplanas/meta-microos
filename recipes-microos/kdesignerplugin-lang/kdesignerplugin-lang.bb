SUMMARY = "Translations for package kdesignerplugin"
DESCRIPTION = "Provides translations for the 'kdesignerplugin' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdesignerplugin-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "a5cf319b9917e8f6d55722a55f08bbd0fd47fbe926f7c36fd481880162027844c5913332329f95128c3442b942527fb408739cc69afbf4e69a08c8220ab2767a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesignerplugin-lang \
kdesignerplugin-lang-all \
locale(kdesignerplugin:af) \
locale(kdesignerplugin:ar) \
locale(kdesignerplugin:as) \
locale(kdesignerplugin:az) \
locale(kdesignerplugin:be) \
locale(kdesignerplugin:be@latin) \
locale(kdesignerplugin:bg) \
locale(kdesignerplugin:bn) \
locale(kdesignerplugin:bn_IN) \
locale(kdesignerplugin:br) \
locale(kdesignerplugin:bs) \
locale(kdesignerplugin:ca) \
locale(kdesignerplugin:ca@valencia) \
locale(kdesignerplugin:cs) \
locale(kdesignerplugin:cy) \
locale(kdesignerplugin:da) \
locale(kdesignerplugin:de) \
locale(kdesignerplugin:el) \
locale(kdesignerplugin:en_GB) \
locale(kdesignerplugin:eo) \
locale(kdesignerplugin:es) \
locale(kdesignerplugin:et) \
locale(kdesignerplugin:eu) \
locale(kdesignerplugin:fa) \
locale(kdesignerplugin:fi) \
locale(kdesignerplugin:fr) \
locale(kdesignerplugin:ga) \
locale(kdesignerplugin:gd) \
locale(kdesignerplugin:gl) \
locale(kdesignerplugin:gu) \
locale(kdesignerplugin:he) \
locale(kdesignerplugin:hi) \
locale(kdesignerplugin:hr) \
locale(kdesignerplugin:hu) \
locale(kdesignerplugin:ia) \
locale(kdesignerplugin:id) \
locale(kdesignerplugin:is) \
locale(kdesignerplugin:it) \
locale(kdesignerplugin:ja) \
locale(kdesignerplugin:ka) \
locale(kdesignerplugin:kk) \
locale(kdesignerplugin:km) \
locale(kdesignerplugin:kn) \
locale(kdesignerplugin:ko) \
locale(kdesignerplugin:lt) \
locale(kdesignerplugin:lv) \
locale(kdesignerplugin:mai) \
locale(kdesignerplugin:mk) \
locale(kdesignerplugin:ml) \
locale(kdesignerplugin:mr) \
locale(kdesignerplugin:ms) \
locale(kdesignerplugin:nb) \
locale(kdesignerplugin:nds) \
locale(kdesignerplugin:ne) \
locale(kdesignerplugin:nl) \
locale(kdesignerplugin:nn) \
locale(kdesignerplugin:oc) \
locale(kdesignerplugin:or) \
locale(kdesignerplugin:pa) \
locale(kdesignerplugin:pl) \
locale(kdesignerplugin:pt) \
locale(kdesignerplugin:pt_BR) \
locale(kdesignerplugin:ro) \
locale(kdesignerplugin:ru) \
locale(kdesignerplugin:si) \
locale(kdesignerplugin:sk) \
locale(kdesignerplugin:sl) \
locale(kdesignerplugin:sq) \
locale(kdesignerplugin:sr) \
locale(kdesignerplugin:sr@ijekavian) \
locale(kdesignerplugin:sr@ijekavianlatin) \
locale(kdesignerplugin:sr@latin) \
locale(kdesignerplugin:sv) \
locale(kdesignerplugin:ta) \
locale(kdesignerplugin:te) \
locale(kdesignerplugin:th) \
locale(kdesignerplugin:tr) \
locale(kdesignerplugin:ug) \
locale(kdesignerplugin:uk) \
locale(kdesignerplugin:vi) \
locale(kdesignerplugin:wa) \
locale(kdesignerplugin:zh_CN) \
locale(kdesignerplugin:zh_HK) \
locale(kdesignerplugin:zh_TW)"
RDEPENDS:${PN} += "kdesignerplugin"

inherit rpm
