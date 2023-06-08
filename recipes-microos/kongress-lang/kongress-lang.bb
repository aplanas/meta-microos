SUMMARY = "Translations for package kongress"
DESCRIPTION = "Provides translations for the 'kongress' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "kongress-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e3d7a6571e8e4af2246f7454ff4baf3c9df1dd48bbe306c82f165f89b3deec98419000e669834415106944e10d694c89260c590fa6c3e75bd7868db073294d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kongress-lang kongress-lang-all locale(kongress:ca) locale(kongress:ca@valencia) locale(kongress:cs) locale(kongress:da) locale(kongress:de) locale(kongress:el) locale(kongress:en_GB) locale(kongress:es) locale(kongress:et) locale(kongress:fi) locale(kongress:fr) locale(kongress:gl) locale(kongress:ia) locale(kongress:it) locale(kongress:ja) locale(kongress:ka) locale(kongress:ko) locale(kongress:lt) locale(kongress:nl) locale(kongress:nn) locale(kongress:pa) locale(kongress:pl) locale(kongress:pt) locale(kongress:pt_BR) locale(kongress:ro) locale(kongress:ru) locale(kongress:sk) locale(kongress:sl) locale(kongress:sv) locale(kongress:tr) locale(kongress:uk) locale(kongress:zh_CN) locale(kongress:zh_TW)"
RDEPENDS:${PN} += "kongress"

inherit rpm
