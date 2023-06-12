SUMMARY = "Translations for package libKF5IconThemes5"
DESCRIPTION = "Provides translations for the 'libKF5IconThemes5' package."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5IconThemes5-lang-5.106.0-1.2.noarch.rpm"
RPM_HASH = "337c49484137ac153548513477064abcc911a9c33ca4980843b49ded4df5290c0beca1be30b7fd55aaeba2c0b43f67a2dbdcc382fc4d7513ad3a48500344b15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5IconThemes5-lang \
libKF5IconThemes5-lang-all \
locale(libKF5IconThemes5:af) \
locale(libKF5IconThemes5:ar) \
locale(libKF5IconThemes5:az) \
locale(libKF5IconThemes5:be) \
locale(libKF5IconThemes5:be@latin) \
locale(libKF5IconThemes5:bg) \
locale(libKF5IconThemes5:bn) \
locale(libKF5IconThemes5:br) \
locale(libKF5IconThemes5:bs) \
locale(libKF5IconThemes5:ca) \
locale(libKF5IconThemes5:ca@valencia) \
locale(libKF5IconThemes5:cs) \
locale(libKF5IconThemes5:cy) \
locale(libKF5IconThemes5:da) \
locale(libKF5IconThemes5:de) \
locale(libKF5IconThemes5:el) \
locale(libKF5IconThemes5:en_GB) \
locale(libKF5IconThemes5:eo) \
locale(libKF5IconThemes5:es) \
locale(libKF5IconThemes5:et) \
locale(libKF5IconThemes5:eu) \
locale(libKF5IconThemes5:fa) \
locale(libKF5IconThemes5:fi) \
locale(libKF5IconThemes5:fr) \
locale(libKF5IconThemes5:ga) \
locale(libKF5IconThemes5:gd) \
locale(libKF5IconThemes5:gl) \
locale(libKF5IconThemes5:gu) \
locale(libKF5IconThemes5:he) \
locale(libKF5IconThemes5:hi) \
locale(libKF5IconThemes5:hr) \
locale(libKF5IconThemes5:hu) \
locale(libKF5IconThemes5:ia) \
locale(libKF5IconThemes5:id) \
locale(libKF5IconThemes5:is) \
locale(libKF5IconThemes5:it) \
locale(libKF5IconThemes5:ja) \
locale(libKF5IconThemes5:ka) \
locale(libKF5IconThemes5:kk) \
locale(libKF5IconThemes5:km) \
locale(libKF5IconThemes5:ko) \
locale(libKF5IconThemes5:lt) \
locale(libKF5IconThemes5:lv) \
locale(libKF5IconThemes5:mai) \
locale(libKF5IconThemes5:mk) \
locale(libKF5IconThemes5:ml) \
locale(libKF5IconThemes5:mr) \
locale(libKF5IconThemes5:ms) \
locale(libKF5IconThemes5:nb) \
locale(libKF5IconThemes5:nds) \
locale(libKF5IconThemes5:ne) \
locale(libKF5IconThemes5:nl) \
locale(libKF5IconThemes5:nn) \
locale(libKF5IconThemes5:oc) \
locale(libKF5IconThemes5:pa) \
locale(libKF5IconThemes5:pl) \
locale(libKF5IconThemes5:pt) \
locale(libKF5IconThemes5:pt_BR) \
locale(libKF5IconThemes5:ro) \
locale(libKF5IconThemes5:ru) \
locale(libKF5IconThemes5:sk) \
locale(libKF5IconThemes5:sl) \
locale(libKF5IconThemes5:sq) \
locale(libKF5IconThemes5:sr) \
locale(libKF5IconThemes5:sr@ijekavian) \
locale(libKF5IconThemes5:sr@ijekavianlatin) \
locale(libKF5IconThemes5:sr@latin) \
locale(libKF5IconThemes5:sv) \
locale(libKF5IconThemes5:ta) \
locale(libKF5IconThemes5:th) \
locale(libKF5IconThemes5:tr) \
locale(libKF5IconThemes5:ug) \
locale(libKF5IconThemes5:uk) \
locale(libKF5IconThemes5:vi) \
locale(libKF5IconThemes5:wa) \
locale(libKF5IconThemes5:zh_CN) \
locale(libKF5IconThemes5:zh_TW)"
RDEPENDS:${PN} += "libKF5IconThemes5"

inherit rpm
