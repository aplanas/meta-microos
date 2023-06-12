SUMMARY = "Iosevka in monospace, Pragmata Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS08 typeface (monospace, Pragmata Pro \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss08-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "ec85031f0aeac35681514a6c0c4a1432ffe286551fedc82a010a56fea0437b54bd3cb2355dee0e02cd8f18ba4f355aa6d6210f7d733846b6d363a4698f24bb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss08-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
