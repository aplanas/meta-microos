SUMMARY = "KIWI - Core host system dependencies"
DESCRIPTION = "This metapackage installs the necessary system dependencies \
to run KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-core-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "95b73f27401c03f2d37014f6607b7dd1df6b543cb938e6a3b9b63252b1bc6857851abf07a7bd7bb9b49c3489681da515d95f89e46c51ea5db53b658b4b3918ab"

RPROVIDES:${PN} += "kiwi-image-tbz-requires kiwi-image:tbz kiwi-packagemanager:dnf kiwi-packagemanager:microdnf kiwi-packagemanager:yum kiwi-packagemanager:zypper kiwi-systemdeps-core kiwi-systemdeps-core(aarch-64)"
RDEPENDS:${PN} += "cpio dnf kiwi-tools lsof microdnf mtools openssl rsync tar zypper"

inherit rpm
