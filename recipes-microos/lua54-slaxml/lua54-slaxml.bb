SUMMARY = "SAX-like streaming XML parser for Lua"
DESCRIPTION = "SLAXML is a pure-Lua SAX-like streaming XML parser. It is more \
robust than many (simpler) pattern-based parsers that exist \
(such as mine), properly supporting code like \
<expr test='5 > 7' />, CDATA nodes, comments, namespaces, and \
processing instructions. \
 \
It is currently not a truly valid XML parser, however, as \
it allows certain XML that is syntactically-invalid (not \
well-formed) to be parsed without reporting an error."
LICENSE = "MIT"

PV = "0.7+git20191225.108970c"

RPM_NAME = "lua54-slaxml-0.7+git20191225.108970c-3.1.noarch.rpm"
RPM_HASH = "afcd36d5a8e0e8d1bfccce825bf44ce745808385832c410bcff8aedf4f4e4880390f60629122be5e2974ff13dd888c52319e19e80cae083965820018f200dd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-slaxml lua54-slaxml"
RDEPENDS:${PN} += "lua54"

inherit rpm
