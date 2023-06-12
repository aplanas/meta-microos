SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-daemonize-2.5.0-3.12.noarch.rpm"
RPM_HASH = "b336e973f5ebbb1281a89a07d1602003e84370eb783c87855da3349108131359fce02511454e2969411460022efb93931320c008b510d0e89688e0b46331342f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-daemonize \
python3.10dist(daemonize) \
python310-daemonize \
python3dist(daemonize)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
