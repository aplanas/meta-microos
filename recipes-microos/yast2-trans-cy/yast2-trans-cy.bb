SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-cy-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "b038ec248205c8a03b79d9a1e55e0c67be148bbf0a8ffa087ac0875d5c8183837e178db5b560d3cec956f81f21a5a020bb9ee592a82b74b333a0ddb67647790f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:cy) yast2-trans-cy"
RDEPENDS:${PN} += ""

inherit rpm
