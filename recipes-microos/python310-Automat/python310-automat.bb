SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Automat-22.10.0-2.1.noarch.rpm"
RPM_HASH = "bcbdf83271fdbd10edd1c2b00444cc4e7d2b38579a794fcae47604b8668d4e8d86e82516dfe9a52a0f1b0256b280fe0df0fe2ffa231baccbfa8ae03c0d8bfb6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Automat \
python3.10dist(automat) \
python310-Automat \
python3dist(automat)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-attrs \
update-alternatives"

inherit rpm
