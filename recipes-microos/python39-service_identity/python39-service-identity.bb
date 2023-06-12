SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "21.1.0"

RPM_NAME = "python39-service_identity-21.1.0-3.1.noarch.rpm"
RPM_HASH = "e750bc24bca1dca654e7705a451af29eaf85de2dfc1fcac5baccef9198f522cf8217f2e0ac79525a83cf53c28a884454e4ed7513aedae2650dc0b7dc517bf6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(service-identity) \
python39-service_identity \
python3dist(service-identity)"
RDEPENDS:${PN} += "python(abi) \
python39-attrs \
python39-cryptography \
python39-pyasn1 \
python39-pyasn1-modules \
python39-six"

inherit rpm
