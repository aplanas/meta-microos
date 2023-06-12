SUMMARY = "Devel files for python310-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-Charts-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "84b309483d5457d3a55e6cb716af20567433b076d6f81e936a1e1471616e94c138559a12609155f74a7fc55e3b79f76cff9a5013ca366b7629076e72c657e4ff"

RPROVIDES:${PN} += "python3-PyQt6-Charts-devel python310-PyQt6-Charts-devel python310-PyQt6-Charts-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-PyQt6-devel"

inherit rpm
