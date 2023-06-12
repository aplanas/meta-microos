SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.8.5"

RPM_NAME = "python39-easy-thumbnails-2.8.5-1.4.noarch.rpm"
RPM_HASH = "a956520c989173c9495d759ea54f89207d958fee163e31c687f242dc928cc4bd55c9ad4317be7b5dd5bfe2c75d7e35588aa9279ff7c2a402b68aba1ce5ee7820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(easy-thumbnails) \
python39-easy-thumbnails \
python3dist(easy-thumbnails)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-Pillow \
python39-lxml \
python39-reportlab \
python39-svglib"

inherit rpm
