SUMMARY = "Label Editing and Printing Tool - Development Files"
DESCRIPTION = "Labels is a powerful tool for editing and printing all kinds of labels. \
It comes with a lot of templates of standard labels. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "glabels-devel-3.4.1-4.12.aarch64.rpm"
RPM_HASH = "3d8224763d486753ce77b35f07284b9efea4ac70f18d09436dcc845f9475623b6527eba0686be7f9ac37118a963f85b83149ad503185bfc438b34d360a5b96fd"

RPROVIDES:${PN} += "glabels-devel glabels-devel(aarch-64) pkgconfig(libglabels-3.0) pkgconfig(libglbarcode-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glabels pkgconfig(cairo) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(libxml-2.0) pkgconfig(pangocairo)"

inherit rpm
