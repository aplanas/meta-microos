SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.2"

RPM_NAME = "python310-django-minio-storage-0.5.2-1.1.noarch.rpm"
RPM_HASH = "b73569906613393a414009f5349bc2e6a1b8192ce8acf8e0667fd83e55a719260982ab732e3370b68ba562347e9dc6199a943d02973fedc7c5b121f50f0549c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-minio-storage python3.10dist(django-minio-storage) python310-django-minio-storage python3dist(django-minio-storage)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-minio"

inherit rpm
