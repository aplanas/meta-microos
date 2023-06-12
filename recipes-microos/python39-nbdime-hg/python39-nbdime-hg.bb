SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-hg-3.2.1-12.2.noarch.rpm"
RPM_HASH = "d568d827e23d1f91688453b4ba264c81c61a9bb04ee2c1d7048191eb981e107b55f16cf5bb6843530990da338546ee8039462953ffac64e30ad4367b130ddd7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter_nbdime-hg \
python39-nbdime-hg"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
mercurial \
python39-nbdime"

inherit rpm
