SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python311-environ-config-22.1.0-1.3.noarch.rpm"
RPM_HASH = "9f625e471bb84fb1599ccb0a600bf11970ff305a9e6733d36993393d86dd31784f64352f38ee38a94ae74c778f24f60e742c26737e58f9529c60d60f7f40eb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(environ-config) python311-environ-config python3dist(environ-config)"
RDEPENDS:${PN} += "python(abi) python311-attrs"

inherit rpm
