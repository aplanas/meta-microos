SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.4"

RPM_NAME = "python39-pyhcl-0.4.4-2.14.noarch.rpm"
RPM_HASH = "6c1721ebb49d5e7ebb141c10a03a504c684048c50145b8fb43b2edc59626109d217a50ba69b2f50d4d56b3594564d762d09c8855e32eac77b277a9f9a93f8632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyhcl) python39-pyhcl python3dist(pyhcl)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
