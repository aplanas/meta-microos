SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python311-typeguard-2.13.3-2.1.noarch.rpm"
RPM_HASH = "79ba054e192266953069b08dbec2170e694eb0abbde0164755b22313dac933e60f81d703630da06d0f009b49976cc8f2645bf41940359fe1298c72015996c998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(typeguard) python311-typeguard python3dist(typeguard)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
