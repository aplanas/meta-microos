SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python310-nbdime-hg-3.2.0-11.1.noarch.rpm"
RPM_HASH = "7a91f7f31dd1c95120eceba142044a263a492c0dd89ace8edf2dc6ef401a3b3fd20e56cb8de81e5646d38e1ead820d20aec6f7a13f5201388096d2f87d241894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-hg python3-jupyter_nbdime-hg python3-nbdime-hg python310-jupyter_nbdime-hg python310-nbdime-hg"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts mercurial python310-nbdime"

inherit rpm
