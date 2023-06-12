SUMMARY = "Nemo extension to mass resize or rotate images"
DESCRIPTION = "This package adds a 'Resize Images...' menu item to the context \
menu of all images. This opens a dialog where you set the desired \
image size and file name. A click on 'Resize' finally resizes the \
image(s) using ImageMagick's convert tool."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-image-converter-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "a0d2ee20652a1c9c1dd4a21fa5ab45524b9dbdfa5f3c3aaef3ddeae0833353636db315e334f3f2e987e3082cc8edc464e1ded0d8efeac381e576be0f5b26c743"

RPROVIDES:${PN} += "nemo-extension-image-converter \
nemo-extension-image-converter(aarch-64) \
nemo-image-converter"
RDEPENDS:${PN} += "/sbin/ldconfig \
ImageMagick \
nemo"

inherit rpm
