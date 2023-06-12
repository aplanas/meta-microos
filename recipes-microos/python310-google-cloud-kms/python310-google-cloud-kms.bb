SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "python310-google-cloud-kms-2.17.0-1.1.noarch.rpm"
RPM_HASH = "72f359d1486939cb78edc478bdc71066d8f0effcdb0e5e26fcb7329117d30b85922e5231fb6bc5e948bb1bc3158ca4570ec972889cf9bb1d0083b89c931623e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-kms \
python3.10dist(google-cloud-kms) \
python310-google-cloud-kms \
python3dist(google-cloud-kms)"
RDEPENDS:${PN} += "python(abi) \
python310-google-api-core \
python310-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
