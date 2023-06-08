SUMMARY = "Translations for package libpanel"
DESCRIPTION = "Provides translations for the 'libpanel' package."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libpanel-lang-1.2.0-1.1.noarch.rpm"
RPM_HASH = "2565178883e604cb42dad99a261dbf76f7514c5b8e78ea9c2ecfee5eb60af150f5c0b3e21fcb4947353282f1af06edc9443e4c64709af8c7814faf573429e80a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpanel-lang libpanel-lang-all locale(libpanel:be) locale(libpanel:bg) locale(libpanel:ca) locale(libpanel:cs) locale(libpanel:da) locale(libpanel:de) locale(libpanel:el) locale(libpanel:es) locale(libpanel:eu) locale(libpanel:fa) locale(libpanel:fi) locale(libpanel:fr) locale(libpanel:fur) locale(libpanel:gl) locale(libpanel:he) locale(libpanel:hr) locale(libpanel:hu) locale(libpanel:id) locale(libpanel:is) locale(libpanel:it) locale(libpanel:ka) locale(libpanel:ko) locale(libpanel:lt) locale(libpanel:ne) locale(libpanel:nl) locale(libpanel:oc) locale(libpanel:pl) locale(libpanel:pt) locale(libpanel:pt_BR) locale(libpanel:ru) locale(libpanel:sl) locale(libpanel:sr) locale(libpanel:sv) locale(libpanel:tr) locale(libpanel:uk) locale(libpanel:zh_CN)"
RDEPENDS:${PN} += "libpanel"

inherit rpm
