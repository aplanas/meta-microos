SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python311-sphinxcontrib-websupport-1.2.4-4.1.noarch.rpm"
RPM_HASH = "194cb8d86e03797604133832e38194f23544f2be442470de16eab468661db201b93f2057aa18b383d1d67109304a9aa55a838a437d77baeede022cd8a16d205c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-websupport) python311-sphinxcontrib-websupport python3dist(sphinxcontrib-websupport)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-docutils"

inherit rpm
