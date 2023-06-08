SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python310-nbdime-git-3.2.0-11.1.noarch.rpm"
RPM_HASH = "132533173763e56b9be173a6144e500cc343329d68f9b15c5cbe640dd644046bfb4d7465695338a525756eb61c03d0c03addc42f8f4def2dcd21f3bfe763be24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-git python3-jupyter_nbdime-git python3-nbdime-git python310-jupyter_nbdime-git python310-nbdime-git"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts git-core python310-nbdime"

inherit rpm
