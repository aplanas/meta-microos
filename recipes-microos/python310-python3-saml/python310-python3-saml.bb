SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python310-python3-saml-1.14.0-3.3.noarch.rpm"
RPM_HASH = "5482c8ad1f0c3c19bd3cf7cbbbdd823ef25b5980bd710681f3d2c756121078844184245891bcdb64ae9ff41657f5c92c5f82a45cfaa3eebbb67756293556980d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python3-saml python3.10dist(python3-saml) python310-python3-saml python3dist(python3-saml)"
RDEPENDS:${PN} += "libxmlsec1-openssl1 python(abi) python310-isodate python310-xmlsec"

inherit rpm
