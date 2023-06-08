SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "sphinxcontrib-webuspport provides a Python API to integrate Sphinx \
documentation into your Web application."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python39-sphinxcontrib-websupport-1.2.4-3.1.noarch.rpm"
RPM_HASH = "f65da926c0080be7b64439aace3ba2648e398bf5712adc126dd0f759017826e9f39ac755a6b9f1d667b4691615c4778f81e500dc4798be435ebc51568e749c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-websupport) python39-sphinxcontrib-websupport python3dist(sphinxcontrib-websupport)"
RDEPENDS:${PN} += "python(abi) python39-Jinja2 python39-docutils"

inherit rpm
