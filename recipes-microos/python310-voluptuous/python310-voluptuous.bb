SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-voluptuous-0.13.1-1.3.noarch.rpm"
RPM_HASH = "3bbf5e6038090853c24dc5a073f9126867fe49389084c00b19eba64507b30f3d4c86fa25ca3bc277d11f995113761dc9cfeb52a07cb5bb77d9441a0640b0450c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-voluptuous \
python3.10dist(voluptuous) \
python310-voluptuous \
python3dist(voluptuous)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
