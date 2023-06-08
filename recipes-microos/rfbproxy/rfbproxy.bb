SUMMARY = "Record or play back a VNC session"
DESCRIPTION = "rfbproxy is a simple proxy for VNC which allows recording of screen \
updates, key presses and mouse events for later replay. \
 \
 \
 \
Authors: \
-------- \
    Tim Waugh <twaugh@redhat.com>"
LICENSE = "GPL-2.0+"

PV = "1.1.0"

RPM_NAME = "rfbproxy-1.1.0-52.26.aarch64.rpm"
RPM_HASH = "911c70c67011309740c7bce8ceefb9b9bf1f2dd357f5def2830ae01a66812f360dba9aee1497969311236d06767f104a02c7e13e273931057e4122a49968e0fc"

RPROVIDES:${PN} += "rfbproxy rfbproxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
