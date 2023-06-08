SUMMARY = "A tool for generating SELinux security policies for containers"
DESCRIPTION = "Tool for generating SELinux security profiles for containers based on \
inspection of container JSON file."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "udica-0.2.6-1.2.noarch.rpm"
RPM_HASH = "43babf72a2a641c944146d5e04c7ae349dae70d0aff990bfcca8038ab63eb75a2f896374da997029cac4a36a5a34a9f373bbc32d6f7eee0ed5c53c6194c5e125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(udica) python3dist(udica) udica"
RDEPENDS:${PN} += "/usr/bin/python3 container-selinux python(abi) python3 python3-selinux python3-semanage python3-setuptools"

inherit rpm
