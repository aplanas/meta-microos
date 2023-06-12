SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-config-network-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "7583eda86f8c85f5a558e05b8099cbde5eea4c27e9d7b8e4a18f59b0fce223c5bd9b6e5a53e3bf111c55a89460191fb97ad4236d57ac19061a11d9fcb392be05"

RPROVIDES:${PN} += "libvirt-daemon-config-network libvirt-daemon-config-network(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libvirt-daemon-driver-network"

inherit rpm
