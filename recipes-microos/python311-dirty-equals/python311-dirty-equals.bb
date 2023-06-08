SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-dirty-equals-0.5.0-1.3.noarch.rpm"
RPM_HASH = "e0f18f797ae518a144f8472ec350adeb5d9464cf2e41a6ce1aad46be3bd809eb027f95971f7b6abd264e0f96a40137a86fc9a6e6e307931f4a5446f81272fe0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dirty-equals) python311-dirty-equals python3dist(dirty-equals)"
RDEPENDS:${PN} += "python(abi) python311-pytz"

inherit rpm
