SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.16.1"

RPM_NAME = "python310-google-cloud-kms-2.16.1-1.2.noarch.rpm"
RPM_HASH = "612aeddbadad73566122d7e008129bed0e0bf344711c568ae18e6a96b17f079f8f2700aaacbcee48e4d5563c0f249d35aab8e39be553f94382c928ac1c136606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-kms python3.10dist(google-cloud-kms) python310-google-cloud-kms python3dist(google-cloud-kms)"
RDEPENDS:${PN} += "python(abi) python310-google-api-core python310-grpc-google-iam-v1 update-alternatives"

inherit rpm
