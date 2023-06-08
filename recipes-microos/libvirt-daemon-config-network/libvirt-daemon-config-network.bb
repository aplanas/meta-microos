SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-config-network-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "b31c088fa734615279e09f14292979bc2a18d76f3d05e588e98a210cf87e59e33f0001aca7d19bb7a80d9348366d2531d08871fa2deb0692551662a22aa2651d"

RPROVIDES:${PN} += "libvirt-daemon-config-network libvirt-daemon-config-network(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libvirt-daemon-driver-network"

inherit rpm
