SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "python39-mrcfile-1.4.3-2.1.noarch.rpm"
RPM_HASH = "26aa240e4fb64048e07cd3e46a63be75be0e26c029dde44e8eb827ea11a04b7310d08f41ca9cf836d5fb7e074cbba1b575e90297a7a9bce91f971f2b3365b7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mrcfile) python39-mrcfile python3dist(mrcfile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-numpy update-alternatives"

inherit rpm
