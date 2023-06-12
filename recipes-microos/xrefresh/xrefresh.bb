SUMMARY = "Utility to refresh all or part of an X screen"
DESCRIPTION = "Xrefresh is a simple X program that causes all or part of your screen \
to be repainted. This is useful when system messages have messed up \
your screen."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xrefresh-1.0.7-2.3.aarch64.rpm"
RPM_HASH = "beb7d66ac5bbc899d146b769ed2a109a068a9562e015d1bc71cbc25c58627e38c71ecfff8ea59557520338483d5fe2c8e4a57c836f83bebaae7ef26a2b4064d4"

RPROVIDES:${PN} += "application() \
application(xrefresh.desktop) \
xrefresh \
xrefresh(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
