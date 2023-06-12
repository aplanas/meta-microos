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

RPM_NAME = "python39-rcssmin-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "9ec77ec2c102de3ee5c0b616c2786b4c5374515fd1004d94cc045fd52b3e27a43cd8f7c9b3ac90d8915d88e90027f2f1805e39e8f9f4244f27d2edff1d7e948e"

RPROVIDES:${PN} += "python3.9dist(rcssmin) \
python39-rcssmin \
python39-rcssmin(aarch-64) \
python3dist(rcssmin)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
