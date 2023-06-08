SUMMARY = "A Python library for building configuration shells"
DESCRIPTION = "configshell-fb is a Python library that provides a framework for building simple \
but nice CLI-based applications. \
 \
configshell-fb is a fork of the 'configshell' code written by RisingTide \
Systems. The '-fb' differentiates between the original and this version. Please \
ensure to use either all 'fb' versions of the targetcli components -- targetcli, \
rtslib, and configshell, or stick with all non-fb versions, since they are \
no longer strictly compatible."
LICENSE = "Apache-2.0"

PV = "1.1.29"

RPM_NAME = "python311-configshell-fb-1.1.29-2.1.noarch.rpm"
RPM_HASH = "e752644a21aeccd51ae98c3ce52f6e3df5be4d05dcd7e276c5558761431fda793a7b2d99636fa8c14a733bbcdf26b64dbec462cbc8c224272514dcd67f6dfadf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(configshell-fb) python311-configshell python311-configshell-fb python3dist(configshell-fb)"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python311-pyparsing python311-six python311-urwid"

inherit rpm
