SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-nn-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "71845cf778cea1a03d887ddd33d501c35b18ef4252fdd2a5eb3a2b00f0360b9d6dc892b6c22f926595da4b0c7ea3909c85eb073896cccd8588f42453c926d857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nn) yast2-trans-nn"
RDEPENDS:${PN} += ""

inherit rpm
