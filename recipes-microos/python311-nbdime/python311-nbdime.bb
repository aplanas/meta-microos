SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python311-nbdime-3.2.0-11.1.noarch.rpm"
RPM_HASH = "896b780293b7b241b74c8bf4afb8fa4b60653d49906bc20f66b3a2c246e94ec06d51d1be2f6f34f1305ced2fcbe093cbc058242f6a881328b91999fa495d15e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbdime) python311-jupyter_nbdime python311-nbdime python3dist(nbdime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts jupyter-nbdime python(abi) python311-GitPython python311-Jinja2 python311-Pygments python311-colorama python311-jupyter-server python311-jupyter-server-mathjax python311-nbformat python311-requests python311-tornado"

inherit rpm
