SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python311-python3-saml-1.15.0-1.1.noarch.rpm"
RPM_HASH = "740f8a9c0f79c012ba6a32da75721e499c44c318754478325a4dd38ec6a5ec8944fa24d95f75536eebb184d36277fdb5d3e26246a7f748e3e042b94ede732e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python3-saml) \
python311-python3-saml \
python3dist(python3-saml)"
RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python(abi) \
python311-isodate \
python311-lxml \
python311-xmlsec"

inherit rpm
