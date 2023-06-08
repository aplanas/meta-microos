SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "python310-dominate-2.7.0-2.3.noarch.rpm"
RPM_HASH = "ac123971d49db5eeb342d318db9407d0d2d3824d73c18a9a43f3c77f95ca4d7282257fa30b7acfd67d6b054b9e4a74e27f55b03ae967bd79f2d0d6730db88c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dominate python3.10dist(dominate) python310-dominate python3dist(dominate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
