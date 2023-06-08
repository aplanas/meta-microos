SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-sk-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "684762c5f7b633d27a8cde8b62538d4adf71c319a508875e78b6ee969dc09d4f7e6ecd0c17dfe23eef3ddf052af15bd265d9dc33e4c94201058ef7082c3dcb8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sk) yast2-trans-sk"
RDEPENDS:${PN} += ""

inherit rpm
