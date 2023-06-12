SUMMARY = "Tests for the Update Stack"
DESCRIPTION = "Packages used for testing that the update stack works.  These tiny packages do not have any functionality themselves."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-update_test-20200505-41.1.aarch64.rpm"
RPM_HASH = "ea99a67a45da5833d98c41d6a262cd34f7fae0351aeff855113c10704b6b24d7af01c2fafa1c7f06e7304cdc403e046d8426e84a5babe944f30eb4f7ff8c89d6"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-update_test patterns-base-update_test(aarch-64) patterns-openSUSE-update_test"
RDEPENDS:${PN} += "update-test-affects-package-manager update-test-interactive update-test-optional update-test-reboot-needed update-test-security update-test-trivial"

inherit rpm
