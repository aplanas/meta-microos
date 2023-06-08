SUMMARY = "Iosevka in monospace, Liberation Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS06 typeface (monospace, Liberation Mono \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss06-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "bc0c457a45ebaac313ebaf62e9ad2029a243acb9075ac23121390382454f6f83ca40c5f6082fe948a01be55691435704381149c581163674cb3727b6603be865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss06-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
