SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python310-pynxos-0.0.5-1.14.noarch.rpm"
RPM_HASH = "af552c07095b8ec7ab3626fad17fbc33ff3c143eaad856964e8e8851a700a67f618e1128f53df3395a209a0b4ddbefa6b436b4d9adcf87059987df30f48913a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynxos python3.10dist(pynxos) python310-pynxos python3dist(pynxos)"
RDEPENDS:${PN} += "python(abi) python310-future python310-requests python310-scp"

inherit rpm
