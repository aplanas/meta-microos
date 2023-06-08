SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ast-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "619ff0ccb1e9fde2c5f969dff616a469bbe469567aa6c0e10af27dd2a228c64691121bfe7bd0bb51a01feb7e8087267efc111171748eb2b790d758d9f82dd60a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ast) yast2-trans-ast"
RDEPENDS:${PN} += ""

inherit rpm
