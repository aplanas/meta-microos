SUMMARY = "Iosevka in monospace, Fira Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS05 typeface (monospace, Fira Mono style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss05-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "9061b16a92c44bc954fd3465b168c3eedfb9500cd99aab07e7434d74216b8f38bc52e0287cb75fb059a65d2752b1403c1687377ddcaf66a6f65cdf7b1265a7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss05-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
