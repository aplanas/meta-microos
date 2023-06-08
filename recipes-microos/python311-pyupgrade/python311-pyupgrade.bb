SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.2.2"

RPM_NAME = "python311-pyupgrade-3.2.2-1.4.noarch.rpm"
RPM_HASH = "6a785c38dd0957667738ecdfc1de0dd040cd71fab43dab6b28f9c1cecf2ebf32de34eca097788b4f4e20841a34515b4a79202b4af9313aa93d40b2f1bc8520a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyupgrade) python311-pyupgrade python3dist(pyupgrade)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-tokenize-rt update-alternatives"

inherit rpm
