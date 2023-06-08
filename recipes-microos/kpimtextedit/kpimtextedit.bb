SUMMARY = "KDE PIM Libraries: Text edit functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications, in \
particular those related to editing text, like email messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kpimtextedit-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "98be2597b52246cf1a395d3222ae534c25a5154ed231a026207d459fd3319053da00eaf17f6354e695fd15274727697da06255ca0fd099ac9b2e486882a31cc4"

RPROVIDES:${PN} += "kpimtextedit kpimtextedit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
