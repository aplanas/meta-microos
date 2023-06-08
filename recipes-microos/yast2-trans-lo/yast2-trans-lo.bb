SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-lo-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "cbc1d293312fad006400761d00d8ec5fe16e6a56d2ea17d2f1361e89578e3eb4abeba578f6d3e2800f95078da5d36a9560a91bf8933b6f77703ca99a5023e1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:lo) yast2-trans-lo"
RDEPENDS:${PN} += ""

inherit rpm
