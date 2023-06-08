SUMMARY = "Translations for package gnome-devel-docs"
DESCRIPTION = "Provides translations for the 'gnome-devel-docs' package."
LICENSE = "CC-BY-SA-4.0 & GFDL-1.1-only"

PV = "40.3"

RPM_NAME = "gnome-devel-docs-lang-40.3-1.6.noarch.rpm"
RPM_HASH = "e1bb7407fafaddb12d409cd94ed1179bfe939dd0af70ff3b5affdcfe529b9f1fee4c1da1ad0fa5f602a0a3046c1bd8ed04f338ef9a5ff4734fea2d59e0ae5012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-devel-docs-lang gnome-devel-docs-lang-all"
RDEPENDS:${PN} += "gnome-devel-docs"

inherit rpm
