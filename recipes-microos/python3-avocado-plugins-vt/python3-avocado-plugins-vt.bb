SUMMARY = "Avocado Virt Test Plugin"
DESCRIPTION = "Avocado Virt Test is a plugin that executes virt-tests with all the avocado \
features, such as HTML report and Xunit output, among others."
LICENSE = "GPL-2.0-only"

PV = "88.0"

RPM_NAME = "python3-avocado-plugins-vt-88.0-1.14.noarch.rpm"
RPM_HASH = "15c4678ddc994c15387b935c193c47b5effd81790fe78e9240f7c7faf57d947a8cd3d71fbfcf4d1bf7f3b4e0bc621d76c1e0875e582f8782a68c73c71e080804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-avocado-plugins-vt) python3-avocado-plugins-vt python3.10dist(avocado-framework-plugin-vt) python3dist(avocado-framework-plugin-vt)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 attr bridge-utils gcc git-core glibc-devel iproute iputils make netcat-openbsd openvswitch python(abi) python3-aexpect python3-avocado python3-dbm python3-devel python3-netaddr python3-netifaces python3-simplejson python3-six qemu-kvm systemtap tcpdump xz"

inherit rpm
