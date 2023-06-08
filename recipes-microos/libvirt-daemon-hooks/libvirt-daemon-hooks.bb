SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-hooks-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "a288fa8e8efc8de0e03b8c6401f73a2e36d0567d07614f296bfc8b323ecf6617be9350725a65df93759d5bf8597f7ab0d0153945f3b0c5a4a60406ac694ff918"

RPROVIDES:${PN} += "libvirt-daemon-hooks libvirt-daemon-hooks(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 libvirt-daemon python3-lxml"

inherit rpm
