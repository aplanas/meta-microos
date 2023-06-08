SUMMARY = "Base package on which Jupyter projects rely"
DESCRIPTION = "Core common functionality of Jupyter projects. \
 \
This package contains base application classes and configuration inherited by \
other projects. It doesn't do much on its own. \
 \
There is no reason to install this package on its own.  It will be pulled in \
as a dependency by packages that require it."
LICENSE = "BSD-3-Clause"

PV = "5.3.0"

RPM_NAME = "python311-jupyter-core-5.3.0-1.2.noarch.rpm"
RPM_HASH = "a0d25dbb044afd63c34b7dc950f44c8cbc8782f319c8b7dab0ebde8c7f1f620d54e08d76a772156126debe2a5213a9f7e8af7dbb1106ae3bf28d4869ede0d2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-core) python311-jupyter-core python311-jupyter_core python3dist(jupyter-core)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-platformdirs python311-traitlets"

inherit rpm
