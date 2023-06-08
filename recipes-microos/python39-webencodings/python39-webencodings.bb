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

RPM_NAME = "python39-webencodings-0.5.1-5.1.noarch.rpm"
RPM_HASH = "c53949457b7e0070a3a14321de490a92f48c2946a761180e91d72277a24f192ec871f7193edb30b69263b61bb014593b6a64c477812641164e386afbbe633d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(webencodings) python39-webencodings python3dist(webencodings)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
