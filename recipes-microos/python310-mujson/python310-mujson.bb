SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-mujson-1.4-2.15.noarch.rpm"
RPM_HASH = "e99661e211488ea120dc82a75dc9f4d37321b0da8f23f35fc089d85d829c4a40293d7a0fca8c729715f61ea0b52c555306f10486e68bb6c42294bdaa50a8229a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mujson \
python3.10dist(mujson) \
python310-mujson \
python3dist(mujson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
