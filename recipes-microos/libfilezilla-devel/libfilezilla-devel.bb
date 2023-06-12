SUMMARY = "Development package for libfilezilla"
DESCRIPTION = "Files needed for development with libfilezilla."
LICENSE = "GPL-2.0-or-later"

PV = "0.42.2"

RPM_NAME = "libfilezilla-devel-0.42.2-1.1.aarch64.rpm"
RPM_HASH = "5c573788a59977c9ea9f09ec5296c165df1ebd305a4a13a3cebb6a069275b92ab330f5ac323ae953acbe99ac942c467a73c2f5b86cb3ce1a63e1ab0c8023d0e4"

RPROVIDES:${PN} += "libfilezilla-devel \
libfilezilla-devel(aarch-64) \
pkgconfig(libfilezilla)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfilezilla36 \
pkgconfig(gnutls) \
pkgconfig(hogweed) \
pkgconfig(nettle)"

inherit rpm
