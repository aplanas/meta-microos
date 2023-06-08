SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-nds-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "70506e9e03e41c4355e43fb6aeddc196f0dc4a0a1c36b2d3fb5cfa465f45f5ae718106c6b980e264ac438dd0af54009d6e2320003d8706b0b9710d354504ae23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nds) yast2-trans-nds"
RDEPENDS:${PN} += ""

inherit rpm
