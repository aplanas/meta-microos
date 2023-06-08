SUMMARY = "Headers and documentation for the Bobcat library"
DESCRIPTION = "Headers and documentation of classes defined in the Bobcat library."
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat-devel-6.02.02-2.3.aarch64.rpm"
RPM_HASH = "8a7cdc86464e6da78fc16937bfa2d70fec42a7982c89b0f5cd8154d5955b3a4f86a596c845c2f6997978d1f27803044752493bc2c54b1cd9fdab8ebc214fdbf6"

RPROVIDES:${PN} += "libbobcat-devel libbobcat-devel(aarch-64)"
RDEPENDS:${PN} += "libbobcat6"

inherit rpm
