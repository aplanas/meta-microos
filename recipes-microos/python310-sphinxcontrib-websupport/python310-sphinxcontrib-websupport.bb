SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python310-sphinxcontrib-websupport-1.2.4-4.1.noarch.rpm"
RPM_HASH = "74d43cdcbdf0aa4ca6eba78d4368259a79e268ae9e689a5465dc55e2d6ff8eacf8bc1bc63f2f792a118be040f2f7eed2fa4027265f0d337f3a4c245497a1271d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-websupport \
python3.10dist(sphinxcontrib-websupport) \
python310-sphinxcontrib-websupport \
python3dist(sphinxcontrib-websupport)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2 \
python310-docutils"

inherit rpm
