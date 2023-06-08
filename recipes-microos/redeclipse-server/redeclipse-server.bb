SUMMARY = "The Red Eclipse server binary"
DESCRIPTION = "This package contains the server binary for the Red Eclipse game."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-server-2.0.0-4.5.aarch64.rpm"
RPM_HASH = "cf373f0eadfd722fd9d431c243d1aa2641526b8f5b9520412186548916e254e2516f74d9df3d60825853b096149d1d38942b227925e56e6aaee5f51514acd599"

RPROVIDES:${PN} += "redeclipse-server redeclipse-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh redeclipse-data"

inherit rpm
