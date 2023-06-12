SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "1.4.46"

RPM_NAME = "python-SQLAlchemy1-doc-1.4.46-3.1.noarch.rpm"
RPM_HASH = "37eb95db9463756b1954bdfc1ad2cb4cde9dbb26a69cb09b3430e382ea9c234289be3eba0341a356873bf27d80f53eeac88107977e06b5995be339bcca2f1ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy1-doc python310-SQLAlchemy-doc python311-SQLAlchemy-doc python39-SQLAlchemy-doc"
RDEPENDS:${PN} += ""

inherit rpm
