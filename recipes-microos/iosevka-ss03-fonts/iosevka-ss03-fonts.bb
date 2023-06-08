SUMMARY = "Iosevka in monospace, Consolas style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS03 typeface (monospace, Consolas style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss03-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "4f19da2714a728ae56669bb95fda67619f9c0360cef2dcac742bba9b375e6b280e77505a38cf9617120d91d3d78d733f6eb1ebbd0650e91073c69505c22190fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss03-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
