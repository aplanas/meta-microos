SUMMARY = "Translations for package gnome-getting-started-docs"
DESCRIPTION = "Provides translations for the 'gnome-getting-started-docs' package."
LICENSE = "CC-BY-SA-3.0"

PV = "3.38.1"

RPM_NAME = "gnome-getting-started-docs-lang-3.38.1-1.7.noarch.rpm"
RPM_HASH = "557ad09f49da9c4d20645cc5969d59e5cf2d408c3de9205abf484c846b7af08386a7ac9ef5d104d785a9957acb14c1194eaf74980dbb3bf4789a7f8e37b94982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-getting-started-docs-lang \
gnome-getting-started-docs-lang-all"
RDEPENDS:${PN} += "gnome-getting-started-docs"

inherit rpm
