SUMMARY = "openSUSE Branding of xfce4-power-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Power Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-power-manager-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "978d50e39eeab8ede0ec0d23920a335573144e176617b9253cd224bde007575f6b705a2a448481043cf584da390bc9948b2107bcb69aaafd94ecf17a1f63b2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-power-manager-branding-openSUSE) xfce4-power-manager-branding xfce4-power-manager-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
