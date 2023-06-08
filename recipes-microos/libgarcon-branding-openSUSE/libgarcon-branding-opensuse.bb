SUMMARY = "openSUSE Branding of libgarcon"
DESCRIPTION = "This package provides the openSUSE look and feel for Garcon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "libgarcon-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "dc85aba2aa9ca3ce0e509a55fecf9fb7a8c0b9672d5c1a6988bcdf850b38ce3f0dba5206b7d9dd9c1b874d4428bc505a36204c8cb37ce89241d302a882652ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libgarcon-branding-openSUSE) libgarcon-branding libgarcon-branding-openSUSE"
RDEPENDS:${PN} += "desktop-data-openSUSE libxfce4ui-tools wallpaper-branding xfce4-settings-branding-openSUSE"

inherit rpm
