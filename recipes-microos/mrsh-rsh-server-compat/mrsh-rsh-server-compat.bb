SUMMARY = "Rsh server compatibility package for mrlogind/mrshd"
DESCRIPTION = "This package provides rsh server compatibility for mrlogind/mrshd"
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-rsh-server-compat-2.12-13.3.aarch64.rpm"
RPM_HASH = "ea4363626d426bddeaf5da841c0f1cc3f8e69da44eb4ac1557b003ce8446265929537ca77c0d2ab6373c6cf2e9e1024db4db8671a5eecb300bdc9b7e96fa6b6b"

RPROVIDES:${PN} += "mrsh-rsh-server-compat mrsh-rsh-server-compat(aarch-64) rsh-server"
RDEPENDS:${PN} += "mrsh-server"

inherit rpm
