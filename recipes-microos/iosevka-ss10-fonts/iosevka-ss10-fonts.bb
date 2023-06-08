SUMMARY = "Iosevka in monospace, Envy Code R style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS10 typeface (monospace, Envy Code R style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss10-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "e8c2b7bc32cf94b4ecd39b8fbb4d649aa05d787d763fd8dda9b5b2f75640588e6496983af987cc0f9b2a4495cb531a43682b69f26e37a3ea0310a82a13dc3855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss10-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
