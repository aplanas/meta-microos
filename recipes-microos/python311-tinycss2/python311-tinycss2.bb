SUMMARY = "A tiny CSS parser"
DESCRIPTION = "tinycss2 is a low-level CSS parser and generator written in Python: \
it can parse strings, return objects representing tokens and blocks, \
and generate CSS strings corresponding to these objects. \
 \
Based on the CSS Syntax Level 3 specification, tinycss2 knows the \
grammar of CSS but doesn't know specific rules, properties or values \
supported in various CSS modules."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-tinycss2-1.2.1-3.1.noarch.rpm"
RPM_HASH = "367169abf8517c9f8899db697d713ddce777f7e13f8830516ac5dbab86c1321f51a715e9c01d2cd187bfa8fd42a6bd29af8200df4aacbedf51b6a6be58811c7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tinycss2) python311-tinycss2 python3dist(tinycss2)"
RDEPENDS:${PN} += "python(abi) python311-webencodings"

inherit rpm
