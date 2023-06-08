SUMMARY = "Cisco-like telnet command-line library"
DESCRIPTION = "libcli provides a shared library for including a Cisco-like command-line \
interface into other software. It's a telnet interface which supports \
command-line editing, history, authentication and callbacks for a \
user-definable function tree."
LICENSE = "LGPL-2.1-only"

PV = "1.10.7+git.20211009"

RPM_NAME = "libcli-devel-1.10.7+git.20211009-1.5.aarch64.rpm"
RPM_HASH = "b1f433625e40ba09ab6a8e4555c8ae4295b79e56d77540a520e4ad3b64accadc399bafd96eabe8b2d06fdf7a7e402e5b630f069b7f007ecb5fb9afd6d5667b26"

RPROVIDES:${PN} += "libcli-devel libcli-devel(aarch-64)"
RDEPENDS:${PN} += "libcli1_10"

inherit rpm
