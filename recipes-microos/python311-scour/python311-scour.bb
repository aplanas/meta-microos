SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python311-scour-0.38.2-1.11.noarch.rpm"
RPM_HASH = "34a7ba23ff1c028d07feebb0d68147eb13875e748ff4f9f9526da5aabeb2dc0c68c82eb4760a07b91a1262fab8ce9cbe6d5444d966dd5a65abcdfe02591c79bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scour) python311-scour python3dist(scour) scour"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-setuptools python311-six update-alternatives"

inherit rpm
