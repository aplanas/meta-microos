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

RPM_NAME = "python39-Sphinx-7.0.0-1.1.noarch.rpm"
RPM_HASH = "ad24643f38f0264d0c2e80d6f5f8a9b3dc9b625b40e56c332651eba07a8c494abb08a621862142d503e35c0febb3502ffe4147784acc45c27bda35d5e508b81c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx) python39-Sphinx python3dist(sphinx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Babel python39-Jinja2 python39-Pygments python39-alabaster python39-docutils python39-imagesize python39-importlib-metadata python39-packaging python39-requests python39-setuptools python39-snowballstemmer python39-sphinx_rtd_theme python39-sphinxcontrib-applehelp python39-sphinxcontrib-devhelp python39-sphinxcontrib-htmlhelp python39-sphinxcontrib-jsmath python39-sphinxcontrib-qthelp python39-sphinxcontrib-serializinghtml python39-sphinxcontrib-websupport update-alternatives"

inherit rpm
