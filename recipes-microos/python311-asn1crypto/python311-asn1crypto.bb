SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, public keys, \
certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-asn1crypto-1.5.1-2.1.noarch.rpm"
RPM_HASH = "c7f5f2ddf56a90eb545812f713e1ac7e7a78c06d3f1501de5305a94e8986b72d9513ab9623d60069d83a3afb1cfb2dc3e37d435652f64571ef24f0d62de737ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asn1crypto) python311-asn1crypto python3dist(asn1crypto)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
