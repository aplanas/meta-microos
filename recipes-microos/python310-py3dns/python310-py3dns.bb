SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "3.2.1"

RPM_NAME = "python310-py3dns-3.2.1-1.13.noarch.rpm"
RPM_HASH = "49cdf49c9eb6c1c2e08f7ff711115310a16c199261a7c6e4daafeb4c2b2c7ccb0cb87929641c8df71a10da4ebf501e8babed84a5b0f2c525b358408d9abb0b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py3dns \
python3.10dist(py3dns) \
python310-py3dns \
python3dist(py3dns)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
