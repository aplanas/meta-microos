SUMMARY = "Iosevka in monospace, Menlo style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS04 typeface (monospace, Menlo style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss04-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "c85cfdacaaa3c631ffe0cc84a7a176d985f80408eb7dcce53e454f443c80969d3005aadeb9c0cfc64502e4e9dddfbdc7df76dd9cec4f4b3e321c42660d4a13a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss04-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
