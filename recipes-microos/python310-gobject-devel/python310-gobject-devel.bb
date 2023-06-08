SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-devel-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "67002263cced52045042f7d42a9e3a959c0153b2db2787073d26a8a6f52703d66e89f2aa731e0d5f512ad6bf188947d7ed903af2901406e5e14d40d85a286f8c"

RPROVIDES:${PN} += "python3-gobject-devel python310-gobject-devel python310-gobject-devel(aarch-64)"
RDEPENDS:${PN} += "python310-devel python310-gobject python310-gobject-Gdk python310-gobject-cairo python310-gobject-common-devel"

inherit rpm
