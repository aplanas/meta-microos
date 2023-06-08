SUMMARY = "Documentation files for the uriparser URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This subpackage contains the documentation for uriparser."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "uriparser-doc-0.9.7-1.3.aarch64.rpm"
RPM_HASH = "7d649e80996bdda06e03502df700e3120e50c4fcecfbb0c87f19841b04625fb5b0e9fc4068ec3d8afd3c01b9342625f85b5254d1d30ac696723caae3469f4b29"

RPROVIDES:${PN} += "uriparser-doc uriparser-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
