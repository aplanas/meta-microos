SUMMARY = "Documentation for qt6-serialport in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialport in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialport-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6d1fbeecc316674c61e6df98f19e3a8a1638e9185219ca3c40f5630318aa996ad1aff066aebe00dc0a3a61ff4a5bea9dba7436669958ccd0f9786cfdc4e3ed36"

RPROVIDES:${PN} += "qt6-serialport-docs-qch qt6-serialport-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
