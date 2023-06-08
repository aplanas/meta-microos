SUMMARY = "Wayland Clipboard Utilities"
DESCRIPTION = "This project implements two command-line Wayland clipboard utilities, wl-copy and wl-paste, that let you easily copy data between the clipboard and Unix pipes, sockets, files and so on."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-2.1.0-1.6.aarch64.rpm"
RPM_HASH = "d4db3079207b85c073339fe33f650929c277c91b19162087fbba9e3933cb4158cf43234862a5407e643e9002c38f805c7ec03b84eb1add23392e373d33129859"

RPROVIDES:${PN} += "wl-clipboard wl-clipboard(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
