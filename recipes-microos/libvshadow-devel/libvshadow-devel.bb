SUMMARY = "Development files for libvshadow"
DESCRIPTION = "The libvshadow-devel package contains libraries and header files for \
developing applications that use libvshadow. \
 \
The package contains /usr/share/doc/packages/libvshadow: \
 \
* OSDFC 2012: Paper - Windowless Shadow Snapshots \
* OSDFC 2012: Slides - Windowless Shadow Snapshots"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow-devel-20221030-3.5.aarch64.rpm"
RPM_HASH = "c0d3a910974df1ab18833485f0536239e95c8dda87f1592666a0a91c10fd13f47a62a412d3ebeea88ac5e233ec270f853587f7b96f6a89054b8f8daa1fcca5d2"

RPROVIDES:${PN} += "libvshadow-devel libvshadow-devel(aarch-64) pkgconfig(libvshadow)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libvshadow1"

inherit rpm
