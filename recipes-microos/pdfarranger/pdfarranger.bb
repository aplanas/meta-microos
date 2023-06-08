SUMMARY = "Merge, split, rotate, crop, and rearrange pages of PDF documents"
DESCRIPTION = "pdfarranger is a small python-gtk application, which helps the user \
to merge or split pdf documents and rotate, crop and rearrange their \
pages using a graphical interface. It is a frontend for pikepdf. \
 \
pdfarranger is a fork of Konstantinos Poulios’s pdfshuffler. It is \
a humble attempt to make the project a bit more active."
LICENSE = "GPL-3.0-only"

PV = "1.9.2"

RPM_NAME = "pdfarranger-1.9.2-1.2.noarch.rpm"
RPM_HASH = "b95d492f92b759f7647463b80a1aa886a28a7b72dabc0f092f5a3166dae287d4864d7a8daee8b3dc81f3c88efe3057fb18d67f99c2751f2998c5a3676713c772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(com.github.jeromerobert.pdfarranger.desktop) metainfo() metainfo(com.github.jeromerobert.pdfarranger.metainfo.xml) mimehandler(application/pdf) mimehandler(application/postscript) mimehandler(application/x-ext-pdf) mimehandler(image/bmp) mimehandler(image/gif) mimehandler(image/jp2) mimehandler(image/jpeg) mimehandler(image/jpg) mimehandler(image/png) mimehandler(image/tiff) mimehandler(image/vnd.zbrush.pcx) mimehandler(image/x-bmp) mimehandler(image/x-gray) mimehandler(image/x-ico) mimehandler(image/x-icon) mimehandler(image/x-pcx) mimehandler(image/x-png) mimehandler(image/x-portable-pixmap) pdfarranger python3.10dist(pdfarranger) python3dist(pdfarranger)"
RDEPENDS:${PN} += "/usr/bin/python3 gtk3 python(abi) python3-cairo python3-dateutil python3-gobject-Gdk python3-pikepdf typelib-1_0-Gtk-3_0 typelib-1_0-Poppler-0_18"

inherit rpm
