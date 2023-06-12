SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "Libvirt is a C toolkit to interact with the virtualization \
capabilities of Linux. Virtualization of the Linux Operating System means \
the ability to run multiple instances of Operating Systems concurrently \
on a single hardware system where the basic resources are driven by a \
Linux instance. The library aims to provide long term stable C API \
to interact with Linux virtualization technologies."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "9373571e0cb7259b6a3ced92915f3ebe56b3baa545dc4432115293cbf6649b880352556046ac4a9c98274c3b0a0813eb0591d533ffe21ee43d8f0369ac5d49fe"

RPROVIDES:${PN} += "libvirt \
libvirt(aarch-64)"
RDEPENDS:${PN} += "libvirt-client \
libvirt-daemon \
libvirt-daemon-config-network \
libvirt-daemon-config-nwfilter \
libvirt-daemon-driver-interface \
libvirt-daemon-driver-network \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nwfilter \
libvirt-daemon-driver-qemu \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-storage \
libvirt-libs"

inherit rpm
