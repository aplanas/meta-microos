SUMMARY = "A Graphical GCOV Front-end"
DESCRIPTION = "LCOV is a graphical front-end for GCC's coverage testing tool gcov. It collects \
gcov data for multiple source files and creates HTML pages containing the \
source code annotated with coverage information. It also adds overview pages \
for easy navigation within the file structure."
LICENSE = "GPL-2.0-or-later"

PV = "1.16+git.20220603.dfeb750"

RPM_NAME = "lcov-1.16+git.20220603.dfeb750-1.3.noarch.rpm"
RPM_HASH = "a9e0630e2c676288971eccc8b7d5a957b31e5e3799b43bb5fe696e3d9f3c2b5e5c9d99466be84012dfa75abffe0c535e0a6ab8eac2192df04148c540a986d2b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(lcov) lcov"
RDEPENDS:${PN} += "/usr/bin/perl findutils gcc perl-GD perl-PerlIO-gzip"

inherit rpm
