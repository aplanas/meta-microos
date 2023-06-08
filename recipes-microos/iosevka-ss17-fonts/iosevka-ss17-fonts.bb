SUMMARY = "Iosevka in monospace, Recursive Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS17 typeface (monospace, Recursive Mono \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss17-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "f2af9d3d4c11412a74e64e2f0536fb582725a61f5cb30004e9e19172cb8216dfcea55e89b3754bf720e2265a633bfe546a9e2d27136a3d2698337afbd0752c59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss17-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
