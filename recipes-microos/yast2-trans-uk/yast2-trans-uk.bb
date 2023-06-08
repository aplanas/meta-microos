SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-uk-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "fac3d0d2159d4b7be139373322e288163dcc84c607b55bb18b0dbe6387c50a762f0a01b29e4057600158fd1e46a79bc5ce2549e21438e5b1016031a722d4a3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:uk) yast2-trans-uk"
RDEPENDS:${PN} += ""

inherit rpm
