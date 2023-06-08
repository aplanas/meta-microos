SUMMARY = "Iosevka in monospace, Pragmata Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS08 typeface (monospace, Pragmata Pro \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss08-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "4b13c6bfa42c56afd3a488592dc1c307bfbbab657824e87ebc8b311ade7c2769d72f6b41be95ed0a8f8cedc6ad333416bc33418b4a06dfab45018606c340c194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss08-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
