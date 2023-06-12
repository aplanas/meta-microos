SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.39.noarch.rpm"
RPM_HASH = "ba15c9c7b950ee645c85f6653700a086b5f867f564812b147a5341cdd1846e98b96642a7196478ea50b0d9d017431ef334fff6ba745848284fc64bf88b268a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"
RDEPENDS:${PN} += "/bin/bash v4l-utils"

inherit rpm
