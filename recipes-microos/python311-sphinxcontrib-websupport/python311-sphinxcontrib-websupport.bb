SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python311-sphinxcontrib-websupport-1.2.4-3.1.noarch.rpm"
RPM_HASH = "e37959a2fb2ceb0cb578a64e275b61b052e14754b056db5a0f788cfa345e18c070f7a8de9a70f0a380598f16041e9878e0213aa5adf2a2b728918e79cda02ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-websupport) python311-sphinxcontrib-websupport python3dist(sphinxcontrib-websupport)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-docutils"

inherit rpm
