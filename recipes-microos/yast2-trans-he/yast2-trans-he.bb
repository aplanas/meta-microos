SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-he-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "51faed30be5fa529c77167e08efebf6e56a931b6b5d2872dcc73a6c44ac2ce763084963cb6715a78e965660487ed2b977b9c865967e458ba52fdc1d18daf9730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:he) yast2-trans-he"
RDEPENDS:${PN} += ""

inherit rpm
