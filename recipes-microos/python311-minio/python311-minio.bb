SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.14"

RPM_NAME = "python311-minio-7.1.14-1.2.noarch.rpm"
RPM_HASH = "1c4bed71f4838d3c1c6f1d139b05dc8f4b20f08728c54228e311bafc8f90a4d8e90be1bbb47c96aa3a8b2bd24660a46f3632cabf9c49ecb828b52665256e5fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(minio) python311-minio python3dist(minio)"
RDEPENDS:${PN} += "python(abi) python311-certifi python311-future python311-python-dateutil python311-pytz python311-urllib3"

inherit rpm
