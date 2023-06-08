SUMMARY = "Development package for libfilezilla"
DESCRIPTION = "Files needed for development with libfilezilla."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.1"

RPM_NAME = "libfilezilla-devel-0.41.1-1.3.aarch64.rpm"
RPM_HASH = "fbfc2fcac6600336e09d03ead487f69ee216253963e9605f6ca21ba6ec6ef27f11b659d54c51b083cd9251f4ac49fecf0add933b81c47e6ef021df1db3ac903b"

RPROVIDES:${PN} += "libfilezilla-devel libfilezilla-devel(aarch-64) pkgconfig(libfilezilla)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfilezilla35 pkgconfig(gnutls) pkgconfig(hogweed) pkgconfig(nettle)"

inherit rpm
