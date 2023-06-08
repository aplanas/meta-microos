SUMMARY = "openSUSE Branding of xfce4-notifyd"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Notification Daemon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-notifyd-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "976134a0781d74dd7b05506a903a33c392ea277c7e957842d0a420ca71271ea996770e6778c0a1ccb002ac830d7bccd8bedb91ebece6a726a7a1eaa85b98391e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-notifyd-branding-openSUSE) xfce4-notifyd-branding xfce4-notifyd-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
