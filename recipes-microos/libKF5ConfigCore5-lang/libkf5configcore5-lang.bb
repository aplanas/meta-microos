SUMMARY = "Translations for package libKF5ConfigCore5"
DESCRIPTION = "Provides translations for the 'libKF5ConfigCore5' package."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ConfigCore5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "373072a9ea0148f4df1ee33cf3c87457b78748b8eb5d76e9be5e3e6717b1d6adf6e576500609c19e67b79e5b2ac9316e40cfd5bfbe15c143de47a493ae451ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5ConfigCore5-lang \
libKF5ConfigCore5-lang-all \
locale(libKF5ConfigCore5:af) \
locale(libKF5ConfigCore5:ar) \
locale(libKF5ConfigCore5:az) \
locale(libKF5ConfigCore5:be) \
locale(libKF5ConfigCore5:be@latin) \
locale(libKF5ConfigCore5:bg) \
locale(libKF5ConfigCore5:bn) \
locale(libKF5ConfigCore5:bn_IN) \
locale(libKF5ConfigCore5:br) \
locale(libKF5ConfigCore5:bs) \
locale(libKF5ConfigCore5:ca) \
locale(libKF5ConfigCore5:ca@valencia) \
locale(libKF5ConfigCore5:cs) \
locale(libKF5ConfigCore5:cy) \
locale(libKF5ConfigCore5:da) \
locale(libKF5ConfigCore5:de) \
locale(libKF5ConfigCore5:el) \
locale(libKF5ConfigCore5:en_GB) \
locale(libKF5ConfigCore5:eo) \
locale(libKF5ConfigCore5:es) \
locale(libKF5ConfigCore5:et) \
locale(libKF5ConfigCore5:eu) \
locale(libKF5ConfigCore5:fa) \
locale(libKF5ConfigCore5:fi) \
locale(libKF5ConfigCore5:fr) \
locale(libKF5ConfigCore5:ga) \
locale(libKF5ConfigCore5:gd) \
locale(libKF5ConfigCore5:gl) \
locale(libKF5ConfigCore5:gu) \
locale(libKF5ConfigCore5:he) \
locale(libKF5ConfigCore5:hi) \
locale(libKF5ConfigCore5:hr) \
locale(libKF5ConfigCore5:hu) \
locale(libKF5ConfigCore5:ia) \
locale(libKF5ConfigCore5:id) \
locale(libKF5ConfigCore5:is) \
locale(libKF5ConfigCore5:it) \
locale(libKF5ConfigCore5:ja) \
locale(libKF5ConfigCore5:ka) \
locale(libKF5ConfigCore5:kk) \
locale(libKF5ConfigCore5:km) \
locale(libKF5ConfigCore5:kn) \
locale(libKF5ConfigCore5:ko) \
locale(libKF5ConfigCore5:lt) \
locale(libKF5ConfigCore5:lv) \
locale(libKF5ConfigCore5:mai) \
locale(libKF5ConfigCore5:mk) \
locale(libKF5ConfigCore5:ml) \
locale(libKF5ConfigCore5:mr) \
locale(libKF5ConfigCore5:ms) \
locale(libKF5ConfigCore5:nb) \
locale(libKF5ConfigCore5:nds) \
locale(libKF5ConfigCore5:ne) \
locale(libKF5ConfigCore5:nl) \
locale(libKF5ConfigCore5:nn) \
locale(libKF5ConfigCore5:or) \
locale(libKF5ConfigCore5:pa) \
locale(libKF5ConfigCore5:pl) \
locale(libKF5ConfigCore5:pt) \
locale(libKF5ConfigCore5:pt_BR) \
locale(libKF5ConfigCore5:ro) \
locale(libKF5ConfigCore5:ru) \
locale(libKF5ConfigCore5:si) \
locale(libKF5ConfigCore5:sk) \
locale(libKF5ConfigCore5:sl) \
locale(libKF5ConfigCore5:sq) \
locale(libKF5ConfigCore5:sr) \
locale(libKF5ConfigCore5:sr@ijekavian) \
locale(libKF5ConfigCore5:sr@ijekavianlatin) \
locale(libKF5ConfigCore5:sr@latin) \
locale(libKF5ConfigCore5:sv) \
locale(libKF5ConfigCore5:ta) \
locale(libKF5ConfigCore5:te) \
locale(libKF5ConfigCore5:th) \
locale(libKF5ConfigCore5:tr) \
locale(libKF5ConfigCore5:ug) \
locale(libKF5ConfigCore5:uk) \
locale(libKF5ConfigCore5:vi) \
locale(libKF5ConfigCore5:wa) \
locale(libKF5ConfigCore5:zh_CN) \
locale(libKF5ConfigCore5:zh_TW)"
RDEPENDS:${PN} += "libKF5ConfigCore5"

inherit rpm
