SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "b0a4904112e228559f93b98e1d4857d80b4ff8f6c3d019f484e57a138927eeaf067227046114b506e42d6527221009a2b8aad409ddae2715f1dcad2448606651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sr@latin) yast2-trans-sr-latin"
RDEPENDS:${PN} += ""

inherit rpm
