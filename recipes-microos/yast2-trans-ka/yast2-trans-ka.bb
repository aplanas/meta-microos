SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ka-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "b066bc51936e20184078de100c145b024ca769bf17c3677e44ace97003310e1e02681e79170f5222ae23b5b40b2c6e3a9260bebea5550944d2970e305e2652b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ka) yast2-trans-ka"
RDEPENDS:${PN} += ""

inherit rpm
