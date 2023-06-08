SUMMARY = "Querying your filehandle's capabilities"
DESCRIPTION = "Perl's filehandles are implemented as a stack of layers, with the \
bottom-most usually doing the actual IO and the higher ones doing \
buffering, encoding/decoding or transformations. PerlIO::Layers allows you \
to query the filehandle's properties concerning these layers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.012"

RPM_NAME = "perl-PerlIO-Layers-0.012-1.17.aarch64.rpm"
RPM_HASH = "8cb5f509b099d76afbd49ea5dbb0a94cca28af4c2cebe583defac4a7befc5b1a22e0da6367fdb161d2c625494c87ab2ea9e6660e5344f8e592db5512f1e600b5"

RPROVIDES:${PN} += "perl(PerlIO::Layers) perl-PerlIO-Layers perl-PerlIO-Layers(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
