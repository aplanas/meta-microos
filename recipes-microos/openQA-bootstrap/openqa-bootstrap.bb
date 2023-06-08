SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-bootstrap-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "29e4557332e5c89ccfce67233535f9165abe6199dce2121eb3b546e26ee5695cef9c92da157ce08ea09025d11273c50626c2d09586f655441d2cb5fdd0d4949c"

RPROVIDES:${PN} += "openQA-bootstrap openQA-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
