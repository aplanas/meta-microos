SUMMARY = "OpenSAML development Headers"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package includes files needed for development with OpenSAML."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "libsaml-devel-3.2.1-1.11.aarch64.rpm"
RPM_HASH = "db65d9c89c21087d3fd26280b73b5dfdd7d2a64ead15aac18d3c819f10105c6d4f493c87229b19703c7d956e2954a99c8f31227dfc941232b3e6c4f1635a480c"

RPROVIDES:${PN} += "libsaml-devel libsaml-devel(aarch-64) opensaml-devel pkgconfig(opensaml)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblog4shib-devel libsaml12 libxerces-c-devel libxml-security-c-devel libxmltooling-devel pkgconfig(log4shib) pkgconfig(xerces-c) pkgconfig(xml-security-c) pkgconfig(xmltooling)"

inherit rpm
