SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "12.3.3"

RPM_NAME = "teleport-tsh-12.3.3-1.1.aarch64.rpm"
RPM_HASH = "1eaec5ca6541e8b0caeea78bfdd068ca30168210e06a5991a2b6d543ecd34319d190467862adcf7c338eb3e7ec46c2fb316322adf71184910c062bfc226d3e0f"

RPROVIDES:${PN} += "teleport-tsh teleport-tsh(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
