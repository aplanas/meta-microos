SUMMARY = "Tool for spawning and running OCI containers"
DESCRIPTION = "runc is a CLI tool for spawning and running containers according to the OCI \
specification. It is designed to be as minimal as possible, and is the workhorse \
of Docker. It was originally designed to be a replacement for LXC within Docker, \
and has grown to become a separate project entirely."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "runc-1.1.7-1.1.aarch64.rpm"
RPM_HASH = "b6e159bf6339db249e5e5984805e11108d662b099e023b22a10e056acea87c18cd385d9c6a27e0009ed4567b3f8d94aefb03aa21106b52963806afa8cbc6a591"

RPROVIDES:${PN} += "docker-runc docker-runc-kubic runc runc(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libseccomp.so.2()(64bit)"

inherit rpm
