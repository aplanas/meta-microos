SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-rst.linker-2.4.0-1.1.noarch.rpm"
RPM_HASH = "c7d854bdb074940e21953268f4698ea785ce4965516c3c4147fcd78a107244ac190d01a1b8add0906acdd6d83e34cc2acec3ff3e346a761343c4c8d75a6770cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rst.linker) \
python39-rst.linker \
python3dist(rst.linker)"
RDEPENDS:${PN} += "python(abi) \
python39-python-dateutil"

inherit rpm
