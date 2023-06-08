SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "2.0.12"

RPM_NAME = "python-SQLAlchemy-doc-2.0.12-1.1.noarch.rpm"
RPM_HASH = "177c9856355716d0158b38f0766e72270368d3be32e34a717f798bbb0ab5ffbe3ab1b0333f7dab1d1b4481f4fa34653e5d5bbc72bb6ecfe47ed4dd32a58928fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy-doc python310-SQLAlchemy-doc python311-SQLAlchemy-doc python39-SQLAlchemy-doc"
RDEPENDS:${PN} += ""

inherit rpm
