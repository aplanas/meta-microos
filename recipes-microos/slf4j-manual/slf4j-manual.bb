SUMMARY = "Documents for slf4j"
DESCRIPTION = "Manual for slf4j."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-manual-1.7.36-4.1.noarch.rpm"
RPM_HASH = "96bb70a60a1e61e9bfaf37740e0dafef41d9f3b74cb39723a6b0c0884f1fd78203e31e2c4537983f216e514caa61469ee5b48696c255a8e5c4f5f5c290b74f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slf4j-manual"
RDEPENDS:${PN} += ""

inherit rpm
