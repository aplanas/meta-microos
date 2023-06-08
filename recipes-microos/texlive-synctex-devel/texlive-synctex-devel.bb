SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "This package includes the synctex development files. \
The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "texlive-synctex-devel-1.21-89.1.aarch64.rpm"
RPM_HASH = "7f09e0a68f8389bf18cd206846f433e7b2e606c740c2db394786287af0a77ff49816f609e8e2b0b51374442911a5ca8ac4decbe0d4380ae145ac9387effd631d"

RPROVIDES:${PN} += "pkgconfig(synctex) texlive-synctex-devel texlive-synctex-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsynctex2 pkgconfig(zlib)"

inherit rpm
