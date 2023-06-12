SUMMARY = "Development files for the Distributed Multihead X extension library"
DESCRIPTION = "libdmx is an interface to the DMX extension for X, which allows a \
single server to be set up as a proxy spanning multiple servers -- \
not unlike Xinerama across discrete physical machines. It can be \
reconfigured on the fly to change the layout, and it is presented as \
a single logical display to clients. \
 \
This package contains the development headers for the library found \
in libdmx1."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libdmx-devel-1.1.4-1.19.aarch64.rpm"
RPM_HASH = "b2527dd543d1708c48bbdab6a4015a520f38ebc2330acc89d63909be43a07ba7644db5c5e6a3ec44131635aa631679122278ce2fd26d2977d93755d3b479888d"

RPROVIDES:${PN} += "libdmx-devel \
libdmx-devel(aarch-64) \
pkgconfig(dmx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmx1 \
pkgconfig(dmxproto) \
pkgconfig(x11) \
pkgconfig(xext)"

inherit rpm
