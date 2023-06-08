SUMMARY = "Documentation for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the documentation for the Single Sign On Framework's \
plugins."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signon-plugins-docs-8.60-2.18.noarch.rpm"
RPM_HASH = "538a13f00c14272c7015f6b4936cfe0f06f397fc79c67639321b906c94bb885ae2394263e722b41357c7f5df708626850203a85b284937cf5668f350932d1147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signon-plugins-docs"
RDEPENDS:${PN} += ""

inherit rpm
