SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-id-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "978844dd78cd6716b1af70328aff0841c535be31dd4a8297ae0101979047ee62137cef0be4f1f2c10050207b3d1fd9bf7775d8052d1a667ff06aff37eaf38624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:id) yast2-trans-id"
RDEPENDS:${PN} += ""

inherit rpm
