SUMMARY = "Image viewer and browser utility -- Development Files"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "pix-devel-2.8.0-1.11.aarch64.rpm"
RPM_HASH = "0952203f69d1d103b51e5b409644b53c38b97f0091e881cd176ef2fea6249a1701f8c6f9f5c927446abc31968263b4af40358e8aecd975138e78191dc449564b"

RPROVIDES:${PN} += "pix-devel pix-devel(aarch-64) pkgconfig(pix-2.8)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pix pkgconfig(gtk+-3.0)"

inherit rpm
