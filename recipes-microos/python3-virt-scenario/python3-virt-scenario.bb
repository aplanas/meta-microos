SUMMARY = "Create XML guest configuration and prepare the host for a scenario"
DESCRIPTION = "Prepare a libvirt XML guest configuration and the host to run a customized guest. \
Idea is to use multiple templates and concatenate them to create the \
expected Guest XML file. If Host need a custom setting it will be done in second phase. \
 \
Customization to match a specific scenario is not graved in stone. The idea is to \
prepare a configuration which should improved the usage compared to a basic setting. \
This will **NOT guarantee** that this is perfect."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python3-virt-scenario-1.0.6-1.1.noarch.rpm"
RPM_HASH = "cefcdbd8ee01a7a5c7f6e08b3743362eaf841f0277bbde23ab903b446e12feb43b7ad183027fd948dc67555a68616f0f798260c62c49fea0db20a12b2be6f9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-virt-scenario) python3-virt-scenario python3.10dist(virt-scenario) python3dist(virt-scenario)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-curses python3-libvirt-python python3-psutil python3-pyudev"

inherit rpm
