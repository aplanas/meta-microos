SUMMARY = "Python documentation generator"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). It was originally created for the Python documentation, and \
supports Python project documentation well, but C/C++ is likewise \
supported. \
 \
Sphinx uses reStructuredText as its markup language. Sphinx draws from \
the parsing and translating suite, the Docutils."
LICENSE = "BSD-2-Clause"

PV = "7.0.0"

RPM_NAME = "python311-Sphinx-7.0.0-1.1.noarch.rpm"
RPM_HASH = "db0ab45f21a0d8406c8d07803ad5538db76d43c1bb0816976cfc15db1e1b01853b9c521f8450a4e3abd8ff89d1214d5d0d269025c7c725d280b6fd619d2bc7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx) python311-Sphinx python3dist(sphinx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Babel python311-Jinja2 python311-Pygments python311-alabaster python311-docutils python311-imagesize python311-packaging python311-requests python311-setuptools python311-snowballstemmer python311-sphinx_rtd_theme python311-sphinxcontrib-applehelp python311-sphinxcontrib-devhelp python311-sphinxcontrib-htmlhelp python311-sphinxcontrib-jsmath python311-sphinxcontrib-qthelp python311-sphinxcontrib-serializinghtml python311-sphinxcontrib-websupport update-alternatives"

inherit rpm
