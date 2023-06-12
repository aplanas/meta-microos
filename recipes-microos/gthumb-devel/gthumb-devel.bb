SUMMARY = "An Image Viewer and Browser for GNOME - Development Files"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "gthumb-devel-3.12.2-3.3.aarch64.rpm"
RPM_HASH = "4c2efe94e7fbbd9a82e67878680bcf56042ee8a3495b12994cc8dd1036357bce48fc1ed1ca191ad8857b8a3b8d04af61241f49bffcaf4b9d1174f073966a58de"

RPROVIDES:${PN} += "gthumb-devel \
gthumb-devel(aarch-64) \
pkgconfig(gthumb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gthumb \
pkgconfig(gtk+-3.0)"

inherit rpm
