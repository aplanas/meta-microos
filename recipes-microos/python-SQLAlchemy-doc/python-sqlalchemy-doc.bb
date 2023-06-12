SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python-SQLAlchemy-doc-2.0.15-1.1.noarch.rpm"
RPM_HASH = "cf29908145e7baa962c7d4eb755bb7979aeb148fac603f861cf184097ebd6eec169d6741ab5660dcec58569c01fa8fa51f617eb1946215b459af15666a7c88d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy-doc python310-SQLAlchemy-doc python311-SQLAlchemy-doc python39-SQLAlchemy-doc"
RDEPENDS:${PN} += ""

inherit rpm
