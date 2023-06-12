SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-git-3.2.1-12.2.noarch.rpm"
RPM_HASH = "8e723feb682a99bccce736ba61cc0300eeda6bff7b85f1b2d2ec063a400f3e4b91a96fd825e8bca3107c62cb98f93155fdbcbead9c86c60f9fc294b830141fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter_nbdime-git python39-nbdime-git"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts git-core python39-nbdime"

inherit rpm
