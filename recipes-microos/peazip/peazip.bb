SUMMARY = "Graphical file archiver"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
 \
Create: 7Z, ARC, BZ2, GZ, *PAQ, PEA, QUAD/BALZ, TAR, UPX, WIM, XZ, ZIP files \
 \
Extract 150+ archive types: ACE, ARJ, CAB, DMG, ISO, LHA, RAR, UDF, ZIPX and more \
 \
It can extract, create and convert multiple archives at once, \
create self-extracting archives, split/join files, supports strong encryption with two-factor authentication, \
has an encrypted password manager, secure deletion, can find duplicate files, calculate hashes, and \
export job definition as a script."
LICENSE = "LGPL-3.0-only"

PV = "9.2.0"

RPM_NAME = "peazip-9.2.0-1.1.aarch64.rpm"
RPM_HASH = "73cee8716a2338bc03289b6e01495714322541fbd059430864d5921d49ea9240c4ba269551c83748b5336aabfcf4e624a73859e8f530af9a54ca90aeb8ff23dd"

RPROVIDES:${PN} += "application() application(peazip.desktop) mimehandler(application/x-7z) mimehandler(application/x-ace) mimehandler(application/x-arc) mimehandler(application/x-archive) mimehandler(application/x-arj) mimehandler(application/x-bzip) mimehandler(application/x-bzip2) mimehandler(application/x-compress) mimehandler(application/x-cpio) mimehandler(application/x-deb) mimehandler(application/x-gzip) mimehandler(application/x-jar) mimehandler(application/x-lha) mimehandler(application/x-rar) mimehandler(application/x-tar) mimehandler(application/x-tarz) mimehandler(application/x-tbz) mimehandler(application/x-tbz2) mimehandler(application/x-tgz) mimehandler(application/x-zip) mimehandler(application/zip) peazip peazip(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libQt5Pas.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) p7zip-full upx"

inherit rpm
