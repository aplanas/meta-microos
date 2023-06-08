SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.101"

RPM_NAME = "libstorage-ng-integration-tests-4.5.101-1.1.noarch.rpm"
RPM_HASH = "5760baa87fea3e1bcd33db09c83729d9f26b44d19f0b692b7800d5fd89b6e7a203a226fc1af69c8a4c5b4aeba317ef18c600bfa52cf60dfdca96408aae89cc7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"
RDEPENDS:${PN} += "/usr/bin/python3 libstorage-ng-python3 python(abi)"

inherit rpm
