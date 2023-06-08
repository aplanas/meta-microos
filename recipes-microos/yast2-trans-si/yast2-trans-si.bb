SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-si-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "32a9b71cba04ba3e2141a6d63569c5dd43963f218957cc101961b0e45d2ee1e83c723c0aa79442c34ca8b147e46a7ed37dd5b977315e471cef97cba748f51236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:si) yast2-trans-si"
RDEPENDS:${PN} += ""

inherit rpm
