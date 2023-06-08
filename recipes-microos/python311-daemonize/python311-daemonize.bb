SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-daemonize-2.5.0-3.12.noarch.rpm"
RPM_HASH = "721ef4cc50280a4c0d35db9ae16fbda64a0ebcc3dabc110d53c0fbfde79be0fd2184b813958672338f84d86762759e9d9dec530e5470c17ba9a985afc2ea3099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(daemonize) python311-daemonize python3dist(daemonize)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
