SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python311-python3-saml-1.14.0-3.3.noarch.rpm"
RPM_HASH = "f0976ec5b99dc41ee41ae7f716e6356a11ad617e5b39034fc9e7748764af8a5b10e28b44be63cf26572ae11fccca17917e857a7c7d1eb0eb1620a847e99e9ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python3-saml) python311-python3-saml python3dist(python3-saml)"
RDEPENDS:${PN} += "libxmlsec1-openssl1 python(abi) python311-isodate python311-xmlsec"

inherit rpm
