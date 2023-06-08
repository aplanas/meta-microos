SUMMARY = "Translations for package rmw"
DESCRIPTION = "Provides translations for the 'rmw' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "rmw-lang-0.9.0-1.3.noarch.rpm"
RPM_HASH = "401e8b6111b99c745a2be0c116a5569b96849ab951e4ce9988e1c9ffdbcc056fd8bb68e5ed174af5168676dbe53a28f962c4663d8e3f94c49ee08dec65934a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rmw:de) locale(rmw:es_MX) locale(rmw:hi) locale(rmw:nl) locale(rmw:pl) locale(rmw:pt_BR) locale(rmw:ru) locale(rmw:uk) rmw-lang rmw-lang-all"
RDEPENDS:${PN} += "rmw"

inherit rpm
