SUMMARY = "KIWI - Appliance Builder Next Generation"
DESCRIPTION = "Python 3 library of the KIWI Image System. Provides an operating system \
image builder for Linux supported hardware platforms as well as for \
virtualization and cloud systems like Xen, KVM, VMware, EC2 and more."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "python3-kiwi-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "a7e6754c7fa19eeb99fb80521623a0a48935931aa8a3ac0b349b775b8cc0649b5eb967c6bcfa63aed7ddce5ae14c1674b52514bba115fa03823362192900dc66"

RPROVIDES:${PN} += "python3-kiwi python3-kiwi(aarch-64) python3.10dist(kiwi) python3dist(kiwi)"
RDEPENDS:${PN} += "/usr/bin/python3 kiwi-systemdeps-core python(abi) python3 python3-PyYAML python3-docopt python3-lxml python3-pyxattr python3-requests python3-setuptools python3-simplejson screen"

inherit rpm
