SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-zu-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "964986e38887b6534017c69a87a905c2dcec9457f4c77547ee2c5912c6b275ab3c73ae83e4daf0d0c79abbca576e2722cec075e6b74149d3b590eb45c3506913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:zu) yast2-trans-zu"
RDEPENDS:${PN} += ""

inherit rpm
