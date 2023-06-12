SUMMARY = "Quick and Easy server testing/validation"
DESCRIPTION = "Goss is a YAML based serverspec alternative tool for validating a server’s configuration. It eases the process of writing tests by allowing the user to generate tests from the current system state. Once the test suite is written they can be executed, waited-on, or served as a health endpoint."
LICENSE = "Apache-2.0"

PV = "0.3.18"

RPM_NAME = "goss-0.3.18-1.3.aarch64.rpm"
RPM_HASH = "8f6abf416c79b367ad9f8a91e935bba4a189acea1d4034d45a4935cd60f7340762c84ae3d8c7a554314418d604a29dbd7c4600ff115f407c7dfd5b57ad87f024"

RPROVIDES:${PN} += "goss goss(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/env"

inherit rpm
