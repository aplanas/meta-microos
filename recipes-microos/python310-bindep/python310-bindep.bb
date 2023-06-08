SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python310-bindep-2.11.0-3.1.noarch.rpm"
RPM_HASH = "0671f1daf120365ec2af070b916e645db645189ed5ffca767e81564137df7687198c1427f37b0434b040c7e9ce60583d3783dcb7d568c70eba533137c2c656b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bindep python3.10dist(bindep) python310-bindep python3dist(bindep)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Parsley python310-distro python310-packaging python310-pbr"

inherit rpm
