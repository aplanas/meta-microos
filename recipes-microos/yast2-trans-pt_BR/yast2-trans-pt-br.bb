SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "71ed8d85b934634081584102573324246f1e238da147a698e4e9808beca5d67684e49d6ca0572760c397bb91eb5c435f3c281a648d7dee3ef58481e927fe3f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pt_BR) \
yast2-trans-pt_BR"
RDEPENDS:${PN} += ""

inherit rpm
