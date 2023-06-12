SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-eo-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "6296430253a5d19bbd9d645ed630c035824dc09ebbc4f94a8cce50456cdca50a031d6833b2d47b112ddd77792022b8e70c8b5946a87e270ff25eb144d6e10f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:eo) yast2-trans-eo"
RDEPENDS:${PN} += ""

inherit rpm
