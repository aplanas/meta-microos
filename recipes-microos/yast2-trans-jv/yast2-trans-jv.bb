SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-jv-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "547ea5cb8cbbbae2be487570bb55ae4dfcc2425a22abb5b8669ccfd3745ed03a33b464b841ead10718643fa44a77f0b3bc50f48fbafbb3af2001a2653d52e092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:jv) yast2-trans-jv"
RDEPENDS:${PN} += ""

inherit rpm
