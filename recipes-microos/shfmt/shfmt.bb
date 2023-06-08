SUMMARY = "A shell parser, formatter, and interpreter with bash support; includes shfmt"
DESCRIPTION = "A shell parser, formatter, and interpreter. Supports POSIX Shell, Bash, and mksh."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "shfmt-3.5.1-1.5.aarch64.rpm"
RPM_HASH = "1f3e814f9100028d157352e550ac6f20b82360bbc5873bbaec036b0515227c180c54df6184edc6f77c666ea6dfcc490d27eaffb34947cc5cc82e83e05fb5be72"

RPROVIDES:${PN} += "shfmt shfmt(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
