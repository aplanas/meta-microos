SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-sv-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "2e2fd04ca0e19bb242fad601bd621ceda8e11adaf65793c4b58b2e5a35897405f105a0bd41936b4b1b4697ffef17f3d2f7fab8a17306bbfa6ed8cd9a72fdda7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sv) yast2-trans-sv"
RDEPENDS:${PN} += ""

inherit rpm
