SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "39e0302b7e0f3cce9733f83c95d7a4174d5fcaf80d717bbadbd129d0e8c7c38af745cd2f75275d9df5c0e5e248d178e646b600e802bca28b17223bbac5fd15e6"

RPROVIDES:${PN} += "config(libvirt-daemon-config-nwfilter) libvirt-daemon-config-nwfilter libvirt-daemon-config-nwfilter(aarch-64)"
RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
