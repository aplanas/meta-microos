SUMMARY = "A tool to analyze multi-byte xor cipher"
DESCRIPTION = "A tool to do some xor analysis: \
 * Guess the key length (based on count of equal chars). \
 * Guess the key (base on knowledge of most frequent char)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "xortool-1.0.0-1.2.noarch.rpm"
RPM_HASH = "c85d3a0afa7c5e1cba9b3a67a5133ee835f19f4dd9ea298789089413a858666a324147ad053f114acd4381aa0df50b5ee71725ad84ed72bfb48040919c4c6102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(xortool) \
python3dist(xortool) \
xortool"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.10 \
python(abi) \
python3-docopt"

inherit rpm
