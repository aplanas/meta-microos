SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-wafw00f-2.2.0-1.3.noarch.rpm"
RPM_HASH = "ef29e1b29612c59635ade15a4e0ccc73983cd48cc626c3de493589a1981af6be2189fe018ffffe5b2c7125fed9879dd76f764df8498fdec99822086bd651e059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wafw00f) python39-wafw00f python3dist(wafw00f)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-pluginbase python39-requests"

inherit rpm
