SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "python39-google-cloud-kms-2.17.0-1.1.noarch.rpm"
RPM_HASH = "ccdd600d9a07a5bf7a4b45b43e512ad7d08e4c20e28e8c602cfc5628ddc43f2f69951103af9cbce88ce50624b3bb2ebdd54704ea61832250c709193708a12f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-cloud-kms) python39-google-cloud-kms python3dist(google-cloud-kms)"
RDEPENDS:${PN} += "python(abi) python39-google-api-core python39-grpc-google-iam-v1 update-alternatives"

inherit rpm
