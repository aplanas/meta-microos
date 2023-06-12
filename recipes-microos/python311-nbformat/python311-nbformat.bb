SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python311-nbformat-5.8.0-1.2.noarch.rpm"
RPM_HASH = "0483cfc0d9ed0a40f27a571eb13804057e4f77cb687fc542a8b45be55a8a3ed9c3aa7002b84b2826b87fef683eac3d4e98cb93c8ddc28defc899469ad6e4b639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbformat) python311-jupyter_nbformat python311-nbformat python3dist(nbformat)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-fastjsonschema python311-jsonschema python311-jupyter_core python311-traitlets"

inherit rpm
