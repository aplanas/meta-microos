SUMMARY = "A YAFFS file system parser and extractor"
DESCRIPTION = "A YAFFS file system parser and extractor writte in pure python. \
 \
Features: \
 - List and/or extract regular files, folders, symlinks, hard \
   links, and special device files \
 - Automatic detection and/or brute force of YAFFS build parameters \
   (page size, spare size, endianess, etc) \
 - Support for both big and little endian YAFFS file systems"
LICENSE = "MIT"

PV = "0.1+git.20160105"

RPM_NAME = "yaffshiv-0.1+git.20160105-1.9.noarch.rpm"
RPM_HASH = "00ffb87148b31223ad7bdeffabd14afac50cf15625b6942638f8452b8e27f364f3cfecf22e05e8495aed5be7af51e89b02be5172a87eb6bc58b021b10413ead9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(yaffshiv) python3dist(yaffshiv) yaffshiv"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
