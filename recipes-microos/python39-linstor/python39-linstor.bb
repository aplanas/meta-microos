SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python39-linstor-1.12.0-1.6.aarch64.rpm"
RPM_HASH = "247aa2cef964a56aaadb045d4fae95fd63a01056300745eb545663738181c4a604081475870887f898f95cf1a59ed87258a5e190087f473b4d40ca479f2abb68"

RPROVIDES:${PN} += "python3.9dist(python-linstor) python39-linstor python39-linstor(aarch-64) python3dist(python-linstor)"
RDEPENDS:${PN} += "python(abi) python39-protobuf"

inherit rpm
