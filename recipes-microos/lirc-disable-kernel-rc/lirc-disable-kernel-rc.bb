SUMMARY = "Disable kernel ir device handling in favor of lirc"
DESCRIPTION = "Udev rule which disables the kernel built-in handling of infrared devices \
(i. e., rc* ones) by making lirc the only used protocol."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-disable-kernel-rc-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "2747b3f19d19a5ba882091882e91d2264c2c3c0c5278f10ae5970a07fbd9c1805395d3aff6199a7200890291475b82759f5600bc03ded81315771297e4079219"

RPROVIDES:${PN} += "lirc-disable-kernel-rc lirc-disable-kernel-rc(aarch-64)"
RDEPENDS:${PN} += "lirc-core"

inherit rpm
