SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-kn-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "4f5f6208b28d2290211d1230b5b9ffd8a0bb8f91c1cfe9ec1ca0cad67e519c0db26f410be5d367ab01f17ce7555b4e098f5b6b5c36e74687963b059ba6746a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ka) \
yast2-trans-kn"
RDEPENDS:${PN} += ""

inherit rpm
