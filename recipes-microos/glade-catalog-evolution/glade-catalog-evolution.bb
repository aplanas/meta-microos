SUMMARY = "Glade catalog for the Evolution groupware library"
DESCRIPTION = "Evolution consists of modular components (at the moment: mailer, \
calendar, and address book) that should make daily life easier. Because \
of the modular design, it is possible to plug new components into \
Evolution or embed the existing ones in other applications. \
 \
This package provides a catalog for Glade, to allow the use of Evolution \
widgets in Glade."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.1"

RPM_NAME = "glade-catalog-evolution-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "5bfbde8f434aa708131cf7796ba02b7af7b6ece1b5e699062e031ecb00228d547f3e4df272906a33c7182523a92fd6de114b13e75130114f28645021ebdbebcb"

RPROVIDES:${PN} += "glade-catalog-evolution glade-catalog-evolution(aarch-64) libgladeevolution.so()(64bit)"
RDEPENDS:${PN} += "evolution glade"

inherit rpm
