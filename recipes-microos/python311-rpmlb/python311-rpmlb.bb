SUMMARY = "RPM List Builder"
DESCRIPTION = "RPM List Builder."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "python311-rpmlb-1.1.1-1.12.noarch.rpm"
RPM_HASH = "2f5b96781f16bec800500cce1116229ceeafe1f2d2e713f8583e453f7c72937214bdb87c6119ef83125b219b4dda709b96ac41d67a609ea47e30032611dbce2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rpmlb) python311-rpmlb python3dist(rpmlb)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-click python311-retry"

inherit rpm
