SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python310-linstor-1.12.0-1.6.aarch64.rpm"
RPM_HASH = "6b645fd9000e0b0cbf43118b69a0235a151a72286ae0cfe31df3822dfe6861cc1c692367c9d47febee0d25c6370a69cdaf2577b39693fc4b4905b6edf5e3de72"

RPROVIDES:${PN} += "python3-linstor python3.10dist(python-linstor) python310-linstor python310-linstor(aarch-64) python3dist(python-linstor)"
RDEPENDS:${PN} += "python(abi) python310-protobuf"

inherit rpm
