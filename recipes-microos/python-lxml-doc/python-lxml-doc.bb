SUMMARY = "Documentation for python-lxml, an XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains documentation for lxml (HTML and PDF)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python-lxml-doc-4.9.2-7.1.noarch.rpm"
RPM_HASH = "9d10612b50f5d57033682c7ed4d8fe341c4f96f829368020f1ecaf60c1c7b523313ad7cbd9c0faf4c0bc4e5cc6446d926873618fa39ecb1071488fa71db3323f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-lxml-doc"
RDEPENDS:${PN} += ""

inherit rpm
