SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ta-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "1d7208ecd8d985986b16c37a1a5a409ae07568f16f50e53b7bdc9c4c638f75909649502cc9668d408ae570ac94f45cb38411c6811e1909f6222d86f9e1a8bc6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ta) yast2-trans-ta"
RDEPENDS:${PN} += ""

inherit rpm
