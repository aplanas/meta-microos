SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python39-bindep-2.11.0-3.1.noarch.rpm"
RPM_HASH = "954f75c88c491bd29aa8c28385e5daa2057e89d89a2618984bd3d0b5a1872696dcca1332fa58762485d50f9a3e41e672b6356eff4c33b0d9fd9f29b587c71812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bindep) \
python39-bindep \
python3dist(bindep)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Parsley \
python39-distro \
python39-packaging \
python39-pbr"

inherit rpm
