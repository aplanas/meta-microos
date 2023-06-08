SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-bs-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "b9804620b30b72a836f1820a3f35239a85f66485241c0a3781856c3d2e1e8f7e5bdd496a1d16081c5dd25d305de60409970f4137502c9b0d6dea864d6fb13209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:bs) yast2-trans-bs"
RDEPENDS:${PN} += ""

inherit rpm
