SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-rst.linker-2.4.0-1.1.noarch.rpm"
RPM_HASH = "35121f3a365312cbdafc62f06d1a5538882db21510770d9a5e091e74eaa920a6316e53ff482a9342478d100b7f4aebcf0cafa266de321a3ab2e13e393d3382c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rst.linker) python311-rst.linker python3dist(rst.linker)"
RDEPENDS:${PN} += "python(abi) python311-python-dateutil"

inherit rpm
