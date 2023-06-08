SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.16.1"

RPM_NAME = "python39-google-cloud-kms-2.16.1-1.2.noarch.rpm"
RPM_HASH = "2507514847d40832dfdb8cbe3b64eaeef1ab2f7a18926d1d5a7647cc53f9b61daa9e045036b764927b61681bf40587fcecf5a159a8ae1aa4a60933e231a8e6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-cloud-kms) python39-google-cloud-kms python3dist(google-cloud-kms)"
RDEPENDS:${PN} += "python(abi) python39-google-api-core python39-grpc-google-iam-v1 update-alternatives"

inherit rpm
