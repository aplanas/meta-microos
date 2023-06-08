SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python311-lxml-devel-4.9.2-7.1.aarch64.rpm"
RPM_HASH = "5c37be75c738e817b45ee22aa103f403d2fa8f29768022a4b7ff9e8748d69b12dd37a7a0947a8e1e54775bb62eb6aeec7734f9c7c4120f24ce1ae2dca8616b07"

RPROVIDES:${PN} += "python311-lxml-devel python311-lxml-devel(aarch-64)"
RDEPENDS:${PN} += "python311-lxml"

inherit rpm
