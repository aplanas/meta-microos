SUMMARY = "Kickstart over a network"
DESCRIPTION = "Koan stands for kickstart-over-a-network and allows for both network \
installation of new virtualized guests and reinstallation of an existing \
system. For use with a boot-server configured with Cobbler."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "koan-3.0.1-2.4.noarch.rpm"
RPM_HASH = "331f3a23835b0550c67b98af9edc8c7550076eaf1b5b437d2f22d76238168c18836110f68d5be0cc3864ddf3e40bd4f877c52d1b0bd088dd62f8e6900945bd72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "koan python3.10dist(koan) python3dist(koan)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-distro python3-libvirt-python python3-netifaces"

inherit rpm
