SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python39-nbformat-5.8.0-1.2.noarch.rpm"
RPM_HASH = "b257b0f7c6a9e55cef7977c6943c5338dde654dd2aa9270dd75533ff9548aaa91ce6677d73485950251758cddfc78fb05169a7ea16c878398831d971859e7b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbformat) python39-jupyter_nbformat python39-nbformat python3dist(nbformat)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi) python39-fastjsonschema python39-jsonschema python39-jupyter_core python39-traitlets"

inherit rpm
