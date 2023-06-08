SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-pytest-env-0.6.2-3.1.noarch.rpm"
RPM_HASH = "ba4bbef91a01c2a0bfdf1baaf6b431f111f314228431ef63f2745c65cef96ed390562c8bf187470e7b5885bfc3aed8a1ebfcc0d441a081760c109081ae06b9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-env) python311-pytest-env python3dist(pytest-env)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
