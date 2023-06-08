SUMMARY = "openSUSE Branding of xfdesktop"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Desktop Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfdesktop-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "b2965d8a55adec6b68d3a7b317f4ef6a6aa7ff14b74fee3a68ea5d4da5cf95fad741db70dfcf716daf90bff199363f3e178e5a69be831d2b53cbe9be28f8a117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfdesktop-branding-openSUSE) xfce4-desktop-branding-openSUSE xfdesktop-branding xfdesktop-branding-openSUSE"
RDEPENDS:${PN} += "desktop-data-openSUSE wallpaper-branding"

inherit rpm
