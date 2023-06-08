SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python39-smart-open-6.3.0-1.4.noarch.rpm"
RPM_HASH = "ad5df104ab59cae191142a2bbc9b6666b5410b4606d2b4f45ff2aca10ea278e65784d3c0c2ffc218755b398a830b6a53c2ae6afb0c83b476e3b34906dedfc8de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(smart-open) python39-smart-open python3dist(smart-open)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-core python39-azure-storage-blob python39-boto3 python39-google-cloud-storage python39-requests"

inherit rpm
