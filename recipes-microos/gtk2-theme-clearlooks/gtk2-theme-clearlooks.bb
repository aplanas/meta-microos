SUMMARY = "Clearlooks Theme for GTK+ 2"
DESCRIPTION = "This package provides the Clearlooks GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-clearlooks-2.20.2-19.42.noarch.rpm"
RPM_HASH = "26a9b31d56cb3675fa46dd78ffd28d79e41841ea58768cba2f6714cbbe682d1da0d6acdf8daad506561c51a82e26faef64eea86c06c01d04af573a28071f848d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-clearlooks"
RDEPENDS:${PN} += "gtk2-engine-clearlooks"

inherit rpm
