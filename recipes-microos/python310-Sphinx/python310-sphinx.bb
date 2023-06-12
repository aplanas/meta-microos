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

PV = "7.0.1"

RPM_NAME = "python310-Sphinx-7.0.1-1.1.noarch.rpm"
RPM_HASH = "5f52f0b2950831df989563ad859c203085f1d80cc21d32aae842ca378a5f12da24ecf9fa48cb26f3abc9474d7e4fcd08270a867805d343e4c497c284663ada35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Sphinx python3.10dist(sphinx) python310-Sphinx python3dist(sphinx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Babel python310-Jinja2 python310-Pygments python310-alabaster python310-docutils python310-imagesize python310-packaging python310-requests python310-setuptools python310-snowballstemmer python310-sphinx_rtd_theme python310-sphinxcontrib-applehelp python310-sphinxcontrib-devhelp python310-sphinxcontrib-htmlhelp python310-sphinxcontrib-jsmath python310-sphinxcontrib-qthelp python310-sphinxcontrib-serializinghtml python310-sphinxcontrib-websupport update-alternatives"

inherit rpm
