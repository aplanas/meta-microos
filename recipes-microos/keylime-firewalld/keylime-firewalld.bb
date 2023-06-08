SUMMARY = "Firewalld service file for keylime"
DESCRIPTION = "Subpackage of keylime for the firewalld XML service file."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-firewalld-7.0.0-1.1.noarch.rpm"
RPM_HASH = "a627b82eb7956dcbb4186246ca6ca9ae75c045fe68088a4db05d0299e25ea5d0c0e54097b6dfedcdfa0f3295f787b91737d36a2977adc390a6b0c471f5c008a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-firewalld"
RDEPENDS:${PN} += "/bin/sh python3-keylime"

inherit rpm
