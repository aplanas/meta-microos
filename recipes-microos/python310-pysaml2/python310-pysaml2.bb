SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "python310-pysaml2-7.2.1-2.4.aarch64.rpm"
RPM_HASH = "cd5d29d31a86efb12fa426245f10b04b927baf32d8ae134297f7be679b8be12beefdea3f4344ab13d81ae34697f183c4c71a6f9461327159e5c70131b0ab5271"

RPROVIDES:${PN} += "python3-pysaml2 python3.10dist(pysaml2) python310-pysaml2 python310-pysaml2(aarch-64) python3dist(pysaml2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Paste python310-cryptography python310-defusedxml python310-importlib-resources python310-pyOpenSSL python310-python-dateutil python310-pytz python310-repoze.who python310-requests python310-six python310-xmlschema python310-zope.interface update-alternatives"

inherit rpm
