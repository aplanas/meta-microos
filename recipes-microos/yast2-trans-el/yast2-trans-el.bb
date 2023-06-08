SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-el-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "318a0bbb48179998f4393e3e8e5cfdbe0af270f7b663d7eb795d66be8a94d2bb8ce155345c5d2b4e2bbd5dcfd75ef271cf45b4e2db7abce7b97e8627b44626f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:el) yast2-trans-el"
RDEPENDS:${PN} += ""

inherit rpm
