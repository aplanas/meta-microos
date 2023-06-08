SUMMARY = "Documentation of the OpenGL Extension to GTK"
DESCRIPTION = "This package contains additional documentation for gtkglext. \
 \
GtkGLExt is an OpenGL extension to GTK. It provides the GDK objects \
which support OpenGL rendering in GTK, and GtkWidget API add-ons to \
make GTK+ widgets OpenGL-capable."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git20110529"

RPM_NAME = "gtkglext-doc-1.2.0git20110529-8.3.aarch64.rpm"
RPM_HASH = "11a114561e797901068619e2f466b72c8389834a4a1af5d3199ea646ec7f3e88179da20b339de09391c53d839c650675109136fd6e7c253e661fb8cc6ba12ec5"

RPROVIDES:${PN} += "gtkglext-doc gtkglext-doc(aarch-64)"
RDEPENDS:${PN} += "libgtkglext-x11-1_0-0"

inherit rpm
