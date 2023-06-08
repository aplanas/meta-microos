SUMMARY = "Gtkdoc plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "valadoc-doclet-gtkdoc-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "da10d1976acdf0721691bfc239c04f203f0fbac92b14c179e4ecce8e40729f8c5836d1c28906cded65adcb1fde31f311bfe1b618cadb61352294dd87e1580b4a"

RPROVIDES:${PN} += "libdoclet.so()(64bit) valadoc-doclet-gtkdoc valadoc-doclet-gtkdoc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libvala-0.56.so.0()(64bit) libvaladoc-0.56.so.0()(64bit)"

inherit rpm
