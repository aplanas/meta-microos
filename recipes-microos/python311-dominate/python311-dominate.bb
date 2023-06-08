SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "python311-dominate-2.7.0-2.3.noarch.rpm"
RPM_HASH = "9b5491c032d3d029737687a9356bce2c167475e55c5afd17d47521f887ddb0fa3e7200f0f3bd4f2dbfed073d9c182f1247c7926fa765bed1aa2f5918a41c3af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dominate) python311-dominate python3dist(dominate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
