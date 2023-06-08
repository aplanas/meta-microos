SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "1.4.46"

RPM_NAME = "python-SQLAlchemy1-doc-1.4.46-2.1.noarch.rpm"
RPM_HASH = "4081fd0d10361ae5d25ef6f4b2a78d9483f4851ff177104745b81288b7f41bc76d79a791b1712680af168b19e680064c5de7ca62bb90be416097968aec0d6259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy1-doc python310-SQLAlchemy-doc python311-SQLAlchemy-doc python39-SQLAlchemy-doc"
RDEPENDS:${PN} += ""

inherit rpm
