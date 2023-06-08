SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-untokenize-0.1.1-2.15.noarch.rpm"
RPM_HASH = "e7df45e6e7b13bae11996de8741424e377be874ff658b98931659bee3c85072e78e6396353ecea63fa234a4eaf4c5b44c676af3611c451b88670576a5413a6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(untokenize) python39-untokenize python3dist(untokenize)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
