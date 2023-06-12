SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-untokenize-0.1.1-2.15.noarch.rpm"
RPM_HASH = "cc928b07a24746c5355ead2bdf08f68d8be8fef3fe76f5a917fe6398de5a65bb418edf44544124cc800a79ca5f429bd0a599c9cf55bc0eeb2f5fef4010cf06c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-untokenize \
python3.10dist(untokenize) \
python310-untokenize \
python3dist(untokenize)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
