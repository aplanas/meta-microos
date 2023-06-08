SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.16.0"

RPM_NAME = "python39-pan-python-0.16.0-2.13.noarch.rpm"
RPM_HASH = "b37cf93482e80821e69eedc30db929bf6456b5473e57dab8f526c2cd0881cd2a862ecf760a39a60255d590f7a795b49519eca1973543a633f2c27909d94dcfbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pan-python) python39-pan-python python3dist(pan-python)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
