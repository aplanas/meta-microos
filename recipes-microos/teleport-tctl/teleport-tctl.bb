SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "12.3.3"

RPM_NAME = "teleport-tctl-12.3.3-1.1.aarch64.rpm"
RPM_HASH = "0527945172855893bbc1df2120759304b743d8e6518ac6b44e9c5d7185602e18e6ec3f8bb76c422ed420d6aa097ec83ab0f609db4374fbf10902955847c813a3"

RPROVIDES:${PN} += "teleport-tctl teleport-tctl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
