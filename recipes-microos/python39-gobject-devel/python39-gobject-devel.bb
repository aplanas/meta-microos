SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-devel-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "78fd33c000d6eabe54602fdcf6d466ce3f37bfe09778f96c417c92ec383107f24f201de9c8e6cbdc17762ae751748c9d47dabd63c687c9fb4c7d9499e8b8f1c3"

RPROVIDES:${PN} += "python39-gobject-devel python39-gobject-devel(aarch-64)"
RDEPENDS:${PN} += "python39-devel python39-gobject python39-gobject-Gdk python39-gobject-cairo python39-gobject-common-devel"

inherit rpm
