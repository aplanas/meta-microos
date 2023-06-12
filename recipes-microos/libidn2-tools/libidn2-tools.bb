SUMMARY = "Command line utility to convert Int. Domain Names"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "GPL-3.0-or-later"

PV = "2.3.4"

RPM_NAME = "libidn2-tools-2.3.4-1.3.aarch64.rpm"
RPM_HASH = "ba2ba53fd6113a952f287443996fc30429bd924c334cc6ccd5d3dae5e5de77c4e05fa475bbc3790c42fe407e20842c537aae01ccb094a5b874a00b4a53018621"

RPROVIDES:${PN} += "libidn2-tools \
libidn2-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libidn2.so.0()(64bit) \
libidn2.so.0(IDN2_0.0.0)(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
