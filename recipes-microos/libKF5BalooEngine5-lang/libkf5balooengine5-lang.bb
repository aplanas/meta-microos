SUMMARY = "Translations for package libKF5BalooEngine5"
DESCRIPTION = "Provides translations for the 'libKF5BalooEngine5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "libKF5BalooEngine5-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "e436b6bc7e1d576dcc9d34560b3962bbf37c166815f0c1648c753c8273b03c4028234926509f0601983adb4cf72dea9b3f08f01a46662af5ee8f471f5a9abd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5BalooEngine5-lang libKF5BalooEngine5-lang-all locale(libKF5BalooEngine5:ar) locale(libKF5BalooEngine5:az) locale(libKF5BalooEngine5:bg) locale(libKF5BalooEngine5:ca) locale(libKF5BalooEngine5:ca@valencia) locale(libKF5BalooEngine5:cs) locale(libKF5BalooEngine5:da) locale(libKF5BalooEngine5:de) locale(libKF5BalooEngine5:el) locale(libKF5BalooEngine5:en_GB) locale(libKF5BalooEngine5:es) locale(libKF5BalooEngine5:et) locale(libKF5BalooEngine5:eu) locale(libKF5BalooEngine5:fi) locale(libKF5BalooEngine5:fr) locale(libKF5BalooEngine5:gl) locale(libKF5BalooEngine5:hu) locale(libKF5BalooEngine5:ia) locale(libKF5BalooEngine5:id) locale(libKF5BalooEngine5:it) locale(libKF5BalooEngine5:ja) locale(libKF5BalooEngine5:ka) locale(libKF5BalooEngine5:ko) locale(libKF5BalooEngine5:lt) locale(libKF5BalooEngine5:ml) locale(libKF5BalooEngine5:nl) locale(libKF5BalooEngine5:nn) locale(libKF5BalooEngine5:pl) locale(libKF5BalooEngine5:pt) locale(libKF5BalooEngine5:pt_BR) locale(libKF5BalooEngine5:ro) locale(libKF5BalooEngine5:ru) locale(libKF5BalooEngine5:sk) locale(libKF5BalooEngine5:sl) locale(libKF5BalooEngine5:sv) locale(libKF5BalooEngine5:ta) locale(libKF5BalooEngine5:tr) locale(libKF5BalooEngine5:uk) locale(libKF5BalooEngine5:zh_CN) locale(libKF5BalooEngine5:zh_TW)"
RDEPENDS:${PN} += "libKF5BalooEngine5"

inherit rpm
