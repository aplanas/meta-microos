SUMMARY = "Translations for package libKF5ConfigWidgets5"
DESCRIPTION = "Provides translations for the 'libKF5ConfigWidgets5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ConfigWidgets5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "17751d4e17df8b7508abd0cc8be4050d700f81b2a6a37e23ae80af51570c13e9d10151d42cd3ee8f6feda7733ddbd6e91527441d4a4d6a830f1b454894d0840d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5ConfigWidgets5-lang \
libKF5ConfigWidgets5-lang-all \
locale(libKF5ConfigWidgets5:af) \
locale(libKF5ConfigWidgets5:ar) \
locale(libKF5ConfigWidgets5:as) \
locale(libKF5ConfigWidgets5:az) \
locale(libKF5ConfigWidgets5:be) \
locale(libKF5ConfigWidgets5:be@latin) \
locale(libKF5ConfigWidgets5:bg) \
locale(libKF5ConfigWidgets5:bn) \
locale(libKF5ConfigWidgets5:bn_IN) \
locale(libKF5ConfigWidgets5:br) \
locale(libKF5ConfigWidgets5:bs) \
locale(libKF5ConfigWidgets5:ca) \
locale(libKF5ConfigWidgets5:ca@valencia) \
locale(libKF5ConfigWidgets5:cs) \
locale(libKF5ConfigWidgets5:cy) \
locale(libKF5ConfigWidgets5:da) \
locale(libKF5ConfigWidgets5:de) \
locale(libKF5ConfigWidgets5:el) \
locale(libKF5ConfigWidgets5:en_GB) \
locale(libKF5ConfigWidgets5:eo) \
locale(libKF5ConfigWidgets5:es) \
locale(libKF5ConfigWidgets5:et) \
locale(libKF5ConfigWidgets5:eu) \
locale(libKF5ConfigWidgets5:fa) \
locale(libKF5ConfigWidgets5:fi) \
locale(libKF5ConfigWidgets5:fr) \
locale(libKF5ConfigWidgets5:ga) \
locale(libKF5ConfigWidgets5:gd) \
locale(libKF5ConfigWidgets5:gl) \
locale(libKF5ConfigWidgets5:gu) \
locale(libKF5ConfigWidgets5:he) \
locale(libKF5ConfigWidgets5:hi) \
locale(libKF5ConfigWidgets5:hr) \
locale(libKF5ConfigWidgets5:hu) \
locale(libKF5ConfigWidgets5:ia) \
locale(libKF5ConfigWidgets5:id) \
locale(libKF5ConfigWidgets5:is) \
locale(libKF5ConfigWidgets5:it) \
locale(libKF5ConfigWidgets5:ja) \
locale(libKF5ConfigWidgets5:ka) \
locale(libKF5ConfigWidgets5:kk) \
locale(libKF5ConfigWidgets5:km) \
locale(libKF5ConfigWidgets5:kn) \
locale(libKF5ConfigWidgets5:ko) \
locale(libKF5ConfigWidgets5:lt) \
locale(libKF5ConfigWidgets5:lv) \
locale(libKF5ConfigWidgets5:mai) \
locale(libKF5ConfigWidgets5:mk) \
locale(libKF5ConfigWidgets5:ml) \
locale(libKF5ConfigWidgets5:mr) \
locale(libKF5ConfigWidgets5:ms) \
locale(libKF5ConfigWidgets5:nb) \
locale(libKF5ConfigWidgets5:nds) \
locale(libKF5ConfigWidgets5:ne) \
locale(libKF5ConfigWidgets5:nl) \
locale(libKF5ConfigWidgets5:nn) \
locale(libKF5ConfigWidgets5:oc) \
locale(libKF5ConfigWidgets5:or) \
locale(libKF5ConfigWidgets5:pa) \
locale(libKF5ConfigWidgets5:pl) \
locale(libKF5ConfigWidgets5:pt) \
locale(libKF5ConfigWidgets5:pt_BR) \
locale(libKF5ConfigWidgets5:ro) \
locale(libKF5ConfigWidgets5:ru) \
locale(libKF5ConfigWidgets5:si) \
locale(libKF5ConfigWidgets5:sk) \
locale(libKF5ConfigWidgets5:sl) \
locale(libKF5ConfigWidgets5:sq) \
locale(libKF5ConfigWidgets5:sr) \
locale(libKF5ConfigWidgets5:sr@ijekavian) \
locale(libKF5ConfigWidgets5:sr@ijekavianlatin) \
locale(libKF5ConfigWidgets5:sr@latin) \
locale(libKF5ConfigWidgets5:sv) \
locale(libKF5ConfigWidgets5:ta) \
locale(libKF5ConfigWidgets5:te) \
locale(libKF5ConfigWidgets5:th) \
locale(libKF5ConfigWidgets5:tr) \
locale(libKF5ConfigWidgets5:ug) \
locale(libKF5ConfigWidgets5:uk) \
locale(libKF5ConfigWidgets5:vi) \
locale(libKF5ConfigWidgets5:wa) \
locale(libKF5ConfigWidgets5:zh_CN) \
locale(libKF5ConfigWidgets5:zh_HK) \
locale(libKF5ConfigWidgets5:zh_TW)"
RDEPENDS:${PN} += "libKF5ConfigWidgets5"

inherit rpm
