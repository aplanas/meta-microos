SUMMARY = "Translation of man pages in Danish"
DESCRIPTION = "This package provides translations of man pages in Danish."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-da-4.18.1-1.1.noarch.rpm"
RPM_HASH = "49280e2789e9eb1617737ce2c6c04b1914d52cb778612458405e1b4287865290079c2cd5b240913331de27439909760022480358d1a2f4a7c348b9a0d55ff07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:da) man-pages-da"
RDEPENDS:${PN} += "man-pages"

inherit rpm
