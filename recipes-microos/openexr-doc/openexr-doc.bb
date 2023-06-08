SUMMARY = "Documentation for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "openexr-doc-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "e7b2df46590076d506d011abf1f533ac56733b76df18aecb1ecb9c380e677cc6afaecf14e7c98def43ba594cdfc4f683dbe23bb5c4150bc8dd4f4ec5e725a15b"

RPROVIDES:${PN} += "OpenEXR-doc openexr-doc openexr-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
