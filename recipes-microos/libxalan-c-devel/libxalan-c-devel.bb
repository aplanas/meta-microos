SUMMARY = "An XSLT Transformation Engine in C++ - Development Files"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and a robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). \
 \
This package contains files needed for development with Xalanc"
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "libxalan-c-devel-1.12-1.11.aarch64.rpm"
RPM_HASH = "75cc5b1b37d2e23c1b1e08ddd8544300be6473be453a032bbb972282aff351177a4c0a913e81f3dd5c6c4f5dbe23b5373fbbc63d5c20314c3a074f98e1bfa005"

RPROVIDES:${PN} += "Xalan-c-devel \
cmake(XalanC) \
libXalan-c-devel \
libxalan-c-devel \
libxalan-c-devel(aarch-64) \
pkgconfig(xalan-c)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxalan-c112"

inherit rpm
