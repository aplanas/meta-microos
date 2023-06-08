SUMMARY = "Ceph RBD handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS Block Device (RBD) handler for \
tcmu-runner, which allows for LIO/tcmu logical units to be backed by \
RBD images."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-handler-rbd-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "aa480aab7221db5d03031e1f67ca6fe50ce09c470f4d146d95cde72d3c81548bc9388a106994380c474f2ffc2c0f4e1db7b2a11b4d65ac5690cfb9b710ae2ca1"

RPROVIDES:${PN} += "tcmu-runner-handler-rbd tcmu-runner-handler-rbd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librbd.so.1()(64bit) libtcmalloc.so.4()(64bit) tcmu-runner"

inherit rpm
