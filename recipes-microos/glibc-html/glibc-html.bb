SUMMARY = "HTML Documentation for the GNU C Library"
DESCRIPTION = "This package contains the HTML documentation for the GNU C library. Due \
to a lack of resources, this documentation is not complete and is \
partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-html-2.37-3.1.noarch.rpm"
RPM_HASH = "66b16457f9f42b08694a1429830f47bd54ac7b3397dc6e3ee7d4d54200f29986a6a1dc8f1f1b5634dc577b227bc049e33e7240ac5c60fcf8cb90403f53883d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-html"
RDEPENDS:${PN} += ""

inherit rpm
