SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-typeguard-4.0.0-1.1.noarch.rpm"
RPM_HASH = "ac90d9471dd930f4239b4f6ae20be89b8a3db4f7b10e2d9d91db96b0ad087489df71248c5ffef70d6285d737efba9041995ae21dac82f382d2eacaa57839b1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(typeguard) python311-typeguard python3dist(typeguard)"
RDEPENDS:${PN} += "python(abi) python311-importlib-metadata python311-typing-extensions"

inherit rpm
