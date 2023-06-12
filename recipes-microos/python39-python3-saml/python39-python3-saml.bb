SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python39-python3-saml-1.15.0-1.1.noarch.rpm"
RPM_HASH = "e5fc7966105f402c8aec07370c8e1a97164e095c7c14bbd17b5f409dc529c429a0c922af05f813ed249447aaa91cf8f20e1c8b7766a4efe5a08ed22f6d5e0ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python3-saml) \
python39-python3-saml \
python3dist(python3-saml)"
RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python(abi) \
python39-isodate \
python39-lxml \
python39-xmlsec"

inherit rpm
