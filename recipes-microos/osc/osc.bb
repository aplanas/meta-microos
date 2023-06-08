SUMMARY = "Command-line client for the Open Build Service"
DESCRIPTION = "OpenSUSE Commander is a command-line client for the Open Build Service. \
 \
See http://en.opensuse.org/openSUSE:OSC, as well as \
http://en.opensuse.org/openSUSE:Build_Service_Tutorial \
for a general introduction."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "osc-1.1.2-1.1.noarch.rpm"
RPM_HASH = "611abb79724efdfdab03a34ebc3328cd4d605e0f9bade77e4bfc933d0d54228056971000d65d90145b047a289b35c94a1a00f9ee0e66e62ced1acc0cdbc8da2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osc python3-osc python3.10dist(osc) python3dist(osc) rpm_macro(osc_plugin_dir)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 python(abi) python3-cryptography python3-rpm python3-urllib3"

inherit rpm
