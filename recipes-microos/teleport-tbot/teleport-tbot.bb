SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "12.3.3"

RPM_NAME = "teleport-tbot-12.3.3-1.1.aarch64.rpm"
RPM_HASH = "b7a6cc88c669581adc40388ad75d579df081e346f2b9bf7102888f28d240ff3f6cf40cb263d776c6d0ba9ce1b4072a6878d0770d34e02926b58ff9da66c3a44a"

RPROVIDES:${PN} += "config(teleport-tbot) teleport-tbot teleport-tbot(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
