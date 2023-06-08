SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python39-nbdime-git-3.2.0-11.1.noarch.rpm"
RPM_HASH = "fec9be5760f70b9078748a8b89881947b5393d2ba61158eded1e652a2f4b158baee0e9e6925398f58264b9073c91543bb8aad4f9482150b8656334f926bc60d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter_nbdime-git python39-nbdime-git"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts git-core python39-nbdime"

inherit rpm
