SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python39-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-persistent-devel-5.0-1.4.aarch64.rpm"
RPM_HASH = "861dd234eb2b7a2312a743e2d255671e7e615d090015be9430cb0bed5eeb66b3eb71b2de7482ad5f401cb41978e49c72015795b8ffa86ee140f7760cafa5c0fd"

RPROVIDES:${PN} += "python39-persistent-devel \
python39-persistent-devel(aarch-64)"
RDEPENDS:${PN} += "python39-devel \
python39-persistent"

inherit rpm
