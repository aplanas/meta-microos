SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python310-typeguard-2.13.3-2.1.noarch.rpm"
RPM_HASH = "b0047380619229bcc177f628038606e7e8ef2af74d9a79e4842d7e200ce994396644e44764df1063f7098a42b0f105972c43b5262781f7d630dd51b612b1fe90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typeguard python3.10dist(typeguard) python310-typeguard python3dist(typeguard)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
