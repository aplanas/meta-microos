SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-pl-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "437d12a3ae7054674797f1a5aef25bc2f57c203337fc640adbb71d384c9e3ed4f3c4f3b440f905d0290154c0a3d9500d7a63cbf77ecceb8b77805a0bb88fbb74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:pl) yast2-trans-pl"
RDEPENDS:${PN} += ""

inherit rpm
