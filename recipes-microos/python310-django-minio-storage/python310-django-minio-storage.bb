SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.3"

RPM_NAME = "python310-django-minio-storage-0.5.3-1.1.noarch.rpm"
RPM_HASH = "60bf8e1b0b0f4c14a10af9e82b153bed4ea3fc3d1a8d2930c7cfd045d0e99ef2eb7ca62205be94d1af002d3f35f133bec781f0284b41dda539c791f9a32b553a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-minio-storage \
python3.10dist(django-minio-storage) \
python310-django-minio-storage \
python3dist(django-minio-storage)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-minio"

inherit rpm
