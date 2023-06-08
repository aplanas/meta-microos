SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-sr-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "351b51e17dca7ce90de0f037c763f151cd278b957c91ad9bf50db229c9b3b505d0dcb2730635688051495ee84cf33726470a891c4a2074e9216d6d1da5c70de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sr) yast2-trans-sr"
RDEPENDS:${PN} += ""

inherit rpm
