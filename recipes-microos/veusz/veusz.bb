SUMMARY = "GUI scientific plotting package"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "veusz-3.6.2-1.1.noarch.rpm"
RPM_HASH = "497b3ada8c234ca0d3696ca62b3e7fc4012ea952a67164a99237b1a823c1204d26a4cb3eb76b2df486a583fd1371e28874f412f9be720c7a16106d2512541ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(veusz.desktop) metainfo() metainfo(veusz.appdata.xml) mimehandler(application/x-veusz) veusz veusz3"
RDEPENDS:${PN} += "/usr/bin/python3.10 desktop-file-utils python3-veusz shared-mime-info veusz-common"

inherit rpm
