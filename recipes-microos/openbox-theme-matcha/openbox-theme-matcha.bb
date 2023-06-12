SUMMARY = "Matcha openbox themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the openbox themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "openbox-theme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "7a1434a4880235fc681d5a8a834c66cd7d41493eab311a4898968a0a7f73d244cec35a95b1b80cad1f85c5236800aa59f4715e66dbc17dbe09d2bcc587b14c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openbox-theme-matcha"
RDEPENDS:${PN} += "metatheme-matcha-common \
openbox"

inherit rpm
