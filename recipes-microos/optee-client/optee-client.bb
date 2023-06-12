SUMMARY = "A Trusted Execution Environment client"
DESCRIPTION = "This component provides the TEE Client API as defined by the \
GlobalPlatform TEE standard. For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "optee-client-3.9.0-1.11.aarch64.rpm"
RPM_HASH = "6bb83762512bf04725ae276dd60967d9ed9afc256fe428db52a4f3e74df78b89eacec9a6c7f3986e7ee2e5a1588b0580c46290896d348fe9fb576a99831ea417"

RPROVIDES:${PN} += "optee-client \
optee-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libteec.so.1()(64bit)"

inherit rpm
