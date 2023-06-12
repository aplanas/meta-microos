SUMMARY = "openSUSE branding for LXDE"
DESCRIPTION = "This branding-style package sets openSUSE style improvements into LXDE. \
You should always prefer branding-openSUSE packages to branding-upstream."
LICENSE = "GPL-2.0"

PV = "12.1"

RPM_NAME = "lxde-common-branding-openSUSE-12.1-36.17.noarch.rpm"
RPM_HASH = "b6ff9939bedd9d3496783b16f7118c3c953f7cbaab227ce80caa7b941cf29557c7383cb6dbd80de52df3ef204877a0cc8b8015b2a0d5e4e5be9deb7e83dff8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(lxde-common-branding-openSUSE) \
lxde-common-branding \
lxde-common-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh \
desktop-data-openSUSE \
gtk2-metatheme-adwaita \
gtk3-metatheme-adwaita \
openbox-adwaita-ob-theme \
wallpaper-branding-openSUSE \
xkill"

inherit rpm
