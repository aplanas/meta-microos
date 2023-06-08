SUMMARY = "System container rootfs creation tool"
DESCRIPTION = "Provides a way to create the root file system to use for \
libvirt containers."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "python3-virt-bootstrap-1.1.1-6.7.noarch.rpm"
RPM_HASH = "58593b274ddedbaf6bcd305bace581ee2f72116ad55418f070f73b88ffdb4f69b327d264dedfaaedb49cb65fafb2cbd27a8156db8c2d619fa6dede4be0845f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virt-bootstrap python3.10dist(virt-bootstrap) python3dist(virt-bootstrap)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-libguestfs python3-passlib skopeo update-alternatives virt-sandbox"

inherit rpm
