SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-gu-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "056d11600dd025d9e42842460cf563ce7e5b51f1dc9416ab95b9d39f8a36a482efccc35909b75a1ea0e9cd25218ce2356b7d4ab0f60ac9931d06001e1698a62c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:gu) yast2-trans-gu"
RDEPENDS:${PN} += ""

inherit rpm
