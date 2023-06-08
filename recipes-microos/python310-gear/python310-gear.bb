SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python310-gear-0.16.0-1.4.noarch.rpm"
RPM_HASH = "ff6c8bfaef5024095bd5bb1bc7f308cb05edf20336989d418d5ee9b1268158c37208fb68289f87bee341f2f9c55162cee9930786bb6fe44be906085a675cedd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gear python3.10dist(gear) python310-gear python3dist(gear)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-extras python310-pbr python310-python-daemon python310-six update-alternatives"

inherit rpm
