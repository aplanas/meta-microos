SUMMARY = "Development files for hplip"
DESCRIPTION = "This sub-package is only required by developers."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-devel-3.22.10-2.1.aarch64.rpm"
RPM_HASH = "1ddfd4ddc5827d7996577a5a59dca3b9c5e67ff1a52bf90c09d540100ffc5ef92b7880b148c138e29eea41d8d0b8a69d1ea7c5e8d27c16f48f1fae712554b5d0"

RPROVIDES:${PN} += "hplip-devel \
hplip-devel(aarch-64)"
RDEPENDS:${PN} += "cups-devel \
dbus-1-devel \
hplip-hpijs \
hplip-sane \
libopenssl-devel \
libusb-1_0-devel \
net-snmp-devel"

inherit rpm
