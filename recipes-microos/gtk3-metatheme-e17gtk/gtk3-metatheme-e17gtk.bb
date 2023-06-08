SUMMARY = "The Enlightenment GTK theme -- GTK+ 3 Support"
DESCRIPTION = "The dark GTK2/GTK3 theme with sharp corners, which is designed for use in \
Enlightenment and gives the elegant look of Enlightenment to GTK widgets. \
 \
This package contains the GTK+3 theme."
LICENSE = "GPL-3.0"

PV = "3.22.2"

RPM_NAME = "gtk3-metatheme-e17gtk-3.22.2-1.11.noarch.rpm"
RPM_HASH = "7b7400f41eb578cf2e536c2d37cf59c265776f41b9a80ad081c36467dd684c38140d0a53538253b369b3386a50d85e945284e989905621db61ccd92bded68df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-e17gtk"
RDEPENDS:${PN} += "gtk3 metatheme-e17gtk-common"

inherit rpm
