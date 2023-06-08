SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-wa-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "37c8e721b4fe730947b723bef799b9985f78995c30b53702005e4732831adfd28668779087b28dc7b7927c6ad1a6ed10eae4ed96b08ea73ca74f5e651e0abedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:wa) yast2-trans-wa"
RDEPENDS:${PN} += ""

inherit rpm
