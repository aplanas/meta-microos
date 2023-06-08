SUMMARY = "openSUSE Branding of xfce4-settings"
DESCRIPTION = "This package provides the openSUSE look and feel for Xfce."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-settings-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "281138aff07c6de2006443cf9082d87b598dc9f5bb86d943e0cf98df40538010ac7940146bb392fabd7cf511b4018d2c868d073594de8664aee48f025985d82a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-settings-branding-openSUSE) xfce4-settings-branding xfce4-settings-branding-openSUSE"
RDEPENDS:${PN} += "adwaita-xfce-icon-theme desktop-data-openSUSE gtk2-metatheme-adwaita gtk2-metatheme-greybird-geeko gtk3-metatheme-adwaita gtk3-metatheme-greybird-geeko hack-fonts metatheme-greybird-geeko-common noto-coloremoji-fonts noto-sans-fonts"

inherit rpm
