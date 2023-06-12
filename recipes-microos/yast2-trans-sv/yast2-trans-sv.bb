SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-sv-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "94c78941e50f49648f7418c0a931237f9e535810ce189662c612dedc56aae882574f4ed4021e4b477a9e4c078b9db418de79f50013b7a576755af72a3349de7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sv) yast2-trans-sv"
RDEPENDS:${PN} += ""

inherit rpm
