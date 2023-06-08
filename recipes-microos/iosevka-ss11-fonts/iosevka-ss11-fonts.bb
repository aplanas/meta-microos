SUMMARY = "Iosevka in monospace, X Windows Fixed style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS11 typeface (monospace, X Windows Fixed \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss11-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "29a456ac5bcf9fffa6a1e5ff0b34a67a808c3660246747e57c30eb6e1b2084ebf7d2817d57bb0db74380fbd87b56c5b03f7a71f2bf0993fa80ea8ca9fa756e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss11-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
