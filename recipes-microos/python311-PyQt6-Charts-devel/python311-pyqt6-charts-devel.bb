SUMMARY = "Devel files for python311-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "7a1ef060493f94a3850daf8ecdf3c116e2ff25f36fc622fee8f555f5e701f40335d9c8f78d5924aa274386cbf8340e5b091321e575cdbf3383de4dc911207f5f"

RPROVIDES:${PN} += "python311-PyQt6-Charts-devel \
python311-PyQt6-Charts-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python311-PyQt6-devel"

inherit rpm
