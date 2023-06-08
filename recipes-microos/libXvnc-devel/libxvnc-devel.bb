SUMMARY = "X extension to control VNC module"
DESCRIPTION = "Xvnc extension allows X clients to read and change VNC configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "libXvnc-devel-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "8029721f9d81ae41f341e774e1247f788e71ac36c3cb426ea429908c850c6a1349aae89e0daf7a15911f51adb751779877be6c76d9e819e4e29959e907cd7ca1"

RPROVIDES:${PN} += "libXvnc-devel libXvnc-devel(aarch-64)"
RDEPENDS:${PN} += "libXvnc1"

inherit rpm
