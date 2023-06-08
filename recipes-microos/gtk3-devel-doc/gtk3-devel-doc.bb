SUMMARY = "API documentation for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the API documentation for GTK+ 3.x."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-devel-doc-3.24.37+70-1.1.noarch.rpm"
RPM_HASH = "c582d600bb8aedf1e01e1bfa105be3dacad31a2757c45392154a6708df1021369ffa3edc3b53fd793a8af726a1a97c163edc5e033a2ab760e655b500957a0e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
