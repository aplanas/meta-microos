SUMMARY = "Translations for package openconnect"
DESCRIPTION = "Provides translations for the 'openconnect' package."
LICENSE = "LGPL-2.1-or-later"

PV = "9.10"

RPM_NAME = "openconnect-lang-9.10-1.1.noarch.rpm"
RPM_HASH = "18fde3d88391f8b62ac98ecfaaa7a62b872831bc001094e93ad59669d2c8f8d3c4869e6d5972d05d10fd515ecac301f8b501d09db8b6e460e0e382103e5727da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(openconnect:ar) locale(openconnect:bs) locale(openconnect:ca) locale(openconnect:cs) locale(openconnect:da) locale(openconnect:de) locale(openconnect:el) locale(openconnect:en_GB) locale(openconnect:en_US) locale(openconnect:es) locale(openconnect:eu) locale(openconnect:fi) locale(openconnect:fr) locale(openconnect:gl) locale(openconnect:hr) locale(openconnect:hu) locale(openconnect:id) locale(openconnect:it) locale(openconnect:ka) locale(openconnect:lt) locale(openconnect:nl) locale(openconnect:pa) locale(openconnect:pl) locale(openconnect:pt) locale(openconnect:pt_BR) locale(openconnect:sk) locale(openconnect:sl) locale(openconnect:sr) locale(openconnect:sr@latin) locale(openconnect:sv) locale(openconnect:tr) locale(openconnect:ug) locale(openconnect:uk) locale(openconnect:zh_CN) locale(openconnect:zh_TW) openconnect-lang openconnect-lang-all"
RDEPENDS:${PN} += "openconnect"

inherit rpm
