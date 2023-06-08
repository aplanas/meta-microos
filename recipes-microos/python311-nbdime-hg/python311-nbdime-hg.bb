SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python311-nbdime-hg-3.2.0-11.1.noarch.rpm"
RPM_HASH = "fdec4888c3a5c56276d35ce610d17757a032acd017c7bf7ef9be09ef1e2d1f6df216130c8084c402a85e4e10410ca692084d96dd3815cc51478a59e020901a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyter_nbdime-hg python311-nbdime-hg"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts mercurial python311-nbdime"

inherit rpm
