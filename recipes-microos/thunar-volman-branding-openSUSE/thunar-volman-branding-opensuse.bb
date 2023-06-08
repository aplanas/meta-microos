SUMMARY = "openSUSE Branding of thunar-volman"
DESCRIPTION = "This package provides the openSUSE look and feel for the Thunar Volume Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "thunar-volman-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "acad90cd911607a21f61f08cec4276c153f1dc43ab519526ed5e1031cdcdfe790b9f987d54011b8aa9807381b7f24881b86814284f3dad28e432b3d19c19759e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(thunar-volman-branding-openSUSE) thunar-volman-branding thunar-volman-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
