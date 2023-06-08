SUMMARY = "Translations for package makeinfo"
DESCRIPTION = "Provides translations for the 'makeinfo' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "makeinfo-lang-7.0.3-1.1.noarch.rpm"
RPM_HASH = "52ac08b2d5e24c441e4bcd1f40d651506ea6f534213a9fbbd3fb4d3fd9d5e567b6df1782aac4b01ca5dabe26268f975b9079d25fd8b81df03fe23c14ead7d3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(makeinfo:ca) locale(makeinfo:cs) locale(makeinfo:de) locale(makeinfo:eo) locale(makeinfo:es) locale(makeinfo:fi) locale(makeinfo:fr) locale(makeinfo:hr) locale(makeinfo:hu) locale(makeinfo:it) locale(makeinfo:nl) locale(makeinfo:pl) locale(makeinfo:pt) locale(makeinfo:pt_BR) locale(makeinfo:ro) locale(makeinfo:sk) locale(makeinfo:sr) locale(makeinfo:sv) locale(makeinfo:uk) makeinfo-lang makeinfo-lang-all"
RDEPENDS:${PN} += "makeinfo"

inherit rpm
