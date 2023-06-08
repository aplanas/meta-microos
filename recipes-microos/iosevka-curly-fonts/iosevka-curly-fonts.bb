SUMMARY = "Iosevka in monospace curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly typeface (curly style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-curly-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "729d9ee0ecbdc150fa06c16ac800a486069b487c375b4e45ac86e887e1ac19eebf5a5f80db18d8d1a8045676fc177e5bcb11b4135ad1fd26358886a2b02b2b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
