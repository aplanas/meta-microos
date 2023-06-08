SUMMARY = "Support tools for Reliable Datagram Sockets"
DESCRIPTION = "A collection of support tools for the RDS socket API."
LICENSE = "BSD-3-Clause | GPL-2.0"

PV = "2.0.7"

RPM_NAME = "rds-tools-2.0.7-2.23.aarch64.rpm"
RPM_HASH = "1cc6e5e41ecab7ed26a0ee005a722064378ad6d7225ea1df8ce4d533a470e31f333f2b5b7cae56109c9ad75a63d906a9d068a24d093a68029c3c93e15c515f68"

RPROVIDES:${PN} += "rds-tools rds-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
