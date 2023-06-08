SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python311-smart-open-6.3.0-1.4.noarch.rpm"
RPM_HASH = "acea2be480c1aa30e3502930a5a02ad07c8940cdc4e304c91b70c2db6bd5cf7e091c73d48d64f95d92e4fe55e59d6a0f06f9b175a97ff3f8753d3a1e8f087e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(smart-open) python311-smart-open python3dist(smart-open)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-core python311-azure-storage-blob python311-boto3 python311-google-cloud-storage python311-requests"

inherit rpm
