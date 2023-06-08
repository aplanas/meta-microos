SUMMARY = "Documentation files for unzip"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-doc-6.00-41.3.noarch.rpm"
RPM_HASH = "806034537084408bd8c9ac620fe322657eb60e2ce88a0d08861efdfc8c3189264e8a289116f7b0b08fe91e16fd72acb3e67dfccf27aaf1e03d55cde2650f86c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unzip-doc"
RDEPENDS:${PN} += ""

inherit rpm
