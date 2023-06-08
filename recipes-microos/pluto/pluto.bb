SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.16.1"

RPM_NAME = "pluto-5.16.1-1.1.aarch64.rpm"
RPM_HASH = "427d888cd52fe1755a6c8f48b1948988875547655da28b3a15cca5891778b1ae3811139d7c847672cec686b944439ec98c7911238ba8a2ad1100df0dacab3e3d"

RPROVIDES:${PN} += "pluto pluto(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
