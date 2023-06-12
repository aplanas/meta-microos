SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0"

RPM_NAME = "python310-sniffio-1.3.0-2.1.noarch.rpm"
RPM_HASH = "0f918a22ff9536528e46ba5ca1628c0772bb7ae5592dd718f21936201943c46397f6db9a508c51e1e7ea2c1e94590db270a1b96ee4805a61f7313d94178dadeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sniffio \
python3.10dist(sniffio) \
python310-sniffio \
python3dist(sniffio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
