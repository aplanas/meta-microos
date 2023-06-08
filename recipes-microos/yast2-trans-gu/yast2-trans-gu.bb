SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-gu-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "a68d8481568e50af9b18a33a1ac3a6119111ff4538c90afc7757a4f3c0b911179c137c47f9da2c31a30b8e4897f8dc21c8b5e3fa91b95333a444a42f6fbbfff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:gu) yast2-trans-gu"
RDEPENDS:${PN} += ""

inherit rpm
