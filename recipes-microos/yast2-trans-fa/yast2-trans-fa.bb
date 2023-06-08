SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-fa-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "12e713714066f84d819b845f328fbab26670b2dabd20b782b3debc8458b9f6114b88948cd8b865d1afb8ccf7bce25a0ff524aa49d5842c31ad3b247eaf180792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:fa) yast2-trans-fa"
RDEPENDS:${PN} += ""

inherit rpm
