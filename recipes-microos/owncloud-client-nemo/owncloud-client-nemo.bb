SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Nemo file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "owncloud-client-nemo-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "db80827ad19bdbd594a76b4a158a5497f89381dcc79635e5860c05124de9161c83faeec41b3530f1694e5fa326f5144be17f11c0ff0ae148d49bdcbe33ef2424"

RPROVIDES:${PN} += "owncloud-client-nemo owncloud-client-nemo(aarch-64)"
RDEPENDS:${PN} += "nemo owncloud-client(aarch-64) python-nemo"

inherit rpm
