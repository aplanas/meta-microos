SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-de-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "874d7d04ccefc64524aa47cfd1e3c50d2222ed098aca3c6eed3b4265acc9cf195a03db73e341ef64a9b23e48d37a093ed1759165244d488bcd08db5aeb2a19cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:de) yast2-trans-de"
RDEPENDS:${PN} += ""

inherit rpm
