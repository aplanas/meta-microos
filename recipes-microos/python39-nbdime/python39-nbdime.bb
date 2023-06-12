SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-3.2.1-12.2.noarch.rpm"
RPM_HASH = "b39a31ddb04d92f1747c274844155626709e758fae5b42e3c487379336829f994a7f4c1ebffd0360c0830aee9e9380834defdad7602470a09a7af59f82d872d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbdime) python39-jupyter_nbdime python39-nbdime python3dist(nbdime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts jupyter-nbdime python(abi) python39-GitPython python39-Jinja2 python39-Pygments python39-colorama python39-jupyter-server python39-jupyter-server-mathjax python39-nbformat python39-requests python39-tornado"

inherit rpm
