SUMMARY = "User/System Xsession Desktop File"
DESCRIPTION = "This package contains the System desktop file which will cause \
the execution of a user provided $HOME/.xsession script or pick \
the system wide DM default set in /etc/sysconfig/displaymanager."
LICENSE = "MIT"

PV = "1.1.14"

RPM_NAME = "xdm-xsession-1.1.14-3.1.aarch64.rpm"
RPM_HASH = "c723d18443269c34e32dc6aff63454431d3a07aac854f1b992fe4248b1372a382b79afca664ddb47363f7dec78b70d82e9ea9ed3aa661aebadf0494eb8099daf"

RPROVIDES:${PN} += "xdm-xsession xdm-xsession(aarch-64)"
RDEPENDS:${PN} += "xdm"

inherit rpm
