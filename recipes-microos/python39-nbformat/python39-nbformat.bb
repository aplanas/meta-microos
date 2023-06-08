SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python39-nbformat-5.8.0-1.1.noarch.rpm"
RPM_HASH = "c39e149943882094ba64d0d1cd93780bcc21a7525ffd5717535730b7079df5c5dae2993cf38cdfc902b8e52c96115877c2debd818fdd47fbfc8a720947e79b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbformat) python39-jupyter_nbformat python39-nbformat python3dist(nbformat)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi) python39-fastjsonschema python39-jsonschema python39-jupyter_core python39-traitlets"

inherit rpm
