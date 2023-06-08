SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python39-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python39-waitress-doc-2.1.2-4.1.noarch.rpm"
RPM_HASH = "7ed0f17ba52506bafa66c2d90b7a0d51b100529c1656f3a3258da86d1e2f6cc08e63a1696d1d899430791b43f193ebf6ac4cff55502e383a75918a8033eb77b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-waitress-doc"
RDEPENDS:${PN} += ""

inherit rpm
