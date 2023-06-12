SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python310-smart-open-6.3.0-1.4.noarch.rpm"
RPM_HASH = "0353ac5f195b5d5f4ae6985a23d76b850261e928e5d6cc074af1626719b57eb20d4cc4963eca0ad9390991f379ded3dc718386b1ca5b60bdc4f8076a04f9b443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smart-open \
python3.10dist(smart-open) \
python310-smart-open \
python3dist(smart-open)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-storage-blob \
python310-boto3 \
python310-google-cloud-storage \
python310-requests"

inherit rpm
