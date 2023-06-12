SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python311-gcsfs-2023.3.0-1.2.noarch.rpm"
RPM_HASH = "38ae7a565800b7dc7e9c3a6bf231e0a1ddd54c38a535f3900c6f8d7affd4aab785f250054ab8d2a70618491cd63365520a0613ca964ffc5922eabede350e6e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gcsfs) \
python311-gcsfs \
python3dist(gcsfs)"
RDEPENDS:${PN} += "python(abi) \
python311-aiohttp \
python311-decorator \
python311-fsspec \
python311-google-auth \
python311-google-auth-oauthlib \
python311-google-cloud-storage \
python311-requests"

inherit rpm
