SUMMARY = "openSUSE Branding of xfce4-settings"
DESCRIPTION = "This package provides the openSUSE look and feel for Xfce."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-settings-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "5aaab2cf862b06196fd7139e5a81c5a31c2cc311738124e6d5c262c514d509fec518b1844b9680cdec41b235f90331215f9a472cf4b5347e5f9ad5846f4ab3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-settings-branding-openSUSE) xfce4-settings-branding xfce4-settings-branding-openSUSE"
RDEPENDS:${PN} += "adwaita-xfce-icon-theme desktop-data-openSUSE gtk2-metatheme-adwaita gtk2-metatheme-greybird-geeko gtk3-metatheme-adwaita gtk3-metatheme-greybird-geeko hack-fonts metatheme-greybird-geeko-common noto-coloremoji-fonts noto-sans-fonts"

inherit rpm
