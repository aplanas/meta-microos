SUMMARY = "openSUSE Branding of xfce4-power-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Power Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-power-manager-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "1929e63971447203878973cf58a00fd6a00bb1c1402f40bf05bbb30e4cc33f09bb20aa2a802abe71c43762a5b7ea192ae5afffeb718834be51da634bdaffdf5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-power-manager-branding-openSUSE) xfce4-power-manager-branding xfce4-power-manager-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
