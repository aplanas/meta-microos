SUMMARY = "Matcha GTK+4 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK+4 themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "gtk4-metatheme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "ae2c0798bbbfdf896cb354b6bee92dbcd7d1b6adc3d1a29ccabc069444fc03e6ef85f2b40755b885ed4679bc4acbde4e8ee046d2671bb4957360fcaaccf0799c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-matcha"
RDEPENDS:${PN} += "gtk4 metatheme-matcha-common"

inherit rpm
