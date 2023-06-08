SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.8.7"

RPM_NAME = "python311-py2pack-0.8.7-2.3.noarch.rpm"
RPM_HASH = "529389df53476fac70d90fdafd9c7071b3cdebebc69fc403c1641f2f6b81f22462520d5bf36d101cc3ea264c55b8d8889a884c2f365cbfda60b34ca8fefed829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(py2pack) python311-py2pack python3dist(py2pack)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-metaextract python311-pbr python311-pypi-search python311-requests python311-setuptools update-alternatives"

inherit rpm
