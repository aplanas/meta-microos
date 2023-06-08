SUMMARY = "XMLTooling schemas and catalog"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package includes XML schemas and related files."
LICENSE = "Apache-2.0"

PV = "3.2.3"

RPM_NAME = "xmltooling-schemas-3.2.3-1.4.noarch.rpm"
RPM_HASH = "25a916dcb069dfec40dd5a72274a45fe41155f5df2f2ae2b6495b3553300b8b881b76bfb9a4493b5cd57395b0ae437af70161bb69264d2b23dfc15d04449916f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmltooling-schemas"
RDEPENDS:${PN} += ""

inherit rpm
