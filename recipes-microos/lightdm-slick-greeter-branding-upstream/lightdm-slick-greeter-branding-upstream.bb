SUMMARY = "Upstream branding of lightdm-slick-greeter"
DESCRIPTION = "This package provides the upstream look and feel for \
lightdm-slick-greeter."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "lightdm-slick-greeter-branding-upstream-1.6.1-1.3.noarch.rpm"
RPM_HASH = "a17f2c195fee7fb5a3aff762dcee70680d780d50d0dbbde59810c55ee7338238de25036fdf2b736b5da9776d9d4b03d7507cffe9054363a44af5d39860f8ddee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-slick-greeter-branding \
lightdm-slick-greeter-branding-upstream"
RDEPENDS:${PN} += "gnome-icon-theme \
gtk3-metatheme-adwaita \
lightdm-slick-greeter \
ubuntu-fonts"

inherit rpm
