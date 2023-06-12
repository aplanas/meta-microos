SUMMARY = "Udev rules for osmo-fl2k"
DESCRIPTION = "Udev rules for osmo-fl2k."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "osmo-fl2k-udev-0.1.1+git.20200602-1.11.aarch64.rpm"
RPM_HASH = "3ff5b6e18139924445c53c2393143e55322a5f19a070af5aa16b0980040872c3b9d2ceb1ee0af4a302e93e6b1ac93c9a13904b835f8ba1822b39058724e3ea25"

RPROVIDES:${PN} += "osmo-fl2k-udev \
osmo-fl2k-udev(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
