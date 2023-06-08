SUMMARY = "Guile bindings to lzlib"
DESCRIPTION = "This package provides Guile bindings to lzlib, a data compression library \
providing in-memory LZMA compression and decompression."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.2"

RPM_NAME = "guile-lzlib-0.0.2-1.8.aarch64.rpm"
RPM_HASH = "1a16551f96ee21d590c0c6747aca0e7d978fc6ef2d83108a925a7aa0ea037634c705b835bcfaf24c0fa322ae7f84eb196aa684be20fab30ac2aab819b81336b1"

RPROVIDES:${PN} += "guile-lzlib guile-lzlib(aarch-64)"
RDEPENDS:${PN} += "guile lzlib-devel"

inherit rpm
