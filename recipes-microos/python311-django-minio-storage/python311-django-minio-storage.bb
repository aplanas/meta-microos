SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.2"

RPM_NAME = "python311-django-minio-storage-0.5.2-1.1.noarch.rpm"
RPM_HASH = "372879b44943fec48eac3c6c5173aca1fc923d1fb4a56904bb7e07f30d670f2624c3c88dd3449743015e3fe0937e4c90000a12b84df4b48ba9ac95c7065c1ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-minio-storage) python311-django-minio-storage python3dist(django-minio-storage)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-minio"

inherit rpm
