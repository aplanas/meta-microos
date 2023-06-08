SUMMARY = "Development files for vmime, an e-mail message library"
DESCRIPTION = "VMime is a C++ class library for working with RFC5322 and \
MIME-conforming messages (RFC2045–2049), as well as Internet \
messaging services like IMAP, POP or SMTP. \
 \
This subpackage contains the headers for the library's API."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.2.175"

RPM_NAME = "libvmime-devel-0.9.2.175-2.4.aarch64.rpm"
RPM_HASH = "3ceabb7d28a30279e3088aee6f7af23e2d36fb3d54a21eb1bbb3680509a10c29e8f9ae5f1d3d4c365462456e606e9e58e7b426c4b1ed84c0d7b9d57e32945d4a"

RPROVIDES:${PN} += "cmake(vmime) libvmime-devel libvmime-devel(aarch-64) pkgconfig(vmime)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvmime-suse5 pkgconfig(gnutls) pkgconfig(libgsasl)"

inherit rpm
