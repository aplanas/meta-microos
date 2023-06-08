SUMMARY = "Macros for building Jupyter RPM packages"
DESCRIPTION = "This package provides macros for building packages that interface with \
Jupyter, Notebook or Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-rpm-macros-20221227-11.1.noarch.rpm"
RPM_HASH = "1aa3a73e2672e0f6bcb7c5fe46d019c77a40c688665c4e8ecb4219d2cc39c0a22268bee9042fa5c18a92fdc8f42baad9b6f3ece7656f96fce1df8d5183e19aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-rpm-macros"
RDEPENDS:${PN} += "jupyter-jupyter_core-filesystem jupyter-jupyterlab-filesystem jupyter-notebook-filesystem"

inherit rpm
