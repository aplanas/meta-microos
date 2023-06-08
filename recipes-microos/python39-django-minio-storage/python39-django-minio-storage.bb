SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.2"

RPM_NAME = "python39-django-minio-storage-0.5.2-1.1.noarch.rpm"
RPM_HASH = "9cc2f0e1e4246432d2f80595a55439ae218abbdc4c149249f5376c13dda75d55cc91d10ad1f949d0b09d0a52f471ceb0164f31c2a099e07ffcfe4732dd04bd4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-minio-storage) python39-django-minio-storage python3dist(django-minio-storage)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-minio"

inherit rpm
