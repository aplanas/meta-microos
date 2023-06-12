SUMMARY = "Iosevka in monospace, Andale Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS01 typeface (monospace, Andale Mono style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss01-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "a08aba853c68bb7049424c9bab5ed8edb483b0b4ff00f2da0ce465197c2d82e5f5c530992fd2edf06224dd2dbbf7c8423051649e7dc1442a699e97b1a81b6232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss01-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
