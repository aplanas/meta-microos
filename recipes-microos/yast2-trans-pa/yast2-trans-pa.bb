SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-pa-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "019a68a236e10a2722b7887c5322a90267259c5974a9e152ce9cc0b720bb30a23fc3502752067597bcaff622ba75632fead66cc6b893bbcfecf9ea51d38db30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pa) yast2-trans-pa"
RDEPENDS:${PN} += ""

inherit rpm
