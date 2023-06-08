SUMMARY = "Tools for python-pyliblo"
DESCRIPTION = "This package contains command-line tools from python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "pyliblo-tools-0.10.0-2.11.aarch64.rpm"
RPM_HASH = "f13b823f0067bbdb917b5213f147e562e8616d79272015b56ab2b692814e522447e588266ce7e3e228b52f3d2f90d004a63f6e516cf5a2053ded128f9bb92c80"

RPROVIDES:${PN} += "pyliblo-tools pyliblo-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.10 python3-pyliblo"

inherit rpm
