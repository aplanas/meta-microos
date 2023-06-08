SUMMARY = "Upstream Branding of xfce4-power-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Power Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfce4-power-manager-branding-upstream-4.18.1-1.3.noarch.rpm"
RPM_HASH = "76851ebcc41c4df61698792d08fb99a14c118383b4b0253286014e87a1a64f83ade16ab7d0645c6bd53a4e1bec9d418a2563a780ee43d3adbc70a721acb38b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-power-manager-branding-upstream) xfce4-power-manager-branding xfce4-power-manager-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
