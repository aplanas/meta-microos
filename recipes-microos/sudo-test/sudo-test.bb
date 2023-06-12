SUMMARY = "Tests for the package"
DESCRIPTION = "Tests for fate#313276"
LICENSE = "ISC"

PV = "1.9.13p3"

RPM_NAME = "sudo-test-1.9.13p3-3.1.aarch64.rpm"
RPM_HASH = "e2dd87825d903d0b13956c36da3e5c3f65662bb0ba514068fb7478eec05cca0ca601d0adf0db27f0975c5f6fd8949e979046abe349330766f892b38710567a75"

RPROVIDES:${PN} += "sudo-test \
sudo-test(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
sudo"

inherit rpm
