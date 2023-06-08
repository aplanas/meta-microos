SUMMARY = "CNI plugin providing multiple interfaces in containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-3.6-1.8.aarch64.rpm"
RPM_HASH = "6aa00d155cd8c0bf3a8a5162190a9855b615fec5c35c30b4735647ef1676706006325e5c9c43d4067c790346ec5060b6f0e75709ecae259e6097faa6f7f44329"

RPROVIDES:${PN} += "multus multus(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
