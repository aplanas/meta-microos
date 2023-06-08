SUMMARY = "Quick and Easy server testing/validation"
DESCRIPTION = "Goss is a YAML based serverspec alternative tool for validating a server’s configuration. It eases the process of writing tests by allowing the user to generate tests from the current system state. Once the test suite is written they can be executed, waited-on, or served as a health endpoint."
LICENSE = "Apache-2.0"

PV = "0.3.18"

RPM_NAME = "goss-0.3.18-1.2.aarch64.rpm"
RPM_HASH = "6f3a4f5943ddb93858ac32b4777cfd8bca867d30e1f6351c325f9eca97cc3a5cb99f2d4882f4e840dd6d22d51fe9e0c4c1b53ece7ca17379893c10879a0c26dc"

RPROVIDES:${PN} += "goss goss(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/env"

inherit rpm
