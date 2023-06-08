SUMMARY = "Development files for libwpd, a library for importing WordPerfect documents"
DESCRIPTION = "libwpd is a general purpose library for reading (or, interpreting data \
from) WordPerfect files. The library is not a stand-alone utility: it \
is designed to be used by another program (e.g.: a word processor) as \
an in-process component."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-devel-0.10.3-3.8.aarch64.rpm"
RPM_HASH = "b03f36847e58f5d5c664af485af468a3a060156900e95c93cc65f4d5223b896aab867f3da448a09c9756567dbc2e6c557b43463a91e7a9535d7579fc58b8c3f4"

RPROVIDES:${PN} += "libwpd-devel libwpd-devel(aarch-64) pkgconfig(libwpd-0.10)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libstdc++-devel libwpd-0_10-10 pkgconfig(librevenge-0.0)"

inherit rpm
