SUMMARY = "KDE Plasma 5 Desktop Base"
DESCRIPTION = "Base packages for the KDE Plasma 5 desktop environment."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_plasma-20230403-1.1.noarch.rpm"
RPM_HASH = "c575d6f16cd0dca45b951ba9b5f4e22eac231221a5dacab786dc302a7c0f6bd9f1756e88f706557146438fc74a1b63c72fb638b06dcc5dd3b0de43a667b59d8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-kde-kde_plasma patterns-openSUSE-kde4_basis patterns-openSUSE-kde_plasma patterns-openSUSE-plasma5_basis"
RDEPENDS:${PN} += "breeze5-cursors breeze5-decoration breeze5-icons breeze5-style desktop-data pattern() plasma5-session polkit-default-privs qqc2-desktop-style xdg-user-dirs"

inherit rpm
