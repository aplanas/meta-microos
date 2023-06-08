SUMMARY = "RCSSmin is a CSS Minifier Written in Python"
DESCRIPTION = "rCSSmin is a CSS minifier written in python. \
 \
The minifier is based on the semantics of the YUI compressor, which \
itself is based on the rule list by Isaac Schlueter. \
 \
This module is a re-implementation aiming for speed instead of maximum \
compression, so it can be used at runtime (rather than during a \
preprocessing step). rCSSmin does syntactical compression only \
(removing spaces, comments and possibly semicolons). It does not \
provide semantic compression (like removing empty blocks, collapsing \
redundant properties etc). It does, however, support various CSS hacks \
(by keeping them working as intended)."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python311-rcssmin-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "1294ba66de9a8ee76161ff3cc3ada3ecc4daac56b04c017b9b582eb32c9c06497346a267b5cad93d98f6ad8dbacad9bd1f881ebc4052f89ebeb5bd0733244a4d"

RPROVIDES:${PN} += "python3.11dist(rcssmin) python311-rcssmin python311-rcssmin(aarch-64) python3dist(rcssmin)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
