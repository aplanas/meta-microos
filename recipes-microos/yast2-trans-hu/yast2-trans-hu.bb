SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-hu-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "5429db2f237a04b6e4e26138a0f8283a343803a17fbc7c312d26b1398c054024afb1e0acf86033e39f39237054c340e5439e6f9e95b4366828d06ba5ed647d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:hu) yast2-trans-hu"
RDEPENDS:${PN} += ""

inherit rpm
