SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.8.0"

RPM_NAME = "python311-dominate-2.8.0-1.1.noarch.rpm"
RPM_HASH = "623620034059c81d4d6a7e594cbfc332f71122415c15a130451433b143e341b3433a043182fbdb313d8648fc58786559175d6b82047fe4136067640c3d8e41cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dominate) python311-dominate python3dist(dominate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
