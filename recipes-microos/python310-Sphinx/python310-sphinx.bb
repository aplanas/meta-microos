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

RPM_NAME = "python310-Sphinx-7.0.0-1.1.noarch.rpm"
RPM_HASH = "eb04fd6e7041857caf21de3e96034e53cac747ecf9538761b6239050cf7248013504337aac087eec3d34a775beeec903ae73a5d05da264824df4ff7c77b9a009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Sphinx python3.10dist(sphinx) python310-Sphinx python3dist(sphinx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Babel python310-Jinja2 python310-Pygments python310-alabaster python310-docutils python310-imagesize python310-packaging python310-requests python310-setuptools python310-snowballstemmer python310-sphinx_rtd_theme python310-sphinxcontrib-applehelp python310-sphinxcontrib-devhelp python310-sphinxcontrib-htmlhelp python310-sphinxcontrib-jsmath python310-sphinxcontrib-qthelp python310-sphinxcontrib-serializinghtml python310-sphinxcontrib-websupport update-alternatives"

inherit rpm
