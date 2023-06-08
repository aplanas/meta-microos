SUMMARY = "A Python implementation of the JSON5 data format"
DESCRIPTION = "A Python implementation of the JSON5 data format. \
 \
JSON5 extends the JSON data interchange format to make it \
slightly more usable as a configuration language: \
 \
  * JavaScript-style comments (both single and multi-line) are legal. \
  * Object keys may be unquoted if they are legal ECMAScript identifiers \
  * Objects and arrays may end with trailing commas. \
  * Strings can be single-quoted, and multi-line string literals are allowed."
LICENSE = "Apache-2.0"

PV = "0.9.13"

RPM_NAME = "python311-json5-0.9.13-1.2.noarch.rpm"
RPM_HASH = "91134a2cfe1ef34372ac4ee00ec932a5b251a7d48088af4620455b424066abc3c1d1916792f03fee6bd077cc28c7a5bfd50d6f37b34da335644ef296ab137523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(json5) python311-json5 python3dist(json5)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-setuptools"

inherit rpm
