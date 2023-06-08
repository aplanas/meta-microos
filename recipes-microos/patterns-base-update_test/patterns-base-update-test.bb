SUMMARY = "Tests for the Update Stack"
DESCRIPTION = "Packages used for testing that the update stack works.  These tiny packages do not have any functionality themselves."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-update_test-20200505-40.1.aarch64.rpm"
RPM_HASH = "45362ea1613e84e31a98b0fbf7563767a44ff5898f2d9a9904322ca6aad8189626345d7b138f89a29267d2ad9ad798adf61a305fa62cac10d32b1c2cc356d437"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-update_test patterns-base-update_test(aarch-64) patterns-openSUSE-update_test"
RDEPENDS:${PN} += "update-test-affects-package-manager update-test-interactive update-test-optional update-test-reboot-needed update-test-security update-test-trivial"

inherit rpm
