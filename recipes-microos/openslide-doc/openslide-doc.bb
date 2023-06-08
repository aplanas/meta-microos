SUMMARY = "Documentation for openslide"
DESCRIPTION = "This package contains documentation for developing with openslide library."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "openslide-doc-3.4.1-2.25.noarch.rpm"
RPM_HASH = "db9d0a534775b8f9b5941ca7ae9e1aa46ee07c60627b183863e27dd2623bbf1e8cf1cf0034cb7760beb781eb7423fa9a7170324864046b8c4dc57393ee33ec49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openslide-doc"
RDEPENDS:${PN} += ""

inherit rpm
