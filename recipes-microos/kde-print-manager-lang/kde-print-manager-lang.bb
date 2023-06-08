SUMMARY = "Translations for package kde-print-manager"
DESCRIPTION = "Provides translations for the 'kde-print-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kde-print-manager-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "0faae7fc5c97fcfbaed7bfdfa10cb4e95fc665f3eca05e6a87fac5561f7a41be6ff79ce0eb76809cc60f837a72a0df261540cedb3df4e2c9ac4ddaf99d13f385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-print-manager-lang kde-print-manager-lang-all locale(kde-print-manager:ar) locale(kde-print-manager:az) locale(kde-print-manager:be) locale(kde-print-manager:bg) locale(kde-print-manager:bs) locale(kde-print-manager:ca) locale(kde-print-manager:ca@valencia) locale(kde-print-manager:cs) locale(kde-print-manager:da) locale(kde-print-manager:de) locale(kde-print-manager:el) locale(kde-print-manager:en_GB) locale(kde-print-manager:es) locale(kde-print-manager:et) locale(kde-print-manager:eu) locale(kde-print-manager:fi) locale(kde-print-manager:fr) locale(kde-print-manager:ga) locale(kde-print-manager:gl) locale(kde-print-manager:hu) locale(kde-print-manager:ia) locale(kde-print-manager:id) locale(kde-print-manager:is) locale(kde-print-manager:it) locale(kde-print-manager:ja) locale(kde-print-manager:ka) locale(kde-print-manager:kk) locale(kde-print-manager:km) locale(kde-print-manager:ko) locale(kde-print-manager:lt) locale(kde-print-manager:mr) locale(kde-print-manager:nb) locale(kde-print-manager:nds) locale(kde-print-manager:nl) locale(kde-print-manager:nn) locale(kde-print-manager:pa) locale(kde-print-manager:pl) locale(kde-print-manager:pt) locale(kde-print-manager:pt_BR) locale(kde-print-manager:ro) locale(kde-print-manager:ru) locale(kde-print-manager:sk) locale(kde-print-manager:sl) locale(kde-print-manager:sr) locale(kde-print-manager:sr@ijekavian) locale(kde-print-manager:sr@ijekavianlatin) locale(kde-print-manager:sr@latin) locale(kde-print-manager:sv) locale(kde-print-manager:ta) locale(kde-print-manager:tr) locale(kde-print-manager:ug) locale(kde-print-manager:uk) locale(kde-print-manager:zh_CN) locale(kde-print-manager:zh_TW)"
RDEPENDS:${PN} += "kde-print-manager"

inherit rpm
