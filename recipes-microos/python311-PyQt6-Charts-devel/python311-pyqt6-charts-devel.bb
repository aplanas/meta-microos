SUMMARY = "Devel files for python311-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1999f15971ce1e11afec6cbd4edcd8c8367fbb9f11f2168ac884e6c08af46d27b853bb220990a906c6dc4d6adb81c673e26cd721c817a98a3f06724f2c69fd60"

RPROVIDES:${PN} += "python311-PyQt6-Charts-devel python311-PyQt6-Charts-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python311-PyQt6-devel"

inherit rpm
