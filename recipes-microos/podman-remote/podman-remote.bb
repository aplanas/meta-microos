SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "podman-remote-4.5.0-1.1.aarch64.rpm"
RPM_HASH = "791b40d02c698b896601d929dafe0f2ac87b3fba467b23f61de90be703b54d59dc4492bcc9d2930e6a05a4681ddf5823ec85c4e86d9e9645d252562da98e9762"

RPROVIDES:${PN} += "podman-remote podman-remote(aarch-64) podman:/usr/bin/podman-remote"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
