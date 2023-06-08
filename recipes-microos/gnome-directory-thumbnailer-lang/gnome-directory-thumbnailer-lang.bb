SUMMARY = "Translations for package gnome-directory-thumbnailer"
DESCRIPTION = "Provides translations for the 'gnome-directory-thumbnailer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11"

RPM_NAME = "gnome-directory-thumbnailer-lang-0.1.11-3.3.noarch.rpm"
RPM_HASH = "de055fd5277d1946efd9ac5b2dec1e0a4590de9832fbc5ac9c2735297f2b315480e30340ec33e253f19d08332689c12444204846f1b1c258b25f207b70a700b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-directory-thumbnailer-lang gnome-directory-thumbnailer-lang-all locale(gnome-directory-thumbnailer:bs) locale(gnome-directory-thumbnailer:cs) locale(gnome-directory-thumbnailer:da) locale(gnome-directory-thumbnailer:de) locale(gnome-directory-thumbnailer:el) locale(gnome-directory-thumbnailer:es) locale(gnome-directory-thumbnailer:fr) locale(gnome-directory-thumbnailer:fur) locale(gnome-directory-thumbnailer:hr) locale(gnome-directory-thumbnailer:hu) locale(gnome-directory-thumbnailer:id) locale(gnome-directory-thumbnailer:it) locale(gnome-directory-thumbnailer:lt) locale(gnome-directory-thumbnailer:nb) locale(gnome-directory-thumbnailer:nl) locale(gnome-directory-thumbnailer:oc) locale(gnome-directory-thumbnailer:pl) locale(gnome-directory-thumbnailer:pt) locale(gnome-directory-thumbnailer:pt_BR) locale(gnome-directory-thumbnailer:ru) locale(gnome-directory-thumbnailer:sk) locale(gnome-directory-thumbnailer:sl) locale(gnome-directory-thumbnailer:sr) locale(gnome-directory-thumbnailer:sr@latin) locale(gnome-directory-thumbnailer:sv) locale(gnome-directory-thumbnailer:tr)"
RDEPENDS:${PN} += "gnome-directory-thumbnailer"

inherit rpm
