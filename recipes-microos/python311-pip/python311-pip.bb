SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python311-pip-22.3.1-2.1.noarch.rpm"
RPM_HASH = "be4f10cf1bc4d334b1bb941a20175fbebaf641e63eeb1af0561d104bb69f70818ab0bb6f5a5fdac5a9f5ac564d788abc95f3d7f21ab546e6d81b2bdbff2e748d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip) python311-pip python3dist(pip)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts ca-certificates coreutils python(abi) python311-setuptools python311-xml"

inherit rpm
