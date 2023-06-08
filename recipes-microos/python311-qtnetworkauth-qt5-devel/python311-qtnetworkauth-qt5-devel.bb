SUMMARY = "Development files for python311-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python311-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtnetworkauth-qt5-devel-5.15.5-1.14.aarch64.rpm"
RPM_HASH = "5cd5be9684ada7c6118d899e85539a76259a3b2690184272012b21f4d04f096314bc9a3aabf7c760a3bc5fde0fcbb3b4de5fdaba5ce645fd4ce3a80bd8c7165e"

RPROVIDES:${PN} += "python311-qtnetworkauth-qt5-devel python311-qtnetworkauth-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python311-qt5-devel python311-qtnetworkauth-qt5"

inherit rpm
