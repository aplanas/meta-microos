SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python311-py-moneyed-3.0-1.3.noarch.rpm"
RPM_HASH = "4c8478bae57880c8c241b4dda794603250e7792ea31f1d209075225a6f8c5615ad787cedd9bc1ec2454a077a0c90adb2557c05554707949e187ac23b05602efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(py-moneyed) python311-py-moneyed python3dist(py-moneyed)"
RDEPENDS:${PN} += "python(abi) python311-Babel python311-typing-extensions"

inherit rpm
