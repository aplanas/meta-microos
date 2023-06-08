SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python39-cairocffi-pixbuf-1.5.1-1.1.noarch.rpm"
RPM_HASH = "19b673723c49458a42693240f27e0e0fc920b9ec167d0cdfafb10f543d0dc7c0389508e2d227ea9e9b54911ddf5d5d7ad9004db98050e1b7f4aab2a80f9087f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-cairocffi-pixbuf"
RDEPENDS:${PN} += "gdk-pixbuf python(abi) python39-cairocffi"

inherit rpm
