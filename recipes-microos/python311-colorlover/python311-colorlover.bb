SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-colorlover-0.3.0-1.14.noarch.rpm"
RPM_HASH = "f374f0ec90261cc75415fa44bf03a1ba946ab22678a8162e54cb400c84e964ab88118b1e57f5c7e0e6f5dcd4bfd286ce04263a1b04dda6ec5f1d4919233f3d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colorlover) python311-colorlover python3dist(colorlover)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
