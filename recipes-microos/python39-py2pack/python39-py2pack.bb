SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.8.7"

RPM_NAME = "python39-py2pack-0.8.7-2.3.noarch.rpm"
RPM_HASH = "5673fa888f8e2c5855b6be60820af35470c04b9d9dbfe1660a28d24bed81304b238b1c1084559b8800f42dac73b2e3fbc0fa6d0f05bced0f210a744e16da01d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py2pack) python39-py2pack python3dist(py2pack)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Jinja2 python39-metaextract python39-pbr python39-pypi-search python39-requests python39-setuptools update-alternatives"

inherit rpm
