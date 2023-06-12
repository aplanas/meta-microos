SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-asn1crypto-1.5.1-3.1.noarch.rpm"
RPM_HASH = "0611288213d0e55ca347ccbf63ef40adcd3b4bf15ab7cbe0f24398082c2f51643a375118d7a138a88ec3d4387181ee392c7fd7369c342b52a65105ef62a4802b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asn1crypto) \
python311-asn1crypto \
python3dist(asn1crypto)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
