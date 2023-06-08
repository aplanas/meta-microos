SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python310-nbformat-5.8.0-1.1.noarch.rpm"
RPM_HASH = "03ec49da80e58572a141a807323b067162a41d8bc8cba8be1737a6de47a7c4ba225674580cedf882e2156850df25e9ecbb6ab2ec14ba83abc266632286a2bd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_nbformat python3-nbformat python3.10dist(nbformat) python310-jupyter_nbformat python310-nbformat python3dist(nbformat)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-fastjsonschema python310-jsonschema python310-jupyter_core python310-traitlets"

inherit rpm
