SUMMARY = "openSUSE Branding of xfwm4"
DESCRIPTION = "This package provides the openSUSE look and feel for the xfwm4 window manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfwm4-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "f9918ddcda2cae60c64714b3fe809a0f64fc068565b8d05245cf136e4cbc48b2c20cd9cbb5fa6caaed99045d35fcd95055c8226ac5ae281e68508fce48fc7ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfwm4-branding-openSUSE) xfwm4-branding xfwm4-branding-openSUSE"
RDEPENDS:${PN} += "noto-sans-fonts"

inherit rpm
