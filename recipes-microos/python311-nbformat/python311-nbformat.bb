SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python311-nbformat-5.8.0-1.1.noarch.rpm"
RPM_HASH = "558676816b9528f455de260973507ce0c8c96b1cc44ef05a9b4d175f55097654e5d1f25ca0569913758e114a274415f3fbe5fdb7f23772569c1dac45b48e2aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbformat) python311-jupyter_nbformat python311-nbformat python3dist(nbformat)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-fastjsonschema python311-jsonschema python311-jupyter_core python311-traitlets"

inherit rpm
