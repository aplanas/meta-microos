SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "skelcd-installer-net-MicroOS-17.87-1.9.aarch64.rpm"
RPM_HASH = "95391b88430ae55b2fa28d0f192c4c836f7f381311853d7af56858da40ab2ea452288d0bffeef7929faace081abc7a910da542eed796013f98a0dd533274d7ca"

RPROVIDES:${PN} += "skelcd-installer skelcd-installer-net-MicroOS skelcd-installer-net-MicroOS(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
