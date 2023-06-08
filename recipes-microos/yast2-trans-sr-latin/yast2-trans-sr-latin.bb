SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "e356e883ae40d471a824913ace99463f297a3d93954590a776c2e11ecc37d7b9e1782fdb5624e82e77613ceac30434d5d846b19377cfbe3ca6ca8ba882540c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sr@latin) yast2-trans-sr-latin"
RDEPENDS:${PN} += ""

inherit rpm
