SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python310-py2pack-0.9.0-1.1.noarch.rpm"
RPM_HASH = "0d9ea87dfef4cbb7ae34ca55d623bc1e778ab5565cd9de6e2375180918d86ee1c53a1fc238790c1b891f2ca7525d21030374c9cc1d61bedbccf52b4eee3d64af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py2pack \
python3.10dist(py2pack) \
python310-py2pack \
python3dist(py2pack)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-metaextract \
python310-pbr \
python310-pypi-search \
python310-requests \
python310-setuptools \
update-alternatives"

inherit rpm
