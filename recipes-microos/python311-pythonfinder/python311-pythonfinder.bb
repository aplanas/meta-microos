SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-pythonfinder-1.3.1-3.4.noarch.rpm"
RPM_HASH = "3367918e10a8fcc5e9561985ca85ed0cd5d231bf0c60f6960fb59a0da81f0771a0a1fd73502de21fca561dbd670118b75fdac567d15765382b84ad6ca52cf410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pythonfinder) python311-pythonfinder python3dist(pythonfinder)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-attrs python311-cached-property python311-click python311-packaging python311-vistir update-alternatives"

inherit rpm
