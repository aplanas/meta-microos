SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.36.noarch.rpm"
RPM_HASH = "b1abfad357935ec6c1c09508babdc7e7cfc9bed100d372e14c2a4251f8482a9429bc6cabf81e9f4087c6155a674a988696c2aec5ec0f89aa0facb351e8b9b8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"
RDEPENDS:${PN} += "/bin/bash v4l-utils"

inherit rpm
