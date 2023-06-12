SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python310-versioneer-toml-0.28-1.1.noarch.rpm"
RPM_HASH = "d0a0690c24c505d393860a6a1422d70bfbae947caf706b10e37726e9c2c985d6beaba46b09fb97bc10d002a88cc4d682ef6a887b9e14a63242a2ed685037b2e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioneer-toml \
python310-versioneer-toml"
RDEPENDS:${PN} += "(python310-tomli if python310-base < 3.11) \
python310-versioneer"

inherit rpm
