SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python39-nbdime-3.2.0-11.1.noarch.rpm"
RPM_HASH = "e0c15b58132ea6dff608376513da39650baf4e4156b0cf54f1e4a35cf72da8751134013673804df08faab46b66d4b4ecc5114ea0d2d34623817e24f6f5a18a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbdime) python39-jupyter_nbdime python39-nbdime python3dist(nbdime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts jupyter-nbdime python(abi) python39-GitPython python39-Jinja2 python39-Pygments python39-colorama python39-jupyter-server python39-jupyter-server-mathjax python39-nbformat python39-requests python39-tornado"

inherit rpm
