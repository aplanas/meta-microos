SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "This package includes the synctex development files. \
The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "texlive-synctex-devel-1.21-91.1.aarch64.rpm"
RPM_HASH = "4a9f0f1ba8a587019eec8c9afd21c03fa4ac39fa80ecd943b2d6235098b6593fc7824d2e64c357c90739f2860cf260ee649f4120ceb778fded52e2b1d9fb1106"

RPROVIDES:${PN} += "pkgconfig(synctex) texlive-synctex-devel texlive-synctex-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsynctex2 pkgconfig(zlib)"

inherit rpm
