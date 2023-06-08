SUMMARY = "openSUSE Branding of xfce4-panel"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Panel."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-panel-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "e44fe6f674aee2162a39baa76ec0abfe6c4d86657cce6bc6bae8594a7161c5538000c63eef78ca48777fa6bb85753689518cb0277b737ee8bcd783cf85a19f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-panel-branding-openSUSE) xfce4-panel-branding xfce4-panel-branding-openSUSE"
RDEPENDS:${PN} += "xfce4-panel-plugin-whiskermenu"

inherit rpm
