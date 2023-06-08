SUMMARY = "Other non-Chinese tables for ibus"
DESCRIPTION = "This package contains all other non-Chinese tables for ibus e.g. CNS11643, \
Compose, Emoji, Ipx-x-sampa, Latex, Rustrad, Thai, Translit-ua, Translit, Viqr, \
Yawerty. This package contains only COPYING and Documents, Please select the \
table you want to use."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-others-1.3.13-2.3.noarch.rpm"
RPM_HASH = "b855b5e6ec4b26e72d336e41f8e1143ff90858948553ceb5536f6815d12f51c97718be34f51d74dd1ebcf2d057af4dcc28fb3fc9ac419b55602cf1dc374120af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-others"
RDEPENDS:${PN} += ""

inherit rpm
