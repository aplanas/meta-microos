SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-test-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "c9bea7c9b53de5f819add03e815ee7e82e38b3d58067e808b38b4e5b01e3062d2fc97fd8b29821266de1a73da3e0cc0c4f29dea16bfe06cb666be6ec2251db78"

RPROVIDES:${PN} += "php8-test php8-test(aarch-64)"
RDEPENDS:${PN} += "php-cli"

inherit rpm
