SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-eradicate-2.1.0-1.4.noarch.rpm"
RPM_HASH = "63131766c9112e34b64905828cec1623bfb2e7246030d1054a2dcc750f95d1995ca9991d320d6b031b57dcd2bb9279243175c85ae56e7a8a057465b52d1d8b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(eradicate) python311-eradicate python3dist(eradicate)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
