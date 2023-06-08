SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, public keys, \
certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-asn1crypto-1.5.1-2.1.noarch.rpm"
RPM_HASH = "f0a62294484b368dd08496134fd7688eb811670ece109d7b221759ee393529c004d096132cf9f7d243eb22dd7ec2443ea7d1fa6b3a6214cc72a75066bb98c625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asn1crypto) python39-asn1crypto python3dist(asn1crypto)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
