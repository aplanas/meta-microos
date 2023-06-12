SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.5.7"

RPM_NAME = "python39-certifi-2023.5.7-1.1.noarch.rpm"
RPM_HASH = "3722c4081d831cde39681e1d5817a8a35e236b046b0a86ad6461d25e0fbd14a450f17f392461e9e94d4c71ed1eaed430762c42c322fbc97f7fff91e9c3959199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certifi) \
python39-certifi \
python3dist(certifi)"
RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python(abi)"

inherit rpm
