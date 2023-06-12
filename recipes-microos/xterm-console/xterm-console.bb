SUMMARY = "A Linux vt console look-alike xterm wrapper"
DESCRIPTION = "This package contains the basic X.Org terminal program."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "xterm-console-1.1-1.6.noarch.rpm"
RPM_HASH = "f8cb2304c2e0ab383c760266b57711bc213d9f9f0d7232a84b9f2a227cfe321492d0e29a0c4b252618a0a32b63558d7eef89141eb05aa2c57b39020d88eb3f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xterm-console"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
aaa_base \
coreutils \
fonts-config \
perl"

inherit rpm
