SUMMARY = "Translations for package libksysguard5"
DESCRIPTION = "Provides translations for the 'libksysguard5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libksysguard5-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "e3e380281d58900271a2fe9914ce6f9da7e2839b99db64afa5a1fe9c61029468f237d3f11671929592c1f2578655fb141c257fdb706cd38b41f3951b20d28c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksysguard5-lang libksysguard5-lang-all locale(libksysguard5:ar) locale(libksysguard5:as) locale(libksysguard5:az) locale(libksysguard5:be) locale(libksysguard5:be@latin) locale(libksysguard5:bg) locale(libksysguard5:bn_IN) locale(libksysguard5:bs) locale(libksysguard5:ca) locale(libksysguard5:ca@valencia) locale(libksysguard5:cs) locale(libksysguard5:da) locale(libksysguard5:de) locale(libksysguard5:el) locale(libksysguard5:en_GB) locale(libksysguard5:eo) locale(libksysguard5:es) locale(libksysguard5:et) locale(libksysguard5:eu) locale(libksysguard5:fa) locale(libksysguard5:fi) locale(libksysguard5:fr) locale(libksysguard5:ga) locale(libksysguard5:gl) locale(libksysguard5:gu) locale(libksysguard5:he) locale(libksysguard5:hi) locale(libksysguard5:hr) locale(libksysguard5:hu) locale(libksysguard5:ia) locale(libksysguard5:id) locale(libksysguard5:is) locale(libksysguard5:it) locale(libksysguard5:ja) locale(libksysguard5:ka) locale(libksysguard5:kk) locale(libksysguard5:km) locale(libksysguard5:kn) locale(libksysguard5:ko) locale(libksysguard5:lt) locale(libksysguard5:lv) locale(libksysguard5:mai) locale(libksysguard5:mk) locale(libksysguard5:ml) locale(libksysguard5:mr) locale(libksysguard5:ms) locale(libksysguard5:nb) locale(libksysguard5:nds) locale(libksysguard5:ne) locale(libksysguard5:nl) locale(libksysguard5:nn) locale(libksysguard5:oc) locale(libksysguard5:pa) locale(libksysguard5:pl) locale(libksysguard5:pt) locale(libksysguard5:pt_BR) locale(libksysguard5:ro) locale(libksysguard5:ru) locale(libksysguard5:si) locale(libksysguard5:sk) locale(libksysguard5:sl) locale(libksysguard5:sq) locale(libksysguard5:sr) locale(libksysguard5:sr@ijekavian) locale(libksysguard5:sr@ijekavianlatin) locale(libksysguard5:sr@latin) locale(libksysguard5:sv) locale(libksysguard5:ta) locale(libksysguard5:te) locale(libksysguard5:th) locale(libksysguard5:tr) locale(libksysguard5:ug) locale(libksysguard5:uk) locale(libksysguard5:vi) locale(libksysguard5:wa) locale(libksysguard5:zh_CN) locale(libksysguard5:zh_TW)"
RDEPENDS:${PN} += "libksysguard5"

inherit rpm
