SUMMARY = "TrueType Font Engine"
DESCRIPTION = "A library for working with TrueType Fonts. Documentation is in the \
/usr/share/doc/packages/freetype directory."
LICENSE = "SUSE-Freetype | GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libttf2-1.3.1-1419.12.aarch64.rpm"
RPM_HASH = "05e0974795e2f26dc7f5c2f1eeac16d3d89cabc6b47f96c72b0b23e887d575c86d59164573fe82d9e9528391f4906266e39fd1cb0ab7b038084ab980de5b3752"

RPROVIDES:${PN} += "libttf.so.2()(64bit) \
libttf2 \
libttf2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
