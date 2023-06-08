SUMMARY = "Taylor UUCP using xinetd"
DESCRIPTION = "Unix to Unix copy with xinetd setup instead of using modern systemd \
service units."
LICENSE = "GPL-2.0-or-later"

PV = "1.07"

RPM_NAME = "uucp-xinetd-1.07-4.3.aarch64.rpm"
RPM_HASH = "8c9f2799f7ee723b770cb14ccee43d93b7fc4026d323149679e220fa0c2c1c01e3e5f02dae80f42c882bfebc901b25c23a80755a2db5c792d8b4a2cff1ba80b3"

RPROVIDES:${PN} += "config(uucp-xinetd) uucp-xinetd uucp-xinetd(aarch-64)"
RDEPENDS:${PN} += "uucp xinetd"

inherit rpm
