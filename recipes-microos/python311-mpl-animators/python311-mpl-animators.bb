SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "An interative animation framework for matplotlib"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python311-mpl-animators-1.0.1-1.6.noarch.rpm"
RPM_HASH = "a3fa115950f20d5498e2ab2123bc1b32b9a320fb4bf709ebfee610740bf2bf6d13ef787fc101441d6ad9f450ca98c34ccc5b22cae770aa22486beec3cf15ef20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mpl-animators) python311-mpl-animators python311-mpl_animators python3dist(mpl-animators)"
RDEPENDS:${PN} += "python(abi) python311-matplotlib python311-numpy"

inherit rpm
