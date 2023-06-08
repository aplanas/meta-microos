SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-lv-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "36084d943f95bfcdef6425ef541195b2bb9a2f88054d7367c1a84a6d41b219b28c512eff07cfcfb13a1b82dcd0bf04be76d43a7a044b12a735c763cb40fb2ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:lv) yast2-trans-lv"
RDEPENDS:${PN} += ""

inherit rpm
