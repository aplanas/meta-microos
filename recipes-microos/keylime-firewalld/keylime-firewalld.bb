SUMMARY = "Firewalld service file for keylime"
DESCRIPTION = "Subpackage of keylime for the firewalld XML service file."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-firewalld-7.0.0-2.1.noarch.rpm"
RPM_HASH = "1ac95ed4771fd7a1ff8c183dcd116cde763ef78b6ac6b9de9ffc0f51522a34779d885cc5dfb74f2110dfd251b9e7a0f46ffdf8654c985d1f478fc3c93c0c2fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-firewalld"
RDEPENDS:${PN} += "/bin/sh python3-keylime"

inherit rpm
