SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python310-sphinxcontrib-websupport-1.2.4-3.1.noarch.rpm"
RPM_HASH = "51538482a0e6306d231af2e48b98b174eda734881f1f3f58842180bc9d93105d130db25afbd27907e2955647220420f10859682805d4d7b46fa7333f00f5826a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-websupport python3.10dist(sphinxcontrib-websupport) python310-sphinxcontrib-websupport python3dist(sphinxcontrib-websupport)"
RDEPENDS:${PN} += "python(abi) python310-Jinja2 python310-docutils"

inherit rpm
