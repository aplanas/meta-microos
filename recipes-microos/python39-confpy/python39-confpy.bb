SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-confpy-0.11.0-1.12.noarch.rpm"
RPM_HASH = "d0cf96fc3c66cca7e208f6e515aae42da96799dbdb6530863bc6eb2768ae1bf367c865075a85b0d03798a247636353e37a69903da4a0a9f3f5b36c4248b2b152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(confpy) \
python39-confpy \
python3dist(confpy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi)"

inherit rpm
