SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-es_AR-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "39349f47a6cde39864b65d5d6b52a37431eacc5d88f0fb84021b365c24023abaf868e39979dbeed22d0c82301bc8936062b12aab1bbf8fe468e3f629c3444297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:es_AR) yast2-trans-es_AR"
RDEPENDS:${PN} += ""

inherit rpm
