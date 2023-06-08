SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python310-nbdime-3.2.0-11.1.noarch.rpm"
RPM_HASH = "d847ef10a8697e9d363fe5c31af0ff928ffcf89ab1745d7121fac88a463c9182f3261a9d983d66242fe874d4f0008e8097e10a370518e7d0a3f62b7834973d53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_nbdime python3-nbdime python3.10dist(nbdime) python310-jupyter_nbdime python310-nbdime python3dist(nbdime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts jupyter-nbdime python(abi) python310-GitPython python310-Jinja2 python310-Pygments python310-colorama python310-jupyter-server python310-jupyter-server-mathjax python310-nbformat python310-requests python310-tornado"

inherit rpm
