SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "Libvirt is a C toolkit to interact with the virtualization \
capabilities of Linux. Virtualization of the Linux Operating System means \
the ability to run multiple instances of Operating Systems concurrently \
on a single hardware system where the basic resources are driven by a \
Linux instance. The library aims to provide long term stable C API \
to interact with Linux virtualization technologies."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "f48f624be8aab87c9a69a9e91b4daddfd202df836706202780a1c79cf48c9b90d895d565580500899fec8a682cb66383bdd3e8437b7ffa15842a961bce99d245"

RPROVIDES:${PN} += "libvirt libvirt(aarch-64)"
RDEPENDS:${PN} += "libvirt-client libvirt-daemon libvirt-daemon-config-network libvirt-daemon-config-nwfilter libvirt-daemon-driver-interface libvirt-daemon-driver-network libvirt-daemon-driver-nodedev libvirt-daemon-driver-nwfilter libvirt-daemon-driver-qemu libvirt-daemon-driver-secret libvirt-daemon-driver-storage libvirt-libs"

inherit rpm
