SUMMARY = "Character encoding aliases for legacy web content"
DESCRIPTION = "This is a Python implementation of the WHATWG Encoding standard. \
 \
In order to be compatible with legacy web content when interpreting \
something like Content-Type: text/html; charset=latin1, tools need to \
use a particular set of aliases for encoding labels as well as some \
overriding rules. For example, US-ASCII and iso-8859-1 on the web are \
actually aliases for windows-1252, and an UTF-8 or UTF-16 BOM takes \
precedence over any other encoding declaration. The Encoding standard \
defines all such details so that implementations do not have to \
reverse-engineer each other. \
 \
This module has encoding labels and BOM detection, but the actual \
implementation for encoders and decoders is Python’s."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python311-webencodings-0.5.1-5.1.noarch.rpm"
RPM_HASH = "cab00aa274e2abc58fde649a09b52d948d75ac2b72cd1b8c32bd2c3402a060b1f2f993e04576985ce6bd7f034b0b1a8a487b5cf48e2f669439cb79cfd7cd74b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(webencodings) \
python311-webencodings \
python3dist(webencodings)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
