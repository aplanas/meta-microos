SUMMARY = "Development files for the procmeter system parameter display program"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc. \
 \
This package provides files needed to build modules for procmeter."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-devel-3.6+svn415-1.9.aarch64.rpm"
RPM_HASH = "8cc15a830da3b462c34ae75d50cdb82711032b992bd9c4f2770b5d8a9e84fa6abf4ec9029b46a43f30b489e5d03c87c5ab2f902222c4907461f9a601ce43d1e8"

RPROVIDES:${PN} += "procmeter-devel \
procmeter-devel(aarch-64)"
RDEPENDS:${PN} += "procmeter"

inherit rpm
