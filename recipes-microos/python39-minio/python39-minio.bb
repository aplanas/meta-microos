SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.14"

RPM_NAME = "python39-minio-7.1.14-1.2.noarch.rpm"
RPM_HASH = "69d77f079ed113f7216ca8be1f7e793dc7c36d5a77f29c8d1098c8f8c5d1005352691c28c6758d756a77180de4ea721fb03a441df6cff4cd75aca673f6d7b778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(minio) python39-minio python3dist(minio)"
RDEPENDS:${PN} += "python(abi) python39-certifi python39-future python39-python-dateutil python39-pytz python39-urllib3"

inherit rpm
