SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, public keys, \
certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-asn1crypto-1.5.1-2.1.noarch.rpm"
RPM_HASH = "fd925527b5b7f45c1744faf0d5b3cbfa4b7118a0991ed8858cb156527c75b542c11606d929e82f9c5d37f281e3255ebc761a5b041ccaa031ad6d4d0d038152aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asn1crypto python3.10dist(asn1crypto) python310-asn1crypto python3dist(asn1crypto)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
