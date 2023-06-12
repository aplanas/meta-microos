SUMMARY = "openSUSE Branding of xfdesktop"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Desktop Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfdesktop-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "fd525c0c756f9b780bd86c5af7c69cb13384c498b205adb4fee7c64531f04ee932b034add0c738d0c90c596d5122ca6c88ae81c955f4767b50a2f0644db90991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfdesktop-branding-openSUSE) \
xfce4-desktop-branding-openSUSE \
xfdesktop-branding \
xfdesktop-branding-openSUSE"
RDEPENDS:${PN} += "desktop-data-openSUSE \
wallpaper-branding"

inherit rpm
