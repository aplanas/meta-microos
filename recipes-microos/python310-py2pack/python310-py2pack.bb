SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.8.7"

RPM_NAME = "python310-py2pack-0.8.7-2.3.noarch.rpm"
RPM_HASH = "92c14eb6fd92f199871baf5b44c7b8e3f85e40e04e6e1d82d9a417f3e8bc6777a1d449e73e34fb56e5682dca96a2fff5a4f381c9242c6b70e75ebeaf89cec36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py2pack python3.10dist(py2pack) python310-py2pack python3dist(py2pack)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Jinja2 python310-metaextract python310-pbr python310-pypi-search python310-requests python310-setuptools update-alternatives"

inherit rpm
