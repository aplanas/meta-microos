SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python39-python3-saml-1.14.0-3.3.noarch.rpm"
RPM_HASH = "632c6a2dd1f80669fa7ff52279f3276fe4d587e2fff99099bff4865a68277639ed1d6f2ee5744ca1e848ae52ae11751331273fb86a99fb8a2dd8dbf0bb9623a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python3-saml) python39-python3-saml python3dist(python3-saml)"
RDEPENDS:${PN} += "libxmlsec1-openssl1 python(abi) python39-isodate python39-xmlsec"

inherit rpm
