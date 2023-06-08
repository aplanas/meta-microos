SUMMARY = "Translations for package knetwalk"
DESCRIPTION = "Provides translations for the 'knetwalk' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "knetwalk-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "3ecf4f41669db90073ea8080ddb58a76f864c5d74e7659424709992dfc8dcb960edc731a60f7344d1d1a3222ff56eac7ee592f023a180e0378c23dff91378edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knetwalk-lang knetwalk-lang-all locale(knetwalk:ar) locale(knetwalk:be) locale(knetwalk:bg) locale(knetwalk:br) locale(knetwalk:bs) locale(knetwalk:ca) locale(knetwalk:ca@valencia) locale(knetwalk:cs) locale(knetwalk:cy) locale(knetwalk:da) locale(knetwalk:de) locale(knetwalk:el) locale(knetwalk:en_GB) locale(knetwalk:eo) locale(knetwalk:es) locale(knetwalk:et) locale(knetwalk:eu) locale(knetwalk:fa) locale(knetwalk:fi) locale(knetwalk:fr) locale(knetwalk:ga) locale(knetwalk:gl) locale(knetwalk:he) locale(knetwalk:hi) locale(knetwalk:hr) locale(knetwalk:hu) locale(knetwalk:id) locale(knetwalk:is) locale(knetwalk:it) locale(knetwalk:ja) locale(knetwalk:ka) locale(knetwalk:kk) locale(knetwalk:km) locale(knetwalk:ko) locale(knetwalk:lt) locale(knetwalk:lv) locale(knetwalk:mai) locale(knetwalk:mk) locale(knetwalk:ml) locale(knetwalk:mr) locale(knetwalk:nb) locale(knetwalk:nds) locale(knetwalk:ne) locale(knetwalk:nl) locale(knetwalk:nn) locale(knetwalk:oc) locale(knetwalk:pa) locale(knetwalk:pl) locale(knetwalk:pt) locale(knetwalk:pt_BR) locale(knetwalk:ro) locale(knetwalk:ru) locale(knetwalk:sk) locale(knetwalk:sl) locale(knetwalk:sq) locale(knetwalk:sr) locale(knetwalk:sr@ijekavian) locale(knetwalk:sr@ijekavianlatin) locale(knetwalk:sr@latin) locale(knetwalk:sv) locale(knetwalk:te) locale(knetwalk:th) locale(knetwalk:tr) locale(knetwalk:ug) locale(knetwalk:uk) locale(knetwalk:zh_CN) locale(knetwalk:zh_TW)"
RDEPENDS:${PN} += "knetwalk"

inherit rpm
