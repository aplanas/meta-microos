SUMMARY = "Devel files for python310-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-Charts-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0d0f63028bd75806f1dbabd4d68eec453ac1e6540804c64987539bc8b0de9012e7bc2cfdad93fdf11471e3d56f333c8b4cab794a79c29cb3b7a76e2d6e224288"

RPROVIDES:${PN} += "python3-PyQt6-Charts-devel python310-PyQt6-Charts-devel python310-PyQt6-Charts-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-PyQt6-devel"

inherit rpm
