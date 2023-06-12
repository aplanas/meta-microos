SUMMARY = "Translations for package rmw"
DESCRIPTION = "Provides translations for the 'rmw' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "rmw-lang-0.9.1-1.1.noarch.rpm"
RPM_HASH = "cbfd9b5c50190604199a424d6c4b9b3b4e0116f1985423acc85a31b116c65b7e3fbe5035435c5a552ae8d6d4687cc1479d2431d515b5bf238eedddf08fbb5c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rmw:de) locale(rmw:es_MX) locale(rmw:hi) locale(rmw:nl) locale(rmw:pl) locale(rmw:pt_BR) locale(rmw:ru) locale(rmw:uk) rmw-lang rmw-lang-all"
RDEPENDS:${PN} += "rmw"

inherit rpm
