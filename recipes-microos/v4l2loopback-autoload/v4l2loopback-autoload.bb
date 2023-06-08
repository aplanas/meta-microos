SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.36.noarch.rpm"
RPM_HASH = "881eca615447f167828890cecca2c067ac10c0b0e06e9f9ded87d39cbc4b1ab6e5c847c3b27d46cd2c63d4b3f0f2c5aa0fab4655ef431ebc7d124ea01b163966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"
RDEPENDS:${PN} += "(kmod(v4l2loopback.ko) if kernel) systemd"

inherit rpm
