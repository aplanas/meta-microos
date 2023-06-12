SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python39-glean-1.19.0-1.9.noarch.rpm"
RPM_HASH = "aa3ca671d34093adfb9e0091620257b331e710347e72eebf1881750d0689b4c7769ae3a52e2223103fb363077a534ede6e8af1fcd06691c2b873f6fee3bef791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(glean) \
python39-glean \
python3dist(glean)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
