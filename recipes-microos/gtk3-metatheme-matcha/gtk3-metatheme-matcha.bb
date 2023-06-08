SUMMARY = "Matcha GTK+3 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK3+ themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "gtk3-metatheme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "8823c0578990c97519aa046b7bfbf41ab5337db0ea10507f8e9dae2da57419b05ef9ffda5b62e97b730a8244dd526e6dcbeb1f234d15226ad89543850aa6b5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-matcha"
RDEPENDS:${PN} += "gtk3 metatheme-matcha-common"

inherit rpm
