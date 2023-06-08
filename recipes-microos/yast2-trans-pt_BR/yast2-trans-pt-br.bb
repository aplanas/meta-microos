SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "98a8713e573b1900761508a2a7177349472213246cd20dccc4bea421c0cc0c802e30a49aca84a7f6c9d5b05faeb4806344d7896116b9ec4d56aa6583de439829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pt_BR) yast2-trans-pt_BR"
RDEPENDS:${PN} += ""

inherit rpm
