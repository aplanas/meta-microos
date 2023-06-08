SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.16.1"

RPM_NAME = "python311-google-cloud-kms-2.16.1-1.2.noarch.rpm"
RPM_HASH = "44b27110d1a4b80241915ab5be462869886faa0ed2bbac39866fbec282e3e97397b39258477817595f428d5a25e58997855a97401491920ecaa0b9264824995d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-cloud-kms) python311-google-cloud-kms python3dist(google-cloud-kms)"
RDEPENDS:${PN} += "python(abi) python311-google-api-core python311-grpc-google-iam-v1 update-alternatives"

inherit rpm
