SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-da-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "45c71d32f5ebffdfbcfca827998031204e58f06aa048de9475305e9fedc853f73da76be8699d4ba470e6d8d600220a8d05bcca771f0fd6911b1bc9c5b194e482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:da) yast2-trans-da"
RDEPENDS:${PN} += ""

inherit rpm
