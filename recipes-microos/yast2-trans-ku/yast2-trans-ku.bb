SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ku-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "d04f35a7c3661a74b317c3412643af6cd5615f500587e2888d443354b74e3461573bce4a21f06592b854bbabfc10e81d6cb4b9b688b0e6e6e61b4b8c0e37536f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ku) yast2-trans-ku"
RDEPENDS:${PN} += ""

inherit rpm
