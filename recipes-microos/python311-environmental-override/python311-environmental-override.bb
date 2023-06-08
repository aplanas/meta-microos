SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-environmental-override-0.1.2-1.17.noarch.rpm"
RPM_HASH = "fb785a4e9fd65f1006beec8c368cf17cfa433cff800808d1a920b846a86d4682b2c05b71f364433dc18ef3edd3455e3b2722f6a9d8d01730c412a7ea5938c6f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(environmental-override) python311-environmental-override python3dist(environmental-override)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
