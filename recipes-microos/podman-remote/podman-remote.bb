SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-remote-4.5.1-1.1.aarch64.rpm"
RPM_HASH = "4f2c042423fcc4253d6c664388165e68ce1c9eb6664958098fe8e33766b5f6c02125197c742bf2841c106635b7804b421944c4a2909023e0f69f1a88ad233faa"

RPROVIDES:${PN} += "podman-remote podman-remote(aarch-64) podman:/usr/bin/podman-remote"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
