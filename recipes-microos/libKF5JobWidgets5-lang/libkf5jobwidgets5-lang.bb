SUMMARY = "Translations for package libKF5JobWidgets5"
DESCRIPTION = "Provides translations for the 'libKF5JobWidgets5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5JobWidgets5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "4352bcb13a2307570d6d7173c46f19b94deded3b0902ecd1e8cda305fb3bb17305b0f7aa4a4f2337cceb7f72b500ac8c1331a7cac863fac833621d3c2825e5b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5JobWidgets5-lang \
libKF5JobWidgets5-lang-all \
locale(libKF5JobWidgets5:af) \
locale(libKF5JobWidgets5:ar) \
locale(libKF5JobWidgets5:as) \
locale(libKF5JobWidgets5:az) \
locale(libKF5JobWidgets5:be) \
locale(libKF5JobWidgets5:be@latin) \
locale(libKF5JobWidgets5:bg) \
locale(libKF5JobWidgets5:bn) \
locale(libKF5JobWidgets5:bn_IN) \
locale(libKF5JobWidgets5:br) \
locale(libKF5JobWidgets5:bs) \
locale(libKF5JobWidgets5:ca) \
locale(libKF5JobWidgets5:ca@valencia) \
locale(libKF5JobWidgets5:cs) \
locale(libKF5JobWidgets5:cy) \
locale(libKF5JobWidgets5:da) \
locale(libKF5JobWidgets5:de) \
locale(libKF5JobWidgets5:el) \
locale(libKF5JobWidgets5:en) \
locale(libKF5JobWidgets5:en_GB) \
locale(libKF5JobWidgets5:eo) \
locale(libKF5JobWidgets5:es) \
locale(libKF5JobWidgets5:et) \
locale(libKF5JobWidgets5:eu) \
locale(libKF5JobWidgets5:fa) \
locale(libKF5JobWidgets5:fi) \
locale(libKF5JobWidgets5:fr) \
locale(libKF5JobWidgets5:ga) \
locale(libKF5JobWidgets5:gd) \
locale(libKF5JobWidgets5:gl) \
locale(libKF5JobWidgets5:gu) \
locale(libKF5JobWidgets5:he) \
locale(libKF5JobWidgets5:hi) \
locale(libKF5JobWidgets5:hr) \
locale(libKF5JobWidgets5:hu) \
locale(libKF5JobWidgets5:ia) \
locale(libKF5JobWidgets5:id) \
locale(libKF5JobWidgets5:is) \
locale(libKF5JobWidgets5:it) \
locale(libKF5JobWidgets5:ja) \
locale(libKF5JobWidgets5:ka) \
locale(libKF5JobWidgets5:kk) \
locale(libKF5JobWidgets5:km) \
locale(libKF5JobWidgets5:kn) \
locale(libKF5JobWidgets5:ko) \
locale(libKF5JobWidgets5:lt) \
locale(libKF5JobWidgets5:lv) \
locale(libKF5JobWidgets5:mai) \
locale(libKF5JobWidgets5:mk) \
locale(libKF5JobWidgets5:ml) \
locale(libKF5JobWidgets5:mr) \
locale(libKF5JobWidgets5:ms) \
locale(libKF5JobWidgets5:nb) \
locale(libKF5JobWidgets5:nds) \
locale(libKF5JobWidgets5:ne) \
locale(libKF5JobWidgets5:nl) \
locale(libKF5JobWidgets5:nn) \
locale(libKF5JobWidgets5:oc) \
locale(libKF5JobWidgets5:or) \
locale(libKF5JobWidgets5:pa) \
locale(libKF5JobWidgets5:pl) \
locale(libKF5JobWidgets5:pt) \
locale(libKF5JobWidgets5:pt_BR) \
locale(libKF5JobWidgets5:ro) \
locale(libKF5JobWidgets5:ru) \
locale(libKF5JobWidgets5:si) \
locale(libKF5JobWidgets5:sk) \
locale(libKF5JobWidgets5:sl) \
locale(libKF5JobWidgets5:sq) \
locale(libKF5JobWidgets5:sr) \
locale(libKF5JobWidgets5:sr@ijekavian) \
locale(libKF5JobWidgets5:sr@ijekavianlatin) \
locale(libKF5JobWidgets5:sr@latin) \
locale(libKF5JobWidgets5:sv) \
locale(libKF5JobWidgets5:ta) \
locale(libKF5JobWidgets5:te) \
locale(libKF5JobWidgets5:th) \
locale(libKF5JobWidgets5:tr) \
locale(libKF5JobWidgets5:ug) \
locale(libKF5JobWidgets5:uk) \
locale(libKF5JobWidgets5:vi) \
locale(libKF5JobWidgets5:wa) \
locale(libKF5JobWidgets5:zh_CN) \
locale(libKF5JobWidgets5:zh_HK) \
locale(libKF5JobWidgets5:zh_TW)"
RDEPENDS:${PN} += "libKF5JobWidgets5"

inherit rpm
