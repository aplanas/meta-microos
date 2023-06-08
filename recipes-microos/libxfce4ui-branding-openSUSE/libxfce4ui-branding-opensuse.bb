SUMMARY = "openSUSE Branding of libxfce4ui"
DESCRIPTION = "This package provides the openSUSE look and feel for the libxfce4ui library."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "libxfce4ui-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "26fe60181ec2e1e2204e0fbcc417f8d09caa57ea62f350dd925a29a3d95d7264ca4658b86e88a66d432a853a0cc05951c5be01e1972a13baf0aa789501fc7c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libxfce4ui-branding-openSUSE) libxfce4ui-branding libxfce4ui-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
