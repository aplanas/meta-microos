SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "8cf12bd74b7efa86849642df942592a622c3039b7333bae085cd05abc5e712eacc906f90a446032f225c88219ed8b2237eb7a638da691140091c244a17062f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:zh_CN) yast2-trans-zh_CN"
RDEPENDS:${PN} += ""

inherit rpm
