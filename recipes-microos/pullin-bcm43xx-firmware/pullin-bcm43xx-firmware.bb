SUMMARY = "download broadcom firmware files"
DESCRIPTION = "automatically download broadcom firmware files needed for bcm43xx WLAN chips"
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "pullin-bcm43xx-firmware-1.0-4.8.noarch.rpm"
RPM_HASH = "98165b45f0e3d25aa29f0d7980acca82cb49d0e8fe3b6cb9fa09a0b4a1c8a7b737a59fdb869bda6db00975182b6cf0b750dceee19c63b10b2ba66fcb12ebb36c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pullin-bcm43xx-firmware"
RDEPENDS:${PN} += "/bin/sh b43-fwcutter pciutils"

inherit rpm
