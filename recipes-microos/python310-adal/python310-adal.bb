SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python310-adal-1.2.7-1.9.noarch.rpm"
RPM_HASH = "b5dad966da3f8b05a1aac50820aa7c540322d48a8731c8ec3945ea4d4e138384ca80b5900b56509da8413dd3d26506fafb9f3a55f4eeb15d7630bc29a14a747e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-adal \
python3.10dist(adal) \
python310-adal \
python3dist(adal)"
RDEPENDS:${PN} += "python(abi) \
python310-PyJWT \
python310-cryptography \
python310-python-dateutil \
python310-requests"

inherit rpm
