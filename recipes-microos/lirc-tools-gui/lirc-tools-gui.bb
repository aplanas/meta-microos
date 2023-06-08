SUMMARY = "LIRC GUI tools"
DESCRIPTION = "Some seldom used X11-based tools for debugging lirc configurations."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-tools-gui-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "d2b4e0a147488c4613c3fb010c3561e50c4697ab78a731396209526951047ec0e5ce7ad7fcafe95c24b5223d011409f09d6455327bb93f4b611f1c30b4762150"

RPROVIDES:${PN} += "lirc-tools-gui lirc-tools-gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) liblirc.so.0()(64bit) liblirc_client.so.0()(64bit) lirc-core xorg-x11-fonts-core"

inherit rpm
