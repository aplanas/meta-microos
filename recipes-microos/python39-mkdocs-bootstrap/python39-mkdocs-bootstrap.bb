SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python39-mkdocs-bootstrap-1.1-1.8.noarch.rpm"
RPM_HASH = "39994c9b06642df8b610333999b90c63533dc12cbbbb2a1fd56d313c61a1e73a759f3e91df18df1af7a6a00244ea3329594d39e9d7d42925c2df7f0b45e8b750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mkdocs-bootstrap) \
python39-mkdocs-bootstrap \
python3dist(mkdocs-bootstrap)"
RDEPENDS:${PN} += "python(abi) \
python39-mkdocs"

inherit rpm
