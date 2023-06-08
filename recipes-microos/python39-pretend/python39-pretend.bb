SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python39-pretend-1.0.9-3.1.noarch.rpm"
RPM_HASH = "bfa52be56fa6133b0a24ddc7c1ddb62ec4900a3de901e6b17f4fbf79d30f4ae1f64de01f750c06923b37150566a16762023b4a1ead5e99dc56decf2dab88821c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pretend) python39-pretend python3dist(pretend)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
