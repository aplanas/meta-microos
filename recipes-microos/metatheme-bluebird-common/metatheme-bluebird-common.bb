SUMMARY = "A Clean Minimalistic Theme for GNOME, XFCE, GTK+ 2 and 3 -- Common Files"
DESCRIPTION = "The Bluebird theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral blue-ish look that will be more pleasant to look at in everyday use. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes as well as background images."
LICENSE = "GPL-2.0-or-later | CC-BY-SA-3.0"

PV = "1.3"

RPM_NAME = "metatheme-bluebird-common-1.3-2.9.noarch.rpm"
RPM_HASH = "24eb886ae1179904cc234c897c23c2be548571fdcc54d095ddc92319eb6d023ec01b3ab97f9fb179a05e0309b0855577e610c3c5c46e0960c32d6d26c2023a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-bluebird-common"
RDEPENDS:${PN} += ""

inherit rpm
