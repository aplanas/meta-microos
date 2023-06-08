SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python311-pip-licenses-4.3.1-1.1.noarch.rpm"
RPM_HASH = "62410554f68ed27a2d74eba22e0f7b84e0a3bf21b5b69ef518f8d533a37ae581aad0b374c81d1dc4406777bf4b11534d6ab0df35d4a1e30d3161513f1488ac84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip-licenses) python311-pip-licenses python3dist(pip-licenses)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PrettyTable python311-pip update-alternatives"

inherit rpm
