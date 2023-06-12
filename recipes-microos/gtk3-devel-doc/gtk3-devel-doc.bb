SUMMARY = "API documentation for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the API documentation for GTK+ 3.x."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-devel-doc-3.24.38-1.1.noarch.rpm"
RPM_HASH = "4d4f67cd54c4793c0f03db0417220fda7d9a2960fed442ab4b509dd181251a3e7a234f08f2b0a50650f2e094e16dd1b7c26f09848b9a3d7960c35b1ef37ee5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
