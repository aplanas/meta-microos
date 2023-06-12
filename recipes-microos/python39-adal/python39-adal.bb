SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python39-adal-1.2.7-1.9.noarch.rpm"
RPM_HASH = "178caf55d9de4f1adfec383b0be6d24d104f15cbdddd9a4ef138214451aeb1cdf2d50763f944779fd6430ec38d53d6e0de52b2af5c4993a0a02c09337c977e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(adal) \
python39-adal \
python3dist(adal)"
RDEPENDS:${PN} += "python(abi) \
python39-PyJWT \
python39-cryptography \
python39-python-dateutil \
python39-requests"

inherit rpm
