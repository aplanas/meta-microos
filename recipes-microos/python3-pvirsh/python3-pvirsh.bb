SUMMARY = "Parallel virsh command to manage a selected group of Virtual Machine"
DESCRIPTION = "Parallel virsh command to manage a selected group of Virtual Machine. \
This provides an easy way to execute the same command on a selected \
group of Virtual Machine."
LICENSE = "GPL-3.0-or-later"

PV = "2.2"

RPM_NAME = "python3-pvirsh-2.2-1.2.noarch.rpm"
RPM_HASH = "6fc47d4e5be4f614ca4a0dc3d09f95c11787f97523e7341c488c2867dfdb1541fe25baccebc66b44276da7ad637641580f0013eca485ff66c86c4fb77b210d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-pvirsh) python3-pvirsh python3.10dist(pvirsh) python3dist(pvirsh)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-curses python3-libvirt-python"

inherit rpm
