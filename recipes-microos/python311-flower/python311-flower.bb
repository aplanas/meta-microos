SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-flower-1.1.0-1.5.noarch.rpm"
RPM_HASH = "9fdc6cb1576e29c2d027b7c47d3227df384f8669a68c80bdbc87eb7d5353a588e06c1c5276fd1504f664955dc52838e6acc4aca875d3e99924628e0058101fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flower) python311-flower python3dist(flower)"
RDEPENDS:${PN} += "python(abi) python311-Babel python311-celery python311-certifi python311-humanize python311-prometheus_client python311-pytz python311-tornado update-alternatives"

inherit rpm
