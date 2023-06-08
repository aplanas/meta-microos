SUMMARY = "Translations for package gnome-user-docs"
DESCRIPTION = "Provides translations for the 'gnome-user-docs' package."
LICENSE = "CC-BY-3.0"

PV = "44.1"

RPM_NAME = "gnome-user-docs-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "66cbdc3b802dfa3976c1bd9547d788d8a0dc3229f13f6a0f666c8e217f51bab08e2b996ee4328c9d23ddb699a115731382422954de96b5652eb65ddb0b3c730d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-user-docs-lang gnome-user-docs-lang-all"
RDEPENDS:${PN} += "gnome-user-docs"

inherit rpm
