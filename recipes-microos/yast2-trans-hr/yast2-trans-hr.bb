SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-hr-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "e9237d7ffba08f95038aed6a31becacd1f622e21e39eda177806e270f915fb45db04b01995008611cb49adb15d40495adc73f31cc0637020869834ba69532be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:hr) yast2-trans-hr"
RDEPENDS:${PN} += ""

inherit rpm
