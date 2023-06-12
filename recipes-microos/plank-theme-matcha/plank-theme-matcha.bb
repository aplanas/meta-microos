SUMMARY = "Matcha Plank themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the Plank themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "plank-theme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "60bbd1d0f70670e39fffc979d8c0280c3264d3dd70e43bd14002b8532022a866b2c69d604b3c999f0f3e290b7b0b920d2e920eb6015c01113e182dc7715f606c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plank-theme-matcha"
RDEPENDS:${PN} += "metatheme-matcha-common \
plank"

inherit rpm
